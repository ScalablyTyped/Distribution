package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayoutGap extends StObject {
  
  var columns: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
}
object TileLayoutGap {
  
  @scala.inline
  def apply(): TileLayoutGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutGap]
  }
  
  @scala.inline
  implicit class TileLayoutGapMutableBuilder[Self <: TileLayoutGap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
