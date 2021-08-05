package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogOpeningEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FilterDialogOpeningEventUIParam {
  
  inline def apply(): FilterDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogOpeningEventUIParam]
  }
  
  extension [Self <: FilterDialogOpeningEventUIParam](x: Self) {
    
    inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
