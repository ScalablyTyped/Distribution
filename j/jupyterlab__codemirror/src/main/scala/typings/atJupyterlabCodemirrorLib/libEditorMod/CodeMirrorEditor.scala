package typings
package atJupyterlabCodemirrorLib.libEditorMod

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
  def this(options: atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditorNs.IOptions) = this()
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
  var _selectionStyle: js.Any = js.native
  var _timer: js.Any = js.native
  /**
    * Convert an editor position to a code mirror position.
    */
  var _toCodeMirrorPosition: js.Any = js.native
  /**
    * Converts an editor selection to a code mirror selection.
    */
  var _toCodeMirrorRange: js.Any = js.native
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
  val charWidth: scala.Double = js.native
  /**
    * Get the codemirror doc wrapped by the widget.
    */
  val doc: codemirrorLib.codemirrorMod.Doc = js.native
  /**
    * A signal emitted when either the top or bottom edge is requested.
    */
  val edgeRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.Signal[
    this.type, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.EdgeLocation */ _
  ] = js.native
  /**
    * Get the codemirror editor wrapped by the editor.
    */
  val editor: codemirrorLib.codemirrorMod.Editor = js.native
  /**
    * The DOM node that hosts the editor.
    */
  val host: stdLib.HTMLElement = js.native
  /**
    * Tests whether the editor is disposed.
    */
  val isDisposed: scala.Boolean = js.native
  /**
    * Get the number of lines in the editor.
    */
  val lineCount: scala.Double = js.native
  /**
    * The height of a line in the editor in pixels.
    */
  val lineHeight: scala.Double = js.native
  /**
    * Returns a model for this editor.
    */
  val model: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IModel */ js.Any = js.native
  var selectionMarkers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[codemirrorLib.codemirrorMod.TextMarker]]] = js.native
  /**
    * The selection style of this editor.
    */
  var selectionStyle: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.ISelectionStyle */ js.Any = js.native
  /**
    * The uuid of this editor;
    */
  var uuid: java.lang.String = js.native
  /**
    * Add a keydown handler to the editor.
    *
    * @param handler - A keydown handler.
    *
    * @returns A disposable that can be used to remove the handler.
    */
  def addKeydownHandler(
    handler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.KeydownHandler */ js.Any
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Explicitly blur the editor.
    */
  def blur(): scala.Unit = js.native
  /**
    * Clear the undo history.
    */
  def clearHistory(): scala.Unit = js.native
  /**
    * Dispose of the resources held by the widget.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Execute a codemirror command on the editor.
    *
    * @param command - The name of the command to execute.
    */
  def execCommand(command: java.lang.String): scala.Unit = js.native
  /**
    * Brings browser focus to this editor text.
    */
  def focus(): scala.Unit = js.native
  /**
    * Get the window coordinates given a cursor position.
    */
  def getCoordinateForPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): js.Any = js.native
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  def getCursorPosition(): js.Any = js.native
  /**
    * Returns the content for the given line number.
    */
  def getLine(line: scala.Double): js.UndefOr[java.lang.String] = js.native
  /**
    * Find an offset for the given position.
    */
  def getOffsetAt(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): scala.Double = js.native
  @JSName("getOption")
  def getOption_coverGutterNextToScrollbar(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.coverGutterNextToScrollbar): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_dragDrop(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.dragDrop): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_electricChars(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.electricChars): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_extraKeys(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.extraKeys): js.Any = js.native
  @JSName("getOption")
  def getOption_fixedGutter(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.fixedGutter): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_gutters(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.gutters): js.Array[java.lang.String] = js.native
  @JSName("getOption")
  def getOption_keyMap(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.keyMap): java.lang.String = js.native
  @JSName("getOption")
  def getOption_lineSeparator(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.lineSeparator): java.lang.String | scala.Null = js.native
  @JSName("getOption")
  def getOption_lineWiseCopyCut(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.lineWiseCopyCut): scala.Boolean = js.native
  /**
    * Get a config option for the editor.
    */
  @JSName("getOption")
  def getOption_mode(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.mode): java.lang.String | atJupyterlabCodemirrorLib.libModeMod.ModeNs.IMode = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.scrollPastEnd): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_scrollbarStyle(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.scrollbarStyle): java.lang.String = js.native
  @JSName("getOption")
  def getOption_showCursorWhenSelecting(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.showCursorWhenSelecting): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_smartIndent(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.smartIndent): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_theme(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.theme): java.lang.String = js.native
  /**
    * Find a position for the given offset.
    */
  def getPositionAt(offset: scala.Double): js.Any = js.native
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
  ): (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any) | scala.Null = js.native
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
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Test whether the editor has keyboard focus.
    */
  def hasFocus(): scala.Boolean = js.native
  /**
    * Insert a new indented line at the current cursor position.
    */
  def newIndentedLine(): scala.Unit = js.native
  /**
    * Handle keydown events from the editor.
    */
  /* protected */ def onKeydown(event: stdLib.KeyboardEvent): scala.Boolean = js.native
  /**
    * Redo one undone edit.
    */
  def redo(): scala.Unit = js.native
  /**
    * Repaint editor.
    */
  def refresh(): scala.Unit = js.native
  /**
    * Refresh the editor if it is focused;
    * otherwise postpone refreshing till focusing.
    */
  def resizeToFit(): scala.Unit = js.native
  /**
    * Reveal the given position in the editor.
    */
  def revealPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): scala.Unit = js.native
  /**
    * Reveal the given selection in the editor.
    */
  def revealSelection(
    selection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ js.Any
  ): scala.Unit = js.native
  /**
    * Set the primary position of the cursor.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  def setCursorPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_coverGutterNextToScrollbar(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.coverGutterNextToScrollbar,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_dragDrop(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.dragDrop, value: scala.Boolean): scala.Unit = js.native
  @JSName("setOption")
  def setOption_electricChars(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.electricChars,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_extraKeys(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.extraKeys, value: js.Any): scala.Unit = js.native
  @JSName("setOption")
  def setOption_fixedGutter(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.fixedGutter,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_gutters(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.gutters,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_keyMap(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.keyMap, value: java.lang.String): scala.Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.lineSeparator): scala.Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.lineSeparator,
    value: java.lang.String
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_lineWiseCopyCut(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.lineWiseCopyCut,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_mode(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.mode,
    value: atJupyterlabCodemirrorLib.libModeMod.ModeNs.IMode
  ): scala.Unit = js.native
  /**
    * Set a config option for the editor.
    */
  @JSName("setOption")
  def setOption_mode(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.mode, value: java.lang.String): scala.Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.scrollPastEnd,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_scrollbarStyle(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.scrollbarStyle,
    value: java.lang.String
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_showCursorWhenSelecting(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.showCursorWhenSelecting,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_smartIndent(
    option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.smartIndent,
    value: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: atJupyterlabCodemirrorLib.atJupyterlabCodemirrorLibStrings.theme, value: java.lang.String): scala.Unit = js.native
  /**
    * Set the primary selection. This will remove any secondary cursors.
    */
  def setSelection(
    selection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ js.Any
  ): scala.Unit = js.native
  /**
    * Sets the selections for all the cursors, should not be empty.
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a document.
    */
  def setSelections(
    selections: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IRange */ _
    ]
  ): scala.Unit = js.native
  def setSize(): scala.Unit = js.native
  /**
    * Set the size of the editor in pixels.
    */
  def setSize(
    dimension: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IDimension */ js.Any
  ): scala.Unit = js.native
  /**
    * Undo one edit (if any undo events are stored).
    */
  def undo(): scala.Unit = js.native
}

