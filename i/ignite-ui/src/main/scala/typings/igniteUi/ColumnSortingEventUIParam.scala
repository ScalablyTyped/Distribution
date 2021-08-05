package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortingEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the sorting direction.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Gets sorting expressions.
    */
  var newExpressions: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnSortingEventUIParam {
  
  inline def apply(): ColumnSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSortingEventUIParam]
  }
  
  extension [Self <: ColumnSortingEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setNewExpressions(value: js.Array[js.Any]): Self = StObject.set(x, "newExpressions", value.asInstanceOf[js.Any])
    
    inline def setNewExpressionsUndefined: Self = StObject.set(x, "newExpressions", js.undefined)
    
    inline def setNewExpressionsVarargs(value: js.Any*): Self = StObject.set(x, "newExpressions", js.Array(value :_*))
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
