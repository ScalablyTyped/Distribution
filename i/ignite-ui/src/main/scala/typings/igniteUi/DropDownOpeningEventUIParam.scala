package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownOpeningEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery DOM element which represents drop down list container.
    */
  var list: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownOpeningEventUIParam {
  
  inline def apply(): DropDownOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownOpeningEventUIParam]
  }
  
  extension [Self <: DropDownOpeningEventUIParam](x: Self) {
    
    inline def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
