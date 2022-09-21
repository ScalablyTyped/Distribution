package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRow extends StObject {
  
  /**
    * The list of cells that constitute the row. Must have the same length as `columnHeaders` for two-dimensional tables, a length of 1 for one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaRow {
  
  inline def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  extension [Self <: SchemaRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaValue]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaValue*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
