package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  /** A form action will be triggered by this onclick if specified. */
  var action: js.UndefOr[FormAction] = js.undefined
  
  /** This onclick triggers an open link action if specified. */
  var openLink: js.UndefOr[OpenLink] = js.undefined
}
object OnClick {
  
  @scala.inline
  def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setOpenLink(value: OpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
