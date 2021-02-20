package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetRow extends StObject {
  
  var cells: js.UndefOr[js.Array[SpreadsheetSheetRowCell]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SpreadsheetSheetRow {
  
  @scala.inline
  def apply(): SpreadsheetSheetRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRow]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowMutableBuilder[Self <: SpreadsheetSheetRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[SpreadsheetSheetRowCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: SpreadsheetSheetRowCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
