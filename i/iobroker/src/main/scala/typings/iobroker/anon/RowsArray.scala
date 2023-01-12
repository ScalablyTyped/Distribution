package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowsArray extends StObject {
  
  var rows: js.Array[GetObjectListItem]
}
object RowsArray {
  
  inline def apply(rows: js.Array[GetObjectListItem]): RowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowsArray] (val x: Self) extends AnyVal {
    
    inline def setRows(value: js.Array[GetObjectListItem]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: GetObjectListItem*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
