package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageButton extends StObject {
  
  /** The icon specified by an enum that indices to an icon provided by Chat API. */
  var icon: js.UndefOr[String] = js.undefined
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The name of this image_button which will be used for accessibility. Default value will be provided if developers don't specify. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The onclick action. */
  var onClick: js.UndefOr[OnClick] = js.undefined
}
object ImageButton {
  
  inline def apply(): ImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageButton]
  }
  
  extension [Self <: ImageButton](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
