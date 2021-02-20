package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageButton extends StObject {
  
  /** The icon specified by an enum that indices to an icon provided by Chat API. */
  var icon: js.UndefOr[String] = js.native
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** The name of this image_button which will be used for accessibility. Default value will be provided if developers don't specify. */
  var name: js.UndefOr[String] = js.native
  
  /** The onclick action. */
  var onClick: js.UndefOr[OnClick] = js.native
}
object ImageButton {
  
  @scala.inline
  def apply(): ImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageButton]
  }
  
  @scala.inline
  implicit class ImageButtonMutableBuilder[Self <: ImageButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
