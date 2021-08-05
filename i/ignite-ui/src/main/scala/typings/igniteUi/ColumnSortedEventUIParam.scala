package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortedEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the sorting direction.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the sorted expressions.
    */
  var expressions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnSortedEventUIParam {
  
  inline def apply(): ColumnSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSortedEventUIParam]
  }
  
  extension [Self <: ColumnSortedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setExpressions(value: js.Any): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
