package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basis describes the base image portion (Note) of the DockerImage
  * relationship. Linked occurrences are derived from this or an equivalent
  * image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference,
  * e.g. a tag of the resource_url.
  */
@js.native
trait SchemaBasis extends js.Object {
  
  /**
    * Required. Immutable. The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  
  /**
    * Required. Immutable. The resource_url for the resource representing the
    * basis of associated occurrence images.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}
object SchemaBasis {
  
  @scala.inline
  def apply(): SchemaBasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasis]
  }
  
  @scala.inline
  implicit class SchemaBasisOps[Self <: SchemaBasis] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: SchemaFingerprint): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
  }
}
