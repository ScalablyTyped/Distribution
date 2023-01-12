package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the newly selected view.
    */
  var newSelectedView: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ViewChangedEventUIParam {
  
  inline def apply(): ViewChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setNewSelectedView(value: String): Self = StObject.set(x, "newSelectedView", value.asInstanceOf[js.Any])
    
    inline def setNewSelectedViewUndefined: Self = StObject.set(x, "newSelectedView", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
