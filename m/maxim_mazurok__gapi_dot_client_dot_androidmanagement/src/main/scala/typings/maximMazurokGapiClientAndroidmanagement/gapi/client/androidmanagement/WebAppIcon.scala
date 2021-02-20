package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppIcon extends StObject {
  
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
  implicit class WebAppIconMutableBuilder[Self <: WebAppIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
