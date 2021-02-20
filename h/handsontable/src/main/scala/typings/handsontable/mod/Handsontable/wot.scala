package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wot {
  
  @js.native
  trait CellCoords extends StObject {
    
    var col: Double = js.native
    
    var row: Double = js.native
  }
  object CellCoords {
    
    @scala.inline
    def apply(col: Double, row: Double): CellCoords = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellCoords]
    }
    
    @scala.inline
    implicit class CellCoordsMutableBuilder[Self <: CellCoords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CellRange extends StObject {
    
    var from: CellCoords = js.native
    
    var highlight: CellCoords = js.native
    
    var to: CellCoords = js.native
  }
  object CellRange {
    
    @scala.inline
    def apply(from: CellCoords, highlight: CellCoords, to: CellCoords): CellRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellRange]
    }
    
    @scala.inline
    implicit class CellRangeMutableBuilder[Self <: CellRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: CellCoords): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(value: CellCoords): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: CellCoords): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.top
    - typings.handsontable.handsontableStrings.bottom
    - typings.handsontable.handsontableStrings.left
    - typings.handsontable.handsontableStrings.top_left_corner
    - typings.handsontable.handsontableStrings.bottom_left_corner
  */
  trait OverlayType extends StObject
  object OverlayType {
    
    @scala.inline
    def bottom: typings.handsontable.handsontableStrings.bottom = "bottom".asInstanceOf[typings.handsontable.handsontableStrings.bottom]
    
    @scala.inline
    def bottom_left_corner: typings.handsontable.handsontableStrings.bottom_left_corner = "bottom_left_corner".asInstanceOf[typings.handsontable.handsontableStrings.bottom_left_corner]
    
    @scala.inline
    def left: typings.handsontable.handsontableStrings.left = "left".asInstanceOf[typings.handsontable.handsontableStrings.left]
    
    @scala.inline
    def top: typings.handsontable.handsontableStrings.top = "top".asInstanceOf[typings.handsontable.handsontableStrings.top]
    
    @scala.inline
    def top_left_corner: typings.handsontable.handsontableStrings.top_left_corner = "top_left_corner".asInstanceOf[typings.handsontable.handsontableStrings.top_left_corner]
  }
}
