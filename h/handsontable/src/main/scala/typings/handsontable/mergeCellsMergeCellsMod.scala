package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeCellsMergeCellsMod {
  
  @JSImport("handsontable/plugins/mergeCells/mergeCells", "MergeCells")
  @js.native
  open class MergeCells protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def clearCollections(): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def merge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit = js.native
    
    def mergeSelection(): Unit = js.native
    def mergeSelection(cellRange: typings.handsontable.rangeMod.default): Unit = js.native
    
    def unmerge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit = js.native
    
    def unmergeSelection(): Unit = js.native
    def unmergeSelection(cellRange: typings.handsontable.rangeMod.default): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var col: Double
    
    var colspan: Double
    
    var row: Double
    
    var rowspan: Double
  }
  object DetailedSettings {
    
    inline def apply(col: Double, colspan: Double, row: Double, rowspan: Double): DetailedSettings = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], colspan = colspan.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | js.Array[DetailedSettings]
}
