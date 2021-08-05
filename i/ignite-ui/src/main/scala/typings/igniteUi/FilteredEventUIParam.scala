package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredEventUIParam extends StObject {
  
  /**
    * Used to obtain a jquery reference to the rendered filtered elements.
    */
  var elements: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FilteredEventUIParam {
  
  inline def apply(): FilteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredEventUIParam]
  }
  
  extension [Self <: FilteredEventUIParam](x: Self) {
    
    inline def setElements(value: js.Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
