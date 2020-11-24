package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information regarding any resource causing the vulnerability such as
  * JavaScript sources, image, audio files, etc.
  */
@js.native
trait SchemaViolatingResource extends js.Object {
  
  /**
    * The MIME type of this resource.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * URL of this violating resource.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}
object SchemaViolatingResource {
  
  @scala.inline
  def apply(): SchemaViolatingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViolatingResource]
  }
  
  @scala.inline
  implicit class SchemaViolatingResourceOps[Self <: SchemaViolatingResource] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
  }
}
