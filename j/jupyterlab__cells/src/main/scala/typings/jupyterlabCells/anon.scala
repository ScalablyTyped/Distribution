package typings.jupyterlabCells

import typings.jupyterlabCells.jupyterlabCellsStrings.bounded
import typings.jupyterlabCells.jupyterlabCellsStrings.off
import typings.jupyterlabCells.jupyterlabCellsStrings.on
import typings.jupyterlabCells.jupyterlabCellsStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Level extends StObject {
    
    var level: Double
    
    var text: String
  }
  object Level {
    
    inline def apply(level: Double, text: String): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
  trait PartialIConfig extends StObject {
    
    var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
    
    var codeFolding: js.UndefOr[Boolean] = js.undefined
    
    var cursorBlinkRate: js.UndefOr[Double] = js.undefined
    
    var fontFamily: js.UndefOr[String | Null] = js.undefined
    
    var fontSize: js.UndefOr[Double | Null] = js.undefined
    
    var handlePaste: js.UndefOr[Boolean] = js.undefined
    
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    var lineHeight: js.UndefOr[Double | Null] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
    
    var matchBrackets: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rulers: js.UndefOr[js.Array[Double]] = js.undefined
    
    var showTrailingSpace: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var wordWrapColumn: js.UndefOr[Double] = js.undefined
  }
  object PartialIConfig {
    
    inline def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    extension [Self <: PartialIConfig](x: Self) {
      
      inline def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
      
      inline def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      inline def setCodeFoldingUndefined: Self = StObject.set(x, "codeFolding", js.undefined)
      
      inline def setCursorBlinkRate(value: Double): Self = StObject.set(x, "cursorBlinkRate", value.asInstanceOf[js.Any])
      
      inline def setCursorBlinkRateUndefined: Self = StObject.set(x, "cursorBlinkRate", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      inline def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      inline def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value*))
      
      inline def setShowTrailingSpace(value: Boolean): Self = StObject.set(x, "showTrailingSpace", value.asInstanceOf[js.Any])
      
      inline def setShowTrailingSpaceUndefined: Self = StObject.set(x, "showTrailingSpace", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
}
