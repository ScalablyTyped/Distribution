package typings.jupyterlabCodemirror.anon

import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
@js.native
trait PartialIConfig extends js.Object {
  
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
  implicit class PartialIConfigOps[Self <: PartialIConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoClosingBrackets(value: Boolean): Self = this.set("autoClosingBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClosingBrackets: Self = this.set("autoClosingBrackets", js.undefined)
    
    @scala.inline
    def setCodeFolding(value: Boolean): Self = this.set("codeFolding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeFolding: Self = this.set("codeFolding", js.undefined)
    
    @scala.inline
    def setCoverGutterNextToScrollbar(value: Boolean): Self = this.set("coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverGutterNextToScrollbar: Self = this.set("coverGutterNextToScrollbar", js.undefined)
    
    @scala.inline
    def setDragDrop(value: Boolean): Self = this.set("dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    
    @scala.inline
    def setElectricChars(value: Boolean): Self = this.set("electricChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectricChars: Self = this.set("electricChars", js.undefined)
    
    @scala.inline
    def setExtraKeys(value: js.Any): Self = this.set("extraKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraKeys: Self = this.set("extraKeys", js.undefined)
    
    @scala.inline
    def setFixedGutter(value: Boolean): Self = this.set("fixedGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedGutter: Self = this.set("fixedGutter", js.undefined)
    
    @scala.inline
    def setFoldGutter(value: Boolean): Self = this.set("foldGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldGutter: Self = this.set("foldGutter", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    
    @scala.inline
    def setGuttersVarargs(value: String*): Self = this.set("gutters", js.Array(value :_*))
    
    @scala.inline
    def setGutters(value: js.Array[String]): Self = this.set("gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    
    @scala.inline
    def setHandlePaste(value: Boolean): Self = this.set("handlePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlePaste: Self = this.set("handlePaste", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaces: Self = this.set("insertSpaces", js.undefined)
    
    @scala.inline
    def setKeyMap(value: String): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightNull: Self = this.set("lineHeight", null)
    
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    
    @scala.inline
    def setLineSeparator(value: String): Self = this.set("lineSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSeparator: Self = this.set("lineSeparator", js.undefined)
    
    @scala.inline
    def setLineSeparatorNull: Self = this.set("lineSeparator", null)
    
    @scala.inline
    def setLineWiseCopyCut(value: Boolean): Self = this.set("lineWiseCopyCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWiseCopyCut: Self = this.set("lineWiseCopyCut", js.undefined)
    
    @scala.inline
    def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWrap: Self = this.set("lineWrap", js.undefined)
    
    @scala.inline
    def setMatchBrackets(value: Boolean): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBrackets: Self = this.set("matchBrackets", js.undefined)
    
    @scala.inline
    def setMode(value: String | IMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRulersVarargs(value: Double*): Self = this.set("rulers", js.Array(value :_*))
    
    @scala.inline
    def setRulers(value: js.Array[Double]): Self = this.set("rulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulers: Self = this.set("rulers", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPastEnd: Self = this.set("scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollbarStyle(value: String): Self = this.set("scrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarStyle: Self = this.set("scrollbarStyle", js.undefined)
    
    @scala.inline
    def setSelectionPointer(value: Boolean | String): Self = this.set("selectionPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionPointer: Self = this.set("selectionPointer", js.undefined)
    
    @scala.inline
    def setShowCursorWhenSelecting(value: Boolean): Self = this.set("showCursorWhenSelecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCursorWhenSelecting: Self = this.set("showCursorWhenSelecting", js.undefined)
    
    @scala.inline
    def setSmartIndent(value: Boolean): Self = this.set("smartIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartIndent: Self = this.set("smartIndent", js.undefined)
    
    @scala.inline
    def setStyleActiveLine(value: Boolean | StyleActiveLine): Self = this.set("styleActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleActiveLine: Self = this.set("styleActiveLine", js.undefined)
    
    @scala.inline
    def setStyleSelectedText(value: Boolean): Self = this.set("styleSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleSelectedText: Self = this.set("styleSelectedText", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWordWrapColumn(value: Double): Self = this.set("wordWrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapColumn: Self = this.set("wordWrapColumn", js.undefined)
  }
}
