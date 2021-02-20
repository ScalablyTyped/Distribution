package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardAction extends StObject {
  
  /** The label used to be displayed in the action menu item. */
  var actionLabel: js.UndefOr[String] = js.native
  
  /** The onclick action for this action item. */
  var onClick: js.UndefOr[OnClick] = js.native
}
object CardAction {
  
  @scala.inline
  def apply(): CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardAction]
  }
  
  @scala.inline
  implicit class CardActionMutableBuilder[Self <: CardAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    @scala.inline
    def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
