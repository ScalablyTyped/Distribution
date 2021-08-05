package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectViewItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  var rows: js.Array[GetObjectViewItem]
}
object Rows {
  
  inline def apply(rows: js.Array[GetObjectViewItem]): Rows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setRows(value: js.Array[GetObjectViewItem]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: GetObjectViewItem*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
