package typings.atJupyterlabCodemirror.libEditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCodemirror.Anon_Bias
import typings.atJupyterlabCodemirror.Anon_Bottom
import typings.atJupyterlabCodemirror.Anon_From
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.coverGutterNextToScrollbar
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.dragDrop
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.electricChars
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.extraKeys
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.fixedGutter
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.foldGutter
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.gutters
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.keyMap
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.lineSeparator
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.lineWiseCopyCut
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.local
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.mode
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.page
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.scrollPastEnd
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.scrollbarStyle
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.selectionPointer
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.showCursorWhenSelecting
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.smartIndent
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.styleActiveLine
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.styleSelectedText
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.theme
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorStrings.window
import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditorNs.IOptions
import typings.atJupyterlabCodemirror.libModeMod.ModeNs.IMode
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.Signal
import typings.codemirror.codemirrorMod.Doc
import typings.codemirror.codemirrorMod.Editor
import typings.codemirror.codemirrorMod.Position
import typings.codemirror.codemirrorMod.SearchCursor
import typings.codemirror.codemirrorMod.StyleActiveLine
import typings.codemirror.codemirrorMod.TextMarker
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor")
@js.native
class CodeMirrorEditor protected () extends js.Object {
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
  /**
    * The widget of a character in the editor in pixels.
    */
  val charWidth: Double = js.native
  /**
    * Get the codemirror doc wrapped by the widget.
    */
  val doc: Doc = js.native
  /**
    * A signal emitted when either the top or bottom edge is requested.
    */
  val edgeRequested: Signal[
    this.type, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.EdgeLocation */ _
  ] = js.native
  /**
    * Get the codemirror editor wrapped by the editor.
    */
  val editor: Editor = js.native
  /**
    * The DOM node that hosts the editor.
    */
  val host: HTMLElement = js.native
  /**
    * Tests whether the editor is disposed.
    */
  val isDisposed: Boolean = js.native
  /**
    * Get the number of lines in the editor.
    */
  val lineCount: Double = js.native
  /**
    * The height of a line in the editor in pixels.
    */
  val lineHeight: Double = js.native
  /**
    * Returns a model for this editor.
    */
  val model: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IModel */ js.Any = js.native
  var selectionMarkers: StringDictionary[js.UndefOr[js.Array[TextMarker]]] = js.native
  /**
    * The selection style of this editor.
    */
  var selectionStyle: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.ISelectionStyle */ js.Any = js.native
  val state: js.Any = js.native
  /**
    * The uuid of this editor;
    */
  var uuid: String = js.native
  /**
    * Add a keydown handler to the editor.
    *
    * @param handler - A keydown handler.
    *
    * @returns A disposable that can be used to remove the handler.
    */
  def addKeydownHandler(
    handler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.KeydownHandler */ js.Any
  ): IDisposable = js.native
  def addOverlay(mode: String): Unit = js.native
  def addOverlay(mode: String, options: js.Object): Unit = js.native
  def addOverlay(mode: js.Object): Unit = js.native
  def addOverlay(mode: js.Object, options: js.Object): Unit = js.native
  /**
    * Explicitly blur the editor.
    */
  def blur(): Unit = js.native
  /**
    * Clear the undo history.
    */
  def clearHistory(): Unit = js.native
  def cursorCoords(where: Boolean): Anon_Bottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_local(where: Boolean, mode: local): Anon_Bottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_page(where: Boolean, mode: page): Anon_Bottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_window(where: Boolean, mode: window): Anon_Bottom = js.native
  /**
    * Dispose of the resources held by the widget.
    */
  def dispose(): Unit = js.native
  /**
    * Execute a codemirror command on the editor.
    *
    * @param command - The name of the command to execute.
    */
  def execCommand(command: String): Unit = js.native
  def firstLine(): Double = js.native
  /**
    * Brings browser focus to this editor text.
    */
  def focus(): Unit = js.native
  /**
    * Get the window coordinates given a cursor position.
    */
  def getCoordinateForPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): js.Any = js.native
  def getCursor(): Position = js.native
  def getCursor(start: String): Position = js.native
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): js.Any = js.native
  /**
    * Returns the content for the given line number.
    */
  def getLine(line: Double): js.UndefOr[String] = js.native
  /**
    * Find an offset for the given position.
    */
  def getOffsetAt(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): Double = js.native
  @JSName("getOption")
  def getOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar): Boolean = js.native
  @JSName("getOption")
  def getOption_dragDrop(option: dragDrop): Boolean = js.native
  @JSName("getOption")
  def getOption_electricChars(option: electricChars): Boolean = js.native
  @JSName("getOption")
  def getOption_extraKeys(option: extraKeys): js.Any = js.native
  @JSName("getOption")
  def getOption_fixedGutter(option: fixedGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_foldGutter(option: foldGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_gutters(option: gutters): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_keyMap(option: keyMap): String = js.native
  @JSName("getOption")
  def getOption_lineSeparator(option: lineSeparator): String | Null = js.native
  @JSName("getOption")
  def getOption_lineWiseCopyCut(option: lineWiseCopyCut): Boolean = js.native
  /**
    * Get a config option for the editor.
    */
  @JSName("getOption")
  def getOption_mode(option: mode): String | IMode = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(option: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollbarStyle(option: scrollbarStyle): String = js.native
  @JSName("getOption")
  def getOption_selectionPointer(option: selectionPointer): Boolean | String = js.native
  @JSName("getOption")
  def getOption_showCursorWhenSelecting(option: showCursorWhenSelecting): Boolean = js.native
  @JSName("getOption")
  def getOption_smartIndent(option: smartIndent): Boolean = js.native
  @JSName("getOption")
  def getOption_styleActiveLine(option: styleActiveLine): Boolean | StyleActiveLine = js.native
  @JSName("getOption")
  def getOption_styleSelectedText(option: styleSelectedText): Boolean = js.native
  @JSName("getOption")
  def getOption_theme(option: theme): String = js.native
  /**
    * Find a position for the given offset.
    */
  def getPositionAt(offset: Double): js.Any = js.native
  /**
    * Get the cursor position given window coordinates.
    *
    * @param coordinate - The desired coordinate.
    *
    * @returns The position of the coordinates, or null if not
    *   contained in the editor.
    */
  def getPositionForCoordinate(
    coordinate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.ICoordinate */ js.Any
  ): (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any) | Null = js.native
  def getRange(from: Position, to: Position): String = js.native
  def getRange(from: Position, to: Position, seperator: String): String = js.native
  def getSearchCursor(query: String): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position, caseFold: Boolean): SearchCursor = js.native
  def getSearchCursor(query: RegExp): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position, caseFold: Boolean): SearchCursor = js.native
  /**
    * Returns the primary selection, never `null`.
    */
  def getSelection(): js.Any = js.native
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  def getSelections(): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.ITextSelection */ _
  ] = js.native
  /**
    * Get the token at a given editor position.
    */
  def getTokenForPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): js.Any = js.native
  /**
    * Get a list of tokens for the current editor text content.
    */
  def getTokens(): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IToken */ _
  ] = js.native
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
    * Test whether the editor has keyboard focus.
    */
  def hasFocus(): Boolean = js.native
  def lastLine(): Double = js.native
  /**
    * Insert a new indented line at the current cursor position.
    */
  def newIndentedLine(): Unit = js.native
  /**
    * Handle keydown events from the editor.
    */
  /* protected */ def onKeydown(event: KeyboardEvent): Boolean = js.native
  def operation[T](fn: js.Function0[T]): T = js.native
  /**
    * Redo one undone edit.
    */
  def redo(): Unit = js.native
  /**
    * Repaint editor.
    */
  def refresh(): Unit = js.native
  def removeOverlay(mode: String): Unit = js.native
  def removeOverlay(mode: js.Object): Unit = js.native
  /**
    * Refresh the editor if it is focused;
    * otherwise postpone refreshing till focusing.
    */
  def resizeToFit(): Unit = js.native
  /**
    * Reveal the given position in the editor.
    */
  def revealPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): Unit = js.native
  /**
    * Reveal the given selection in the editor.
    */
  def revealSelection(
    selection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ js.Any
  ): Unit = js.native
  def scrollIntoView(pos: Anon_From, margin: Double): Unit = js.native
  /**
    * Set the primary position of the cursor.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): Unit = js.native
  def setCursorPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any,
    options: Anon_Bias
  ): Unit = js.native
  @JSName("setOption")
  def setOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_dragDrop(option: dragDrop, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_electricChars(option: electricChars, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_extraKeys(option: extraKeys, value: js.Any): Unit = js.native
  @JSName("setOption")
  def setOption_fixedGutter(option: fixedGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_foldGutter(option: foldGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_gutters(option: gutters, value: js.Array[String]): Unit = js.native
  @JSName("setOption")
  def setOption_keyMap(option: keyMap, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(option: lineSeparator): Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(option: lineSeparator, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineWiseCopyCut(option: lineWiseCopyCut, value: Boolean): Unit = js.native
  /**
    * Set a config option for the editor.
    */
  @JSName("setOption")
  def setOption_mode(option: mode, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_mode(option: mode, value: IMode): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(option: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollbarStyle(option: scrollbarStyle, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_selectionPointer(option: selectionPointer, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_selectionPointer(option: selectionPointer, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showCursorWhenSelecting(option: showCursorWhenSelecting, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_smartIndent(option: smartIndent, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: StyleActiveLine): Unit = js.native
  @JSName("setOption")
  def setOption_styleSelectedText(option: styleSelectedText, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: theme, value: String): Unit = js.native
  /**
    * Set the primary selection. This will remove any secondary cursors.
    */
  def setSelection(
    selection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ js.Any
  ): Unit = js.native
  /**
    * Sets the selections for all the cursors, should not be empty.
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a document.
    */
  def setSelections(
    selections: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ _
    ]
  ): Unit = js.native
  def setSize(): Unit = js.native
  /**
    * Set the size of the editor in pixels.
    */
  def setSize(
    dimension: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IDimension */ js.Any
  ): Unit = js.native
  /**
    * Undo one edit (if any undo events are stored).
    */
  def undo(): Unit = js.native
}

