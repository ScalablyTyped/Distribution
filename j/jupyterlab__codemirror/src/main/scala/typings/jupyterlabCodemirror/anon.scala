package typings.jupyterlabCodemirror

import typings.codemirror.mod.Position
import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bias extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
  }
  object Bias {
    
    inline def apply(): Bias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bias]
    }
    
    extension [Self <: Bias](x: Self) {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Position
    
    var to: Position
  }
  object From {
    
    inline def apply(from: Position, to: Position): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
  trait PartialIConfig extends StObject {
    
    var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
    
    var codeFolding: js.UndefOr[Boolean] = js.undefined
    
    var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined
    
    var dragDrop: js.UndefOr[Boolean] = js.undefined
    
    var electricChars: js.UndefOr[Boolean] = js.undefined
    
    var extraKeys: js.UndefOr[js.Any] = js.undefined
    
    var fixedGutter: js.UndefOr[Boolean] = js.undefined
    
    var foldGutter: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String | Null] = js.undefined
    
    var fontSize: js.UndefOr[Double | Null] = js.undefined
    
    var gutters: js.UndefOr[js.Array[String]] = js.undefined
    
    var handlePaste: js.UndefOr[Boolean] = js.undefined
    
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    var keyMap: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double | Null] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var lineSeparator: js.UndefOr[String | Null] = js.undefined
    
    var lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined
    
    var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
    
    var matchBrackets: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String | IMode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rulers: js.UndefOr[js.Array[Double]] = js.undefined
    
    var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
    
    var scrollbarStyle: js.UndefOr[String] = js.undefined
    
    var selectionPointer: js.UndefOr[Boolean | String] = js.undefined
    
    var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
    
    var smartIndent: js.UndefOr[Boolean] = js.undefined
    
    var styleActiveLine: js.UndefOr[Boolean | StyleActiveLine] = js.undefined
    
    var styleSelectedText: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
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
      
      inline def setCoverGutterNextToScrollbar(value: Boolean): Self = StObject.set(x, "coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
      
      inline def setCoverGutterNextToScrollbarUndefined: Self = StObject.set(x, "coverGutterNextToScrollbar", js.undefined)
      
      inline def setDragDrop(value: Boolean): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
      
      inline def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
      
      inline def setElectricChars(value: Boolean): Self = StObject.set(x, "electricChars", value.asInstanceOf[js.Any])
      
      inline def setElectricCharsUndefined: Self = StObject.set(x, "electricChars", js.undefined)
      
      inline def setExtraKeys(value: js.Any): Self = StObject.set(x, "extraKeys", value.asInstanceOf[js.Any])
      
      inline def setExtraKeysUndefined: Self = StObject.set(x, "extraKeys", js.undefined)
      
      inline def setFixedGutter(value: Boolean): Self = StObject.set(x, "fixedGutter", value.asInstanceOf[js.Any])
      
      inline def setFixedGutterUndefined: Self = StObject.set(x, "fixedGutter", js.undefined)
      
      inline def setFoldGutter(value: Boolean): Self = StObject.set(x, "foldGutter", value.asInstanceOf[js.Any])
      
      inline def setFoldGutterUndefined: Self = StObject.set(x, "foldGutter", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setGutters(value: js.Array[String]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
      
      inline def setGuttersVarargs(value: String*): Self = StObject.set(x, "gutters", js.Array(value :_*))
      
      inline def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setKeyMap(value: String): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
      
      inline def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatorNull: Self = StObject.set(x, "lineSeparator", null)
      
      inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      inline def setLineWiseCopyCut(value: Boolean): Self = StObject.set(x, "lineWiseCopyCut", value.asInstanceOf[js.Any])
      
      inline def setLineWiseCopyCutUndefined: Self = StObject.set(x, "lineWiseCopyCut", js.undefined)
      
      inline def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      inline def setMode(value: String | IMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      inline def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      inline def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value :_*))
      
      inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
      
      inline def setScrollbarStyle(value: String): Self = StObject.set(x, "scrollbarStyle", value.asInstanceOf[js.Any])
      
      inline def setScrollbarStyleUndefined: Self = StObject.set(x, "scrollbarStyle", js.undefined)
      
      inline def setSelectionPointer(value: Boolean | String): Self = StObject.set(x, "selectionPointer", value.asInstanceOf[js.Any])
      
      inline def setSelectionPointerUndefined: Self = StObject.set(x, "selectionPointer", js.undefined)
      
      inline def setShowCursorWhenSelecting(value: Boolean): Self = StObject.set(x, "showCursorWhenSelecting", value.asInstanceOf[js.Any])
      
      inline def setShowCursorWhenSelectingUndefined: Self = StObject.set(x, "showCursorWhenSelecting", js.undefined)
      
      inline def setSmartIndent(value: Boolean): Self = StObject.set(x, "smartIndent", value.asInstanceOf[js.Any])
      
      inline def setSmartIndentUndefined: Self = StObject.set(x, "smartIndent", js.undefined)
      
      inline def setStyleActiveLine(value: Boolean | StyleActiveLine): Self = StObject.set(x, "styleActiveLine", value.asInstanceOf[js.Any])
      
      inline def setStyleActiveLineUndefined: Self = StObject.set(x, "styleActiveLine", js.undefined)
      
      inline def setStyleSelectedText(value: Boolean): Self = StObject.set(x, "styleSelectedText", value.asInstanceOf[js.Any])
      
      inline def setStyleSelectedTextUndefined: Self = StObject.set(x, "styleSelectedText", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
}
