package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardAction extends StObject {
  
  /** The label used to be displayed in the action menu item. */
  var actionLabel: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[OnClick] = js.undefined
}
object CardAction {
  
  inline def apply(): CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardAction] (val x: Self) extends AnyVal {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
