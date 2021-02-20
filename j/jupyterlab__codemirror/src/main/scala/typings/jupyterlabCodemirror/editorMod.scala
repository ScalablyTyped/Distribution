package typings.jupyterlabCodemirror

import org.scalablytyped.runtime.StringDictionary
import typings.codemirror.mod.Doc
import typings.codemirror.mod.Editor
import typings.codemirror.mod.Position
import typings.codemirror.mod.SearchCursor
import typings.codemirror.mod.StyleActiveLine
import typings.codemirror.mod.TextMarker
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.EdgeLocation
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IPosition
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typings.jupyterlabCodemirror.anon.Bias
import typings.jupyterlabCodemirror.anon.Bottom
import typings.jupyterlabCodemirror.anon.From
import typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IOptions
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.autoClosingBrackets
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.codeFolding
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.coverGutterNextToScrollbar
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.dragDrop
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.electricChars
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.extraKeys
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fixedGutter
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.foldGutter
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fontFamily
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fontSize
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.gutters
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.handlePaste
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.insertSpaces
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.keyMap
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineNumbers
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineSeparator
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineWiseCopyCut
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineWrap
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.local
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.matchBrackets
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.mode
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.page
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.readOnly
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.rulers
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.scrollPastEnd
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.scrollbarStyle
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.selectionPointer
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.showCursorWhenSelecting
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.smartIndent
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.styleActiveLine
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.styleSelectedText
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.tabSize
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.theme
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.window
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import typings.luminoSignaling.mod.Signal
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorMod {
  
  @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor")
  @js.native
  class CodeMirrorEditor protected () extends IEditor {
    /**
      * Construct a CodeMirror editor.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handles document changes.
      */
    var _beforeDocChanged: js.Any = js.native
    
    var _caretHover: js.Any = js.native
    
    var _changeGuard: js.Any = js.native
    
    /**
      * Check for an out of sync editor.
      */
    var _checkSync: js.Any = js.native
    
    /**
      * Clean selections for the given uuid.
      */
    var _cleanSelections: js.Any = js.native
    
    /**
      * Clear the hover for a caret, due to things like
      * scrolling, resizing, deactivation, etc, where
      * the position is no longer valid.
      */
    var _clearHover: js.Any = js.native
    
    val _config: js.Any = js.native
    
    var _editor: js.Any = js.native
    
    /**
      * Handle `blur` events for the editor.
      */
    var _evtBlur: js.Any = js.native
    
    /**
      * Handle `focus` events for the editor.
      */
    var _evtFocus: js.Any = js.native
    
    /**
      * Handle `scroll` events for the editor.
      */
    var _evtScroll: js.Any = js.native
    
    /**
      * Construct a caret element representing the position
      * of a collaborator's cursor.
      */
    var _getCaret: js.Any = js.native
    
    var _hoverId: js.Any = js.native
    
    var _hoverTimeout: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _keydownHandlers: js.Any = js.native
    
    var _lastChange: js.Any = js.native
    
    /**
      * Marks selections.
      */
    var _markSelections: js.Any = js.native
    
    var _model: js.Any = js.native
    
    var _needsRefresh: js.Any = js.native
    
    /**
      * Handles a cursor activity event.
      */
    var _onCursorActivity: js.Any = js.native
    
    /**
      * Handles a mime type change.
      */
    var _onMimeTypeChanged: js.Any = js.native
    
    /**
      * Handles a selections change.
      */
    var _onSelectionsChanged: js.Any = js.native
    
    /**
      * Handle model value changes.
      */
    var _onValueChanged: js.Any = js.native
    
    var _poll: js.Any = js.native
    
    var _selectionStyle: js.Any = js.native
    
    /**
      * Convert an editor position to a code mirror position.
      */
    var _toCodeMirrorPosition: js.Any = js.native
    
    /**
      * Converts an editor selection to a code mirror selection.
      */
    var _toCodeMirrorSelection: js.Any = js.native
    
    /**
      * Converts selections to code mirror selections.
      */
    var _toCodeMirrorSelections: js.Any = js.native
    
    /**
      * Convert a code mirror position to an editor position.
      */
    var _toPosition: js.Any = js.native
    
    /**
      * Converts a code mirror selection to an editor selection.
      */
    var _toSelection: js.Any = js.native
    
    /**
      * Converts the selection style to a text marker options.
      */
    var _toTextMarkerOptions: js.Any = js.native
    
    var _uuid: js.Any = js.native
    
    def addOverlay(mode: String): Unit = js.native
    def addOverlay(mode: String, options: js.Object): Unit = js.native
    def addOverlay(mode: js.Object): Unit = js.native
    def addOverlay(mode: js.Object, options: js.Object): Unit = js.native
    
    /**
      * The widget of a character in the editor in pixels.
      */
    @JSName("charWidth")
    def charWidth_MCodeMirrorEditor: Double = js.native
    
    def cursorCoords(where: Boolean): Bottom = js.native
    @JSName("cursorCoords")
    def cursorCoords_local(where: Boolean, mode: local): Bottom = js.native
    @JSName("cursorCoords")
    def cursorCoords_page(where: Boolean, mode: page): Bottom = js.native
    @JSName("cursorCoords")
    def cursorCoords_window(where: Boolean, mode: window): Bottom = js.native
    
    /**
      * Get the codemirror doc wrapped by the widget.
      */
    def doc: Doc = js.native
    
    /**
      * A signal emitted when either the top or bottom edge is requested.
      */
    @JSName("edgeRequested")
    val edgeRequested_CodeMirrorEditor: Signal[this.type, EdgeLocation] = js.native
    
    /**
      * Get the codemirror editor wrapped by the editor.
      */
    def editor: Editor = js.native
    
    /**
      * Execute a codemirror command on the editor.
      *
      * @param command - The name of the command to execute.
      */
    def execCommand(command: String): Unit = js.native
    
    def firstLine(): Double = js.native
    
    def getCursor(): Position = js.native
    def getCursor(start: String): Position = js.native
    
    @JSName("getOption")
    def getOption_autoClosingBrackets(option: autoClosingBrackets): Boolean = js.native
    @JSName("getOption")
    def getOption_codeFolding(option: codeFolding): Boolean = js.native
    @JSName("getOption")
    def getOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_dragDrop(option: dragDrop): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_electricChars(option: electricChars): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_extraKeys(option: extraKeys): js.UndefOr[js.Any] = js.native
    @JSName("getOption")
    def getOption_fixedGutter(option: fixedGutter): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_foldGutter(option: foldGutter): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_fontFamily(option: fontFamily): String | Null = js.native
    @JSName("getOption")
    def getOption_fontSize(option: fontSize): Double | Null = js.native
    @JSName("getOption")
    def getOption_gutters(option: gutters): js.UndefOr[js.Array[String]] = js.native
    @JSName("getOption")
    def getOption_handlePaste(option: handlePaste): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_insertSpaces(option: insertSpaces): Boolean = js.native
    @JSName("getOption")
    def getOption_keyMap(option: keyMap): js.UndefOr[String] = js.native
    @JSName("getOption")
    def getOption_lineHeight(option: typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight): Double | Null = js.native
    @JSName("getOption")
    def getOption_lineNumbers(option: lineNumbers): Boolean = js.native
    @JSName("getOption")
    def getOption_lineSeparator(option: lineSeparator): js.UndefOr[String | Null] = js.native
    @JSName("getOption")
    def getOption_lineWiseCopyCut(option: lineWiseCopyCut): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_lineWrap(option: lineWrap): off | on | wordWrapColumn | bounded = js.native
    @JSName("getOption")
    def getOption_matchBrackets(option: matchBrackets): Boolean = js.native
    /**
      * Get a config option for the editor.
      */
    @JSName("getOption")
    def getOption_mode(option: mode): js.UndefOr[String | IMode] = js.native
    @JSName("getOption")
    def getOption_readOnly(option: readOnly): Boolean = js.native
    @JSName("getOption")
    def getOption_rulers(option: rulers): js.Array[Double] = js.native
    @JSName("getOption")
    def getOption_scrollPastEnd(option: scrollPastEnd): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_scrollbarStyle(option: scrollbarStyle): js.UndefOr[String] = js.native
    @JSName("getOption")
    def getOption_selectionPointer(option: selectionPointer): Boolean | String = js.native
    @JSName("getOption")
    def getOption_showCursorWhenSelecting(option: showCursorWhenSelecting): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_smartIndent(option: smartIndent): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_styleActiveLine(option: styleActiveLine): Boolean | StyleActiveLine = js.native
    @JSName("getOption")
    def getOption_styleSelectedText(option: styleSelectedText): Boolean = js.native
    @JSName("getOption")
    def getOption_tabSize(option: tabSize): Double = js.native
    @JSName("getOption")
    def getOption_theme(option: theme): js.UndefOr[String] = js.native
    @JSName("getOption")
    def getOption_wordWrapColumn(option: wordWrapColumn): Double = js.native
    
    def getRange(from: Position, to: Position): String = js.native
    def getRange(from: Position, to: Position, seperator: String): String = js.native
    
    def getSearchCursor(query: String): SearchCursor = js.native
    def getSearchCursor(query: String, start: js.UndefOr[scala.Nothing], caseFold: Boolean): SearchCursor = js.native
    def getSearchCursor(query: String, start: Position): SearchCursor = js.native
    def getSearchCursor(query: String, start: Position, caseFold: Boolean): SearchCursor = js.native
    def getSearchCursor(query: RegExp): SearchCursor = js.native
    def getSearchCursor(query: RegExp, start: js.UndefOr[scala.Nothing], caseFold: Boolean): SearchCursor = js.native
    def getSearchCursor(query: RegExp, start: Position): SearchCursor = js.native
    def getSearchCursor(query: RegExp, start: Position, caseFold: Boolean): SearchCursor = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the editor's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Tests whether the editor is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCodeMirrorEditor: Boolean = js.native
    
    def lastLine(): Double = js.native
    
    /**
      * Get the number of lines in the editor.
      */
    @JSName("lineCount")
    def lineCount_MCodeMirrorEditor: Double = js.native
    
    /**
      * The height of a line in the editor in pixels.
      */
    @JSName("lineHeight")
    def lineHeight_MCodeMirrorEditor: Double = js.native
    
    /**
      * Returns a model for this editor.
      */
    @JSName("model")
    def model_MCodeMirrorEditor: IModel = js.native
    
    /**
      * Handle keydown events from the editor.
      */
    /* protected */ def onKeydown(event: KeyboardEvent): Boolean = js.native
    
    def operation[T](fn: js.Function0[T]): T = js.native
    
    def removeOverlay(mode: String): Unit = js.native
    def removeOverlay(mode: js.Object): Unit = js.native
    
    /**
      * Replaces the current selection with the given text.
      *
      * @param text The text to be inserted.
      */
    @JSName("replaceSelection")
    def replaceSelection_MCodeMirrorEditor(text: String): Unit = js.native
    
    def scrollIntoView(pos: From, margin: Double): Unit = js.native
    
    var selectionMarkers: StringDictionary[js.UndefOr[js.Array[TextMarker]]] = js.native
    
    /**
      * The selection style of this editor.
      */
    @JSName("selectionStyle")
    def selectionStyle_MCodeMirrorEditor: ISelectionStyle = js.native
    
    def setCursorPosition(position: IPosition, options: Bias): Unit = js.native
    
    def setOption(option: lineWrap, value: bounded): Unit = js.native
    def setOption(option: lineWrap, value: off): Unit = js.native
    def setOption(option: lineWrap, value: on): Unit = js.native
    def setOption(option: lineWrap, value: wordWrapColumn): Unit = js.native
    @JSName("setOption")
    def setOption_autoClosingBrackets(option: autoClosingBrackets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_codeFolding(option: codeFolding, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar): Unit = js.native
    @JSName("setOption")
    def setOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dragDrop(option: dragDrop): Unit = js.native
    @JSName("setOption")
    def setOption_dragDrop(option: dragDrop, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_electricChars(option: electricChars): Unit = js.native
    @JSName("setOption")
    def setOption_electricChars(option: electricChars, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_extraKeys(option: extraKeys): Unit = js.native
    @JSName("setOption")
    def setOption_extraKeys(option: extraKeys, value: js.Any): Unit = js.native
    @JSName("setOption")
    def setOption_fixedGutter(option: fixedGutter): Unit = js.native
    @JSName("setOption")
    def setOption_fixedGutter(option: fixedGutter, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_foldGutter(option: foldGutter): Unit = js.native
    @JSName("setOption")
    def setOption_foldGutter(option: foldGutter, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_gutters(option: gutters): Unit = js.native
    @JSName("setOption")
    def setOption_gutters(option: gutters, value: js.Array[String]): Unit = js.native
    @JSName("setOption")
    def setOption_handlePaste(option: handlePaste): Unit = js.native
    @JSName("setOption")
    def setOption_handlePaste(option: handlePaste, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_insertSpaces(option: insertSpaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_keyMap(option: keyMap): Unit = js.native
    @JSName("setOption")
    def setOption_keyMap(option: keyMap, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_lineNumbers(option: lineNumbers, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_lineSeparator(option: lineSeparator): Unit = js.native
    @JSName("setOption")
    def setOption_lineSeparator(option: lineSeparator, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_lineWiseCopyCut(option: lineWiseCopyCut): Unit = js.native
    @JSName("setOption")
    def setOption_lineWiseCopyCut(option: lineWiseCopyCut, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_matchBrackets(option: matchBrackets, value: Boolean): Unit = js.native
    /**
      * Set a config option for the editor.
      */
    @JSName("setOption")
    def setOption_mode(option: mode): Unit = js.native
    @JSName("setOption")
    def setOption_mode(option: mode, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_mode(option: mode, value: IMode): Unit = js.native
    @JSName("setOption")
    def setOption_readOnly(option: readOnly, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_rulers(option: rulers, value: js.Array[Double]): Unit = js.native
    @JSName("setOption")
    def setOption_scrollPastEnd(option: scrollPastEnd): Unit = js.native
    @JSName("setOption")
    def setOption_scrollPastEnd(option: scrollPastEnd, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_scrollbarStyle(option: scrollbarStyle): Unit = js.native
    @JSName("setOption")
    def setOption_scrollbarStyle(option: scrollbarStyle, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_selectionPointer(option: selectionPointer, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_selectionPointer(option: selectionPointer, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showCursorWhenSelecting(option: showCursorWhenSelecting): Unit = js.native
    @JSName("setOption")
    def setOption_showCursorWhenSelecting(option: showCursorWhenSelecting, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_smartIndent(option: smartIndent): Unit = js.native
    @JSName("setOption")
    def setOption_smartIndent(option: smartIndent, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_styleActiveLine(option: styleActiveLine, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_styleActiveLine(option: styleActiveLine, value: StyleActiveLine): Unit = js.native
    @JSName("setOption")
    def setOption_styleSelectedText(option: styleSelectedText, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_tabSize(option: tabSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_theme(option: theme): Unit = js.native
    @JSName("setOption")
    def setOption_theme(option: theme, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_wordWrapColumn(option: wordWrapColumn, value: Double): Unit = js.native
    
    def state: js.Any = js.native
    
    /**
      * The uuid of this editor;
      */
    @JSName("uuid")
    def uuid_MCodeMirrorEditor: String = js.native
  }
  object CodeMirrorEditor {
    
    /**
      * Add a command to CodeMirror.
      *
      * @param name - The name of the command to add.
      *
      * @param command - The command function.
      */
    @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.addCommand")
    @js.native
    def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
    
    /**
      * The default configuration options for an editor.
      */
    /* Inlined std.Required<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
    object defaultConfig {
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.autoClosingBrackets")
      @js.native
      def autoClosingBrackets: Boolean = js.native
      @scala.inline
      def autoClosingBrackets_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.codeFolding")
      @js.native
      def codeFolding: Boolean = js.native
      @scala.inline
      def codeFolding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeFolding")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.coverGutterNextToScrollbar")
      @js.native
      def coverGutterNextToScrollbar: Boolean = js.native
      @scala.inline
      def coverGutterNextToScrollbar_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coverGutterNextToScrollbar")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.dragDrop")
      @js.native
      def dragDrop: Boolean = js.native
      @scala.inline
      def dragDrop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.electricChars")
      @js.native
      def electricChars: Boolean = js.native
      @scala.inline
      def electricChars_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.extraKeys")
      @js.native
      def extraKeys: js.Any = js.native
      @scala.inline
      def extraKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.fixedGutter")
      @js.native
      def fixedGutter: Boolean = js.native
      @scala.inline
      def fixedGutter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedGutter")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.foldGutter")
      @js.native
      def foldGutter: Boolean = js.native
      @scala.inline
      def foldGutter_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldGutter")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.fontFamily")
      @js.native
      def fontFamily: String = js.native
      @scala.inline
      def fontFamily_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.fontSize")
      @js.native
      def fontSize: Double = js.native
      @scala.inline
      def fontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.gutters")
      @js.native
      def gutters: js.Array[String] = js.native
      @scala.inline
      def gutters_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gutters")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.handlePaste")
      @js.native
      def handlePaste: Boolean = js.native
      @scala.inline
      def handlePaste_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlePaste")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.insertSpaces")
      @js.native
      def insertSpaces: Boolean = js.native
      @scala.inline
      def insertSpaces_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.keyMap")
      @js.native
      def keyMap: String = js.native
      @scala.inline
      def keyMap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.lineHeight")
      @js.native
      def lineHeight: Double = js.native
      @scala.inline
      def lineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.lineNumbers")
      @js.native
      def lineNumbers: Boolean = js.native
      @scala.inline
      def lineNumbers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.lineSeparator")
      @js.native
      def lineSeparator: String = js.native
      @scala.inline
      def lineSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.lineWiseCopyCut")
      @js.native
      def lineWiseCopyCut: Boolean = js.native
      @scala.inline
      def lineWiseCopyCut_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWiseCopyCut")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.lineWrap")
      @js.native
      def lineWrap: off | on | wordWrapColumn | bounded = js.native
      @scala.inline
      def lineWrap_=(x: off | on | wordWrapColumn | bounded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.matchBrackets")
      @js.native
      def matchBrackets: Boolean = js.native
      @scala.inline
      def matchBrackets_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.mode")
      @js.native
      def mode: String | IMode = js.native
      @scala.inline
      def mode_=(x: String | IMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      @scala.inline
      def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.rulers")
      @js.native
      def rulers: js.Array[Double] = js.native
      @scala.inline
      def rulers_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rulers")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.scrollPastEnd")
      @js.native
      def scrollPastEnd: Boolean = js.native
      @scala.inline
      def scrollPastEnd_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.scrollbarStyle")
      @js.native
      def scrollbarStyle: String = js.native
      @scala.inline
      def scrollbarStyle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.selectionPointer")
      @js.native
      def selectionPointer: Boolean | String = js.native
      @scala.inline
      def selectionPointer_=(x: Boolean | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionPointer")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.showCursorWhenSelecting")
      @js.native
      def showCursorWhenSelecting: Boolean = js.native
      @scala.inline
      def showCursorWhenSelecting_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCursorWhenSelecting")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.smartIndent")
      @js.native
      def smartIndent: Boolean = js.native
      @scala.inline
      def smartIndent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartIndent")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.styleActiveLine")
      @js.native
      def styleActiveLine: Boolean | StyleActiveLine = js.native
      @scala.inline
      def styleActiveLine_=(x: Boolean | StyleActiveLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleActiveLine")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.styleSelectedText")
      @js.native
      def styleSelectedText: Boolean = js.native
      @scala.inline
      def styleSelectedText_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.tabSize")
      @js.native
      def tabSize: Double = js.native
      @scala.inline
      def tabSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.theme")
      @js.native
      def theme: String = js.native
      @scala.inline
      def theme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig.wordWrapColumn")
      @js.native
      def wordWrapColumn: Double = js.native
      @scala.inline
      def wordWrapColumn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(x.asInstanceOf[js.Any])
    }
    
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
        lineWrap: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off | typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on | typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn | typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded,
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
      implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
        
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
        def setGutters(value: js.Array[String]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
        
        @scala.inline
        def setGuttersVarargs(value: String*): Self = StObject.set(x, "gutters", js.Array(value :_*))
        
        @scala.inline
        def setKeyMap(value: String): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
        
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
        def setMode(value: String | IMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
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
        def setStyleSelectedText(value: Boolean): Self = StObject.set(x, "styleSelectedText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      }
    }
    
    /**
      * The options used to initialize a code mirror editor.
      */
    @js.native
    trait IOptions
      extends typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
    object IOptions {
      
      @scala.inline
      def apply(host: HTMLElement, model: IModel): IOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
    }
  }
}
