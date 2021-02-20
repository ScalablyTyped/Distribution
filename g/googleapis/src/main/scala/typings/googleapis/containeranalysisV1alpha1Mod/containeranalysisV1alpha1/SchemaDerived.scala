package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Derived describes the derived image portion (Occurrence) of the DockerImage
  * relationship.  This image would be produced from a Dockerfile with FROM
  * &lt;DockerImage.Basis in attached Note&gt;.
  */
@js.native
trait SchemaDerived extends StObject {
  
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
    * The fingerprint of the derived image.
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
  implicit class SchemaDerivedMutableBuilder[Self <: SchemaDerived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseResourceUrl(value: String): Self = StObject.set(x, "baseResourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseResourceUrlUndefined: Self = StObject.set(x, "baseResourceUrl", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setFingerprint(value: SchemaFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setLayerInfo(value: js.Array[SchemaLayer]): Self = StObject.set(x, "layerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfoUndefined: Self = StObject.set(x, "layerInfo", js.undefined)
    
    @scala.inline
    def setLayerInfoVarargs(value: SchemaLayer*): Self = StObject.set(x, "layerInfo", js.Array(value :_*))
  }
}
