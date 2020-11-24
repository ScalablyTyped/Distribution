package typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration options for a codemirror editor.
  */
@js.native
trait IConfig
  extends typings.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig {
  
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default
    * the gutter will be visible to the left of this scrollbar. If this
    * option is set to true, it will be covered by an element with class
    * CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether drag-and-drop is enabled.
    */
  var dragDrop: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures whether the editor should re-indent the current line when a
    * character is typed that might change its proper indentation
    * (only works if the mode supports indentation).
    */
  var electricChars: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be used to specify extra keybindings for the editor, alongside the
    * ones defined by keyMap. Should be either null, or a valid keymap value.
    */
  var extraKeys: js.UndefOr[js.Any] = js.native
  
  /**
    * Determines whether the gutter scrolls along with the content
    * horizontally (false)
    * or whether it stays fixed during horizontal scrolling (true,
    * the default).
    */
  var fixedGutter: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the folding gutter should be drawn
    */
  var foldGutter: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be used to add extra gutters (beyond or instead of the line number
    * gutter).
    * Should be an array of CSS class names, each of which defines a width
    * (and optionally a background),
    * and which will be used to draw the background of the gutters.
    * May include the CodeMirror-linenumbers class, in order to explicitly
    * set the position of the line number gutter
    * (it will default to be to the right of all other gutters).
    * These class names are the keys passed to setGutterMarker.
    */
  var gutters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Configures the keymap to use. The default is "default", which is the
    * only keymap defined in codemirror.js itself.
    * Extra keymaps are found in the CodeMirror keymap directory.
    */
  var keyMap: js.UndefOr[String] = js.native
  
  /**
    * Explicitly set the line separator for the editor.
    * By default (value null), the document will be split on CRLFs as well as
    * lone CRs and LFs, and a single LF will be used as line separator in all
    * output (such as getValue). When a specific string is given, lines will
    * only be split on that string, and output will, by default, use that
    * same separator.
    */
  var lineSeparator: js.UndefOr[String | Null] = js.native
  
  /**
    * When enabled, which is the default, doing copy or cut when there is no
    * selection will copy or cut the whole lines that have cursors on them.
    */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode to use.
    */
  var mode: js.UndefOr[String | IMode] = js.native
  
  /**
    * Whether to scroll past the end of the buffer.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * Chooses a scrollbar implementation. The default is "native", showing
    * native scrollbars. The core library also provides the "null" style,
    * which completely hides the scrollbars. Addons can implement additional
    * scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.native
  
  /**
    * Defines the mouse cursor appearance when hovering over the selection.
    * It can be set to a string, like "pointer", or to true,
    * in which case the "default" (arrow) cursor will be used.
    */
  var selectionPointer: Boolean | String = js.native
  
  /**
    * Whether the cursor should be drawn when a selection is active.
    */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to use the context-sensitive indentation that the mode provides
    * (or just indent the same as the line before).
    */
  var smartIndent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to give the wrapper of the line that contains the cursor the class
    * CodeMirror-activeline, adds a background with the class
    * CodeMirror-activeline-background, and adds the class
    * CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: Boolean | StyleActiveLine = js.native
  
  /**
    * Whether to causes the selected text to be marked with the CSS class
    * CodeMirror-selectedtext. Useful to change the colour of the selection
    * (in addition to the background).
    */
  var styleSelectedText: Boolean = js.native
  
  /**
    * The theme to style the editor with.
    * You must make sure the CSS file defining the corresponding
    * .cm-s-[name] styles is loaded.
    */
  var theme: js.UndefOr[String] = js.native
}
object IConfig {
  
  @scala.inline
  def apply(
    autoClosingBrackets: Boolean,
    codeFolding: Boolean,
    insertSpaces: Boolean,
    lineNumbers: Boolean,
    lineWrap: off | on | wordWrapColumn | bounded,
    matchBrackets: Boolean,
    readOnly: Boolean,
    rulers: js.Array[Double],
    selectionPointer: Boolean | String,
    styleActiveLine: Boolean | StyleActiveLine,
    styleSelectedText: Boolean,
    tabSize: Double,
    wordWrapColumn: Double
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], selectionPointer = selectionPointer.asInstanceOf[js.Any], styleActiveLine = styleActiveLine.asInstanceOf[js.Any], styleSelectedText = styleSelectedText.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setSelectionPointer(value: Boolean | String): Self = this.set("selectionPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleActiveLine(value: Boolean | StyleActiveLine): Self = this.set("styleActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSelectedText(value: Boolean): Self = this.set("styleSelectedText", value.asInstanceOf[js.Any])
    
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
    def setGuttersVarargs(value: String*): Self = this.set("gutters", js.Array(value :_*))
    
    @scala.inline
    def setGutters(value: js.Array[String]): Self = this.set("gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    
    @scala.inline
    def setKeyMap(value: String): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
    
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
    def setMode(value: String | IMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPastEnd: Self = this.set("scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollbarStyle(value: String): Self = this.set("scrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarStyle: Self = this.set("scrollbarStyle", js.undefined)
    
    @scala.inline
    def setShowCursorWhenSelecting(value: Boolean): Self = this.set("showCursorWhenSelecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCursorWhenSelecting: Self = this.set("showCursorWhenSelecting", js.undefined)
    
    @scala.inline
    def setSmartIndent(value: Boolean): Self = this.set("smartIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartIndent: Self = this.set("smartIndent", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
