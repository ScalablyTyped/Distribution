package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRow extends StObject {
  
  /**
    * The list of cells that constitute the row. Must have the same length as
    * columnHeaders for two-dimensional tables, a length of 1 for
    * one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[SchemaValue]] = js.native
}
object SchemaRow {
  
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  @scala.inline
  implicit class SchemaRowMutableBuilder[Self <: SchemaRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[SchemaValue]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: SchemaValue*): Self = StObject.set(x, "cells", js.Array(value :_*))
  }
}
