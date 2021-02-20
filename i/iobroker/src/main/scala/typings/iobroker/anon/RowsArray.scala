package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsArray extends StObject {
  
  var rows: js.Array[GetObjectListItem] = js.native
}
object RowsArray {
  
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): RowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsArray]
  }
  
  @scala.inline
  implicit class RowsArrayMutableBuilder[Self <: RowsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[GetObjectListItem]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: GetObjectListItem*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
