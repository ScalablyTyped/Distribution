package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogClosedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object FilterDialogClosedEventUIParam {
  
  inline def apply(): FilterDialogClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogClosedEventUIParam]
  }
  
  extension [Self <: FilterDialogClosedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
