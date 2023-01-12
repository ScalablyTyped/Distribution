package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMovingEventUIParam extends StObject {
  
  /**
    * Gets the column index of the column that was being moved.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column key of the column that was being moved.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the new column index of the column that was being moved.
    */
  var targetIndex: js.UndefOr[Double] = js.undefined
}
object ColumnMovingEventUIParam {
  
  inline def apply(): ColumnMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMovingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnMovingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetIndexUndefined: Self = StObject.set(x, "targetIndex", js.undefined)
  }
}
