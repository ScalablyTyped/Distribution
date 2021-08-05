package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the currently selected view.
    */
  var currentSelectedView: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the newly selected view.
    */
  var newSelectedView: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ViewChangingEventUIParam {
  
  inline def apply(): ViewChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewChangingEventUIParam]
  }
  
  extension [Self <: ViewChangingEventUIParam](x: Self) {
    
    inline def setCurrentSelectedView(value: String): Self = StObject.set(x, "currentSelectedView", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedViewUndefined: Self = StObject.set(x, "currentSelectedView", js.undefined)
    
    inline def setNewSelectedView(value: String): Self = StObject.set(x, "newSelectedView", value.asInstanceOf[js.Any])
    
    inline def setNewSelectedViewUndefined: Self = StObject.set(x, "newSelectedView", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
