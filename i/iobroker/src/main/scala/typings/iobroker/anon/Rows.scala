package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectViewItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows[T] extends StObject {
  
  var rows: js.Array[GetObjectViewItem[T]]
}
object Rows {
  
  inline def apply[T](rows: js.Array[GetObjectViewItem[T]]): Rows[T] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows[T]]
  }
  
  extension [Self <: Rows[?], T](x: Self & Rows[T]) {
    
    inline def setRows(value: js.Array[GetObjectViewItem[T]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: GetObjectViewItem[T]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
