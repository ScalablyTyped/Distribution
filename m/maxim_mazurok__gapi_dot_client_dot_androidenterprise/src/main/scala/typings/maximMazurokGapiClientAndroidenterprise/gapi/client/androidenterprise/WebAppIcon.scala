package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppIcon extends js.Object {
  
  /**
    * The actual bytes of the image in a base64url encoded string (c.f. RFC4648, section 5 "Base 64 Encoding with URL and Filename Safe Alphabet"). - The image type can be png or jpg. -
    * The image should ideally be square. - The image should ideally have a size of 512x512.
    */
  var imageData: js.UndefOr[String] = js.native
}
object WebAppIcon {
  
  @scala.inline
  def apply(): WebAppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppIcon]
  }
  
  @scala.inline
  implicit class WebAppIconOps[Self <: WebAppIcon] (val x: Self) extends AnyVal {
    
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
    def setImageData(value: String): Self = this.set("imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageData: Self = this.set("imageData", js.undefined)
  }
}
