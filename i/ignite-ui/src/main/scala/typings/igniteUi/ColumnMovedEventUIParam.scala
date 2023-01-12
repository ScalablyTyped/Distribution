package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMovedEventUIParam extends StObject {
  
  /**
    * Gets the column key of the column that was moved.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the new column index of the column that was being moved.
    */
  var newIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the previous column index of the column that was moved.
    */
  var oldIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ColumnMovedEventUIParam {
  
  inline def apply(): ColumnMovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMovedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnMovedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
