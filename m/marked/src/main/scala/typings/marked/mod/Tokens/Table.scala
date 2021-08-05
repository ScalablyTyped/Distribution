package typings.marked.mod.Tokens

import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.table
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table
  extends StObject
     with Token {
  
  var align: js.Array[center | left | right | Null]
  
  var cells: js.Array[js.Array[String]]
  
  var header: js.Array[String]
  
  var raw: String
  
  var `type`: table
}
object Table {
  
  inline def apply(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String
  ): Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setAlign(value: js.Array[center | left | right | Null]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignVarargs(value: (center | left | right | Null)*): Self = StObject.set(x, "align", js.Array(value :_*))
    
    inline def setCells(value: js.Array[js.Array[String]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: js.Array[String]*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
