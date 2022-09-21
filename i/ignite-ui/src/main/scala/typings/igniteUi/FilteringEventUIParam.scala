package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteringEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
    */
  var expression: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object FilteringEventUIParam {
  
  inline def apply(): FilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventUIParam]
  }
  
  extension [Self <: FilteringEventUIParam](x: Self) {
    
    inline def setExpression(value: Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
