package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Derived describes the derived image portion (Occurrence) of the DockerImage
  * relationship. This image would be produced from a Dockerfile with FROM
  * &lt;DockerImage.Basis in attached Note&gt;.
  */
@js.native
trait SchemaDerived extends js.Object {
  
  /**
    * Output only. This contains the base image URL for the derived image
    * occurrence.
    */
  var baseResourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Output only. The number of layers by which this image differs from the
    * associated image basis.
    */
  var distance: js.UndefOr[Double] = js.native
  
  /**
    * Required. The fingerprint of the derived image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  
  /**
    * This contains layer-specific metadata, if populated it has length
    * &quot;distance&quot; and is ordered with [distance] being the layer
    * immediately following the base image and [1] being the final layer.
    */
  var layerInfo: js.UndefOr[js.Array[SchemaLayer]] = js.native
}
object SchemaDerived {
  
  @scala.inline
  def apply(): SchemaDerived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerived]
  }
  
  @scala.inline
  implicit class SchemaDerivedOps[Self <: SchemaDerived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseResourceUrl(value: String): Self = this.set("baseResourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseResourceUrl: Self = this.set("baseResourceUrl", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setFingerprint(value: SchemaFingerprint): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setLayerInfoVarargs(value: SchemaLayer*): Self = this.set("layerInfo", js.Array(value :_*))
    
    @scala.inline
    def setLayerInfo(value: js.Array[SchemaLayer]): Self = this.set("layerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerInfo: Self = this.set("layerInfo", js.undefined)
  }
}
