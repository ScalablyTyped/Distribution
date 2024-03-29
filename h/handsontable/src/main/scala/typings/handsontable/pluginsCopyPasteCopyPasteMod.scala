package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsCopyPasteCopyPasteMod {
  
  @JSImport("handsontable/plugins/copyPaste/copyPaste", "CopyPaste")
  @js.native
  open class CopyPaste protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var columnsLimit: Double = js.native
    
    def copy(): Unit = js.native
    def copy(copyMode: CopyModeType): Unit = js.native
    
    def copyCellsOnly(): Unit = js.native
    
    def copyColumnHeadersOnly(): Unit = js.native
    
    def copyWithAllColumnHeaders(): Unit = js.native
    
    def copyWithColumnHeaders(): Unit = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.`cells-only`
    - typings.handsontable.handsontableStrings.`column-headers-only`
    - typings.handsontable.handsontableStrings.`with-all-column-headers`
    - typings.handsontable.handsontableStrings.`with-column-headers`
  */
  trait CopyModeType extends StObject
  object CopyModeType {
    
    inline def `cells-only`: typings.handsontable.handsontableStrings.`cells-only` = "cells-only".asInstanceOf[typings.handsontable.handsontableStrings.`cells-only`]
    
    inline def `column-headers-only`: typings.handsontable.handsontableStrings.`column-headers-only` = "column-headers-only".asInstanceOf[typings.handsontable.handsontableStrings.`column-headers-only`]
    
    inline def `with-all-column-headers`: typings.handsontable.handsontableStrings.`with-all-column-headers` = "with-all-column-headers".asInstanceOf[typings.handsontable.handsontableStrings.`with-all-column-headers`]
    
    inline def `with-column-headers`: typings.handsontable.handsontableStrings.`with-column-headers` = "with-column-headers".asInstanceOf[typings.handsontable.handsontableStrings.`with-column-headers`]
  }
  
  trait DetailedSettings extends StObject {
    
    var columnsLimit: js.UndefOr[Double] = js.undefined
    
    var copyColumnGroupHeaders: js.UndefOr[Boolean] = js.undefined
    
    var copyColumnHeaders: js.UndefOr[Boolean] = js.undefined
    
    var copyColumnHeadersOnly: js.UndefOr[Boolean] = js.undefined
    
    var pasteMode: js.UndefOr[PasteModeType] = js.undefined
    
    var rowsLimit: js.UndefOr[Double] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnsLimit(value: Double): Self = StObject.set(x, "columnsLimit", value.asInstanceOf[js.Any])
      
      inline def setColumnsLimitUndefined: Self = StObject.set(x, "columnsLimit", js.undefined)
      
      inline def setCopyColumnGroupHeaders(value: Boolean): Self = StObject.set(x, "copyColumnGroupHeaders", value.asInstanceOf[js.Any])
      
      inline def setCopyColumnGroupHeadersUndefined: Self = StObject.set(x, "copyColumnGroupHeaders", js.undefined)
      
      inline def setCopyColumnHeaders(value: Boolean): Self = StObject.set(x, "copyColumnHeaders", value.asInstanceOf[js.Any])
      
      inline def setCopyColumnHeadersOnly(value: Boolean): Self = StObject.set(x, "copyColumnHeadersOnly", value.asInstanceOf[js.Any])
      
      inline def setCopyColumnHeadersOnlyUndefined: Self = StObject.set(x, "copyColumnHeadersOnly", js.undefined)
      
      inline def setCopyColumnHeadersUndefined: Self = StObject.set(x, "copyColumnHeaders", js.undefined)
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeType] (val x: Self) extends AnyVal {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
