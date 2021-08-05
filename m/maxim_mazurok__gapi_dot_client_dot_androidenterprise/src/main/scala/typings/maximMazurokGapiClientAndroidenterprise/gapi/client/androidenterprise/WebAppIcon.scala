package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAppIcon extends StObject {
  
  /**
    * The actual bytes of the image in a base64url encoded string (c.f. RFC4648, section 5 "Base 64 Encoding with URL and Filename Safe Alphabet"). - The image type can be png or jpg. -
    * The image should ideally be square. - The image should ideally have a size of 512x512.
    */
  var imageData: js.UndefOr[String] = js.undefined
}
object WebAppIcon {
  
  inline def apply(): WebAppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppIcon]
  }
  
  extension [Self <: WebAppIcon](x: Self) {
    
    inline def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
