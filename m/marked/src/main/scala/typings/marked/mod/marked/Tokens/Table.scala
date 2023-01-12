package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.table
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table
  extends StObject
     with Token {
  
  var align: js.Array[center | left | right | Null]
  
  var header: js.Array[TableCell]
  
  var raw: String
  
  var rows: js.Array[js.Array[TableCell]]
  
  var `type`: table
}
object Table {
  
  inline def apply(
    align: js.Array[center | left | right | Null],
    header: js.Array[TableCell],
    raw: String,
    rows: js.Array[js.Array[TableCell]]
  ): Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: js.Array[center | left | right | Null]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignVarargs(value: (center | left | right | Null)*): Self = StObject.set(x, "align", js.Array(value*))
    
    inline def setHeader(value: js.Array[TableCell]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderVarargs(value: TableCell*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[js.Array[TableCell]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: js.Array[TableCell]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
