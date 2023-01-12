package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1Image extends StObject {
  
  /** The alternative text of this image, used for accessibility. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** An image URL. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** The action triggered by an `onClick` event. */
  var onClick: js.UndefOr[GoogleAppsCardV1OnClick] = js.undefined
}
object GoogleAppsCardV1Image {
  
  inline def apply(): GoogleAppsCardV1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1Image] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: GoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
