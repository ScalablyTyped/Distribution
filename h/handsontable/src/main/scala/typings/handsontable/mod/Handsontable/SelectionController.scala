package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionController extends StObject {
  
  var cells: Boolean = js.native
  
  var column: Boolean = js.native
  
  var row: Boolean = js.native
}
object SelectionController {
  
  @scala.inline
  def apply(cells: Boolean, column: Boolean, row: Boolean): SelectionController = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionController]
  }
  
  @scala.inline
  implicit class SelectionControllerMutableBuilder[Self <: SelectionController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: Boolean): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
