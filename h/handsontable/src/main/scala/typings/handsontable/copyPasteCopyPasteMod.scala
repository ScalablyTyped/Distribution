package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyPasteCopyPasteMod {
  
  @JSImport("handsontable/plugins/copyPaste/copyPaste", "CopyPaste")
  @js.native
  open class CopyPaste protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var columnsLimit: Double = js.native
    
    def copy(): Unit = js.native
    
    def cut(): Unit = js.native
    
    def getRangedCopyableData(ranges: js.Array[RangeType]): String = js.native
    
    def getRangedData(ranges: js.Array[RangeType]): js.Array[js.Array[CellValue]] = js.native
    
    def isEnabled(): Boolean = js.native
    
    def paste(): Unit = js.native
    def paste(pastableText: String): Unit = js.native
    def paste(pastableText: String, pastableHtml: String): Unit = js.native
    def paste(pastableText: Unit, pastableHtml: String): Unit = js.native
    
    var pasteMode: String = js.native
    
    var rowsLimit: Double = js.native
    
    def setCopyableText(): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var columnsLimit: js.UndefOr[Double] = js.undefined
    
    var pasteMode: js.UndefOr[PasteModeType] = js.undefined
    
    var rowsLimit: js.UndefOr[Double] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setColumnsLimit(value: Double): Self = StObject.set(x, "columnsLimit", value.asInstanceOf[js.Any])
      
      inline def setColumnsLimitUndefined: Self = StObject.set(x, "columnsLimit", js.undefined)
      
      inline def setPasteMode(value: PasteModeType): Self = StObject.set(x, "pasteMode", value.asInstanceOf[js.Any])
      
      inline def setPasteModeUndefined: Self = StObject.set(x, "pasteMode", js.undefined)
      
      inline def setRowsLimit(value: Double): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
      
      inline def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.overwrite
    - typings.handsontable.handsontableStrings.shift_down
    - typings.handsontable.handsontableStrings.shift_right
  */
  trait PasteModeType extends StObject
  object PasteModeType {
    
    inline def overwrite: typings.handsontable.handsontableStrings.overwrite = "overwrite".asInstanceOf[typings.handsontable.handsontableStrings.overwrite]
    
    inline def shift_down: typings.handsontable.handsontableStrings.shift_down = "shift_down".asInstanceOf[typings.handsontable.handsontableStrings.shift_down]
    
    inline def shift_right: typings.handsontable.handsontableStrings.shift_right = "shift_right".asInstanceOf[typings.handsontable.handsontableStrings.shift_right]
  }
  
  trait RangeType extends StObject {
    
    var endCol: Double
    
    var endRow: Double
    
    var startCol: Double
    
    var startRow: Double
  }
  object RangeType {
    
    inline def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    extension [Self <: RangeType](x: Self) {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
