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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bias extends StObject {
    
    var bias: js.UndefOr[Double] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
  }
  object Bias {
    
    @scala.inline
    def apply(): Bias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bias]
    }
    
    @scala.inline
    implicit class BiasMutableBuilder[Self <: Bias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: Position = js.native
    
    var to: Position = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: Position, to: Position): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
  @js.native
  trait PartialIConfig extends StObject {
    
    var autoClosingBrackets: js.UndefOr[Boolean] = js.native
    
    var codeFolding: js.UndefOr[Boolean] = js.native
    
    var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
    
    var dragDrop: js.UndefOr[Boolean] = js.native
    
    var electricChars: js.UndefOr[Boolean] = js.native
    
    var extraKeys: js.UndefOr[js.Any] = js.native
    
    var fixedGutter: js.UndefOr[Boolean] = js.native
    
    var foldGutter: js.UndefOr[Boolean] = js.native
    
    var fontFamily: js.UndefOr[String | Null] = js.native
    
    var fontSize: js.UndefOr[Double | Null] = js.native
    
    var gutters: js.UndefOr[js.Array[String]] = js.native
    
    var handlePaste: js.UndefOr[Boolean] = js.native
    
    var insertSpaces: js.UndefOr[Boolean] = js.native
    
    var keyMap: js.UndefOr[String] = js.native
    
    var lineHeight: js.UndefOr[Double | Null] = js.native
    
    var lineNumbers: js.UndefOr[Boolean] = js.native
    
    var lineSeparator: js.UndefOr[String | Null] = js.native
    
    var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
    
    var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
    
    var matchBrackets: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[String | IMode] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var rulers: js.UndefOr[js.Array[Double]] = js.native
    
    var scrollPastEnd: js.UndefOr[Boolean] = js.native
    
    var scrollbarStyle: js.UndefOr[String] = js.native
    
    var selectionPointer: js.UndefOr[Boolean | String] = js.native
    
    var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
    
    var smartIndent: js.UndefOr[Boolean] = js.native
    
    var styleActiveLine: js.UndefOr[Boolean | StyleActiveLine] = js.native
    
    var styleSelectedText: js.UndefOr[Boolean] = js.native
    
    var tabSize: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var wordWrapColumn: js.UndefOr[Double] = js.native
  }
  object PartialIConfig {
    
    @scala.inline
    def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    @scala.inline
    implicit class PartialIConfigMutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
      
      @scala.inline
      def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFoldingUndefined: Self = StObject.set(x, "codeFolding", js.undefined)
      
      @scala.inline
      def setCoverGutterNextToScrollbar(value: Boolean): Self = StObject.set(x, "coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverGutterNextToScrollbarUndefined: Self = StObject.set(x, "coverGutterNextToScrollbar", js.undefined)
      
      @scala.inline
      def setDragDrop(value: Boolean): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
      
      @scala.inline
      def setElectricChars(value: Boolean): Self = StObject.set(x, "electricChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectricCharsUndefined: Self = StObject.set(x, "electricChars", js.undefined)
      
      @scala.inline
      def setExtraKeys(value: js.Any): Self = StObject.set(x, "extraKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraKeysUndefined: Self = StObject.set(x, "extraKeys", js.undefined)
      
      @scala.inline
      def setFixedGutter(value: Boolean): Self = StObject.set(x, "fixedGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedGutterUndefined: Self = StObject.set(x, "fixedGutter", js.undefined)
      
      @scala.inline
      def setFoldGutter(value: Boolean): Self = StObject.set(x, "foldGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldGutterUndefined: Self = StObject.set(x, "foldGutter", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setGutters(value: js.Array[String]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
      
      @scala.inline
      def setGuttersVarargs(value: String*): Self = StObject.set(x, "gutters", js.Array(value :_*))
      
      @scala.inline
      def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      @scala.inline
      def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      @scala.inline
      def setKeyMap(value: String): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      @scala.inline
      def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSeparatorNull: Self = StObject.set(x, "lineSeparator", null)
      
      @scala.inline
      def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      @scala.inline
      def setLineWiseCopyCut(value: Boolean): Self = StObject.set(x, "lineWiseCopyCut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWiseCopyCutUndefined: Self = StObject.set(x, "lineWiseCopyCut", js.undefined)
      
      @scala.inline
      def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      @scala.inline
      def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      @scala.inline
      def setMode(value: String | IMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      @scala.inline
      def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value :_*))
      
      @scala.inline
      def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
      
      @scala.inline
      def setScrollbarStyle(value: String): Self = StObject.set(x, "scrollbarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarStyleUndefined: Self = StObject.set(x, "scrollbarStyle", js.undefined)
      
      @scala.inline
      def setSelectionPointer(value: Boolean | String): Self = StObject.set(x, "selectionPointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPointerUndefined: Self = StObject.set(x, "selectionPointer", js.undefined)
      
      @scala.inline
      def setShowCursorWhenSelecting(value: Boolean): Self = StObject.set(x, "showCursorWhenSelecting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCursorWhenSelectingUndefined: Self = StObject.set(x, "showCursorWhenSelecting", js.undefined)
      
      @scala.inline
      def setSmartIndent(value: Boolean): Self = StObject.set(x, "smartIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartIndentUndefined: Self = StObject.set(x, "smartIndent", js.undefined)
      
      @scala.inline
      def setStyleActiveLine(value: Boolean | StyleActiveLine): Self = StObject.set(x, "styleActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleActiveLineUndefined: Self = StObject.set(x, "styleActiveLine", js.undefined)
      
      @scala.inline
      def setStyleSelectedText(value: Boolean): Self = StObject.set(x, "styleSelectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSelectedTextUndefined: Self = StObject.set(x, "styleSelectedText", js.undefined)
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
}
