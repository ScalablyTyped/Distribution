package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCardCardAction extends StObject {
  
  /** The label that displays as the action menu item. */
  var actionLabel: js.UndefOr[String] = js.undefined
  
  /** The onclick action for this action item. */
  var onClick: js.UndefOr[AppsDynamiteSharedOnClick] = js.undefined
}
object AppsDynamiteSharedCardCardAction {
  
  inline def apply(): AppsDynamiteSharedCardCardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCardCardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedCardCardAction] (val x: Self) extends AnyVal {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: AppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
