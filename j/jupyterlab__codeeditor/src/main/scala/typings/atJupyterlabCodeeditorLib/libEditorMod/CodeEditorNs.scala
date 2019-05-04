package typings
package atJupyterlabCodeeditorLib.libEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor")
@js.native
object CodeEditorNs extends js.Object {
  /**
    * The location of requested edges.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.top
    - atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.bottom
  */
  trait EdgeLocation extends js.Object
  
  /**
    * The configuration options for an editor.
    */
  trait IConfig extends js.Object {
    /**
      * Whether to automatically close brackets after opening them.
      */
    var autoClosingBrackets: scala.Boolean
    /**
      * User preferred font family for text editors.
      */
    var fontFamily: java.lang.String | scala.Null
    /**
      * User preferred size in pixel of the font used in text editors.
      */
    var fontSize: scala.Double | scala.Null
    /**
      * Whether to insert spaces when pressing Tab.
      */
    var insertSpaces: scala.Boolean
    /**
      * User preferred text line height, as a multiplier of font size.
      */
    var lineHeight: scala.Double | scala.Null
    /**
      * Whether line numbers should be displayed.
      */
    var lineNumbers: scala.Boolean
    /**
      * Control the line wrapping of the editor. Possible values are:
      * - "off", lines will never wrap.
      * - "on", lines will wrap at the viewport border.
      * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
      * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
      */
    var lineWrap: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.off | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.on | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.wordWrapColumn | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.bounded
    /**
      * Whether to highlight matching brackets when one of them is selected.
      */
    var matchBrackets: scala.Boolean
    /**
      * Whether the editor is read-only.
      */
    var readOnly: scala.Boolean
    /**
      * The number of spaces a tab is equal to.
      */
    var tabSize: scala.Double
    /**
      * The column where to break text line.
      */
    var wordWrapColumn: scala.Double
  }
  
  /**
    * An interface describing editor state coordinates.
    */
  trait ICoordinate
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject
       with stdLib.ClientRect
  
  /**
    * The dimension of an element.
    */
  trait IDimension extends js.Object {
    /**
      * The height of an element in pixels.
      */
    val height: scala.Double
    /**
      * The width of an element in pixels.
      */
    val width: scala.Double
  }
  
  /**
    * A widget that provides a code editor.
    */
  @js.native
  trait IEditor
    extends ISelectionOwner
       with atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * The widget of a character in the editor in pixels.
      */
    val charWidth: scala.Double = js.native
    /**
      * A signal emitted when either the top or bottom edge is requested.
      */
    val edgeRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IEditor, EdgeLocation] = js.native
    /**
      * The DOM node that hosts the editor.
      */
    val host: stdLib.HTMLElement = js.native
    /**
      * Get the number of lines in the eidtor.
      */
    val lineCount: scala.Double = js.native
    /**
      * The height of a line in the editor in pixels.
      */
    val lineHeight: scala.Double = js.native
    /**
      * The model used by the editor.
      */
    val model: IModel = js.native
    /**
      * The default selection style for the editor.
      */
    var selectionStyle: ISelectionStyle = js.native
    /**
      * Add a keydown handler to the editor.
      *
      * @param handler - A keydown handler.
      *
      * @returns A disposable that can be used to remove the handler.
      */
    def addKeydownHandler(handler: KeydownHandler): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
    /**
      * Explicitly blur the editor.
      */
    def blur(): scala.Unit = js.native
    /**
      * Clear the undo history.
      */
    def clearHistory(): scala.Unit = js.native
    /**
      * Brings browser focus to this editor text.
      */
    def focus(): scala.Unit = js.native
    /**
      * Get the window coordinates given a cursor position.
      *
      * @param position - The desired position.
      *
      * @returns The coordinates of the position.
      */
    def getCoordinateForPosition(position: IPosition): ICoordinate = js.native
    /**
      * Returns the content for the given line number.
      *
      * @param line - The line of interest.
      *
      * @returns The value of the line.
      *
      * #### Notes
      * Lines are 0-based, and accessing a line out of range returns
      * `undefined`.
      */
    def getLine(line: scala.Double): js.UndefOr[java.lang.String] = js.native
    /**
      * Find an offset for the given position.
      *
      * @param position - The position of interest.
      *
      * @returns The offset at the position, clamped to the extent of the
      * editor contents.
      */
    def getOffsetAt(position: IPosition): scala.Double = js.native
    @JSName("getOption")
    def getOption_autoClosingBrackets(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.autoClosingBrackets): scala.Boolean = js.native
    /**
      * Get a config option for the editor.
      */
    @JSName("getOption")
    def getOption_fontFamily(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontFamily): java.lang.String | scala.Null = js.native
    @JSName("getOption")
    def getOption_fontSize(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontSize): scala.Double | scala.Null = js.native
    @JSName("getOption")
    def getOption_insertSpaces(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.insertSpaces): scala.Boolean = js.native
    @JSName("getOption")
    def getOption_lineHeight(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineHeight): scala.Double | scala.Null = js.native
    @JSName("getOption")
    def getOption_lineNumbers(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineNumbers): scala.Boolean = js.native
    @JSName("getOption")
    def getOption_lineWrap(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineWrap): atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.off | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.on | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.wordWrapColumn | atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.bounded = js.native
    @JSName("getOption")
    def getOption_matchBrackets(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.matchBrackets): scala.Boolean = js.native
    @JSName("getOption")
    def getOption_readOnly(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.readOnly): scala.Boolean = js.native
    @JSName("getOption")
    def getOption_tabSize(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.tabSize): scala.Double = js.native
    @JSName("getOption")
    def getOption_wordWrapColumn(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.wordWrapColumn): scala.Double = js.native
    /**
      * Find a position for the given offset.
      *
      * @param offset - The offset of interest.
      *
      * @returns The position at the offset, clamped to the extent of the
      * editor contents.
      */
    def getPositionAt(offset: scala.Double): js.UndefOr[IPosition] = js.native
    /**
      * Get the cursor position given window coordinates.
      *
      * @param coordinate - The desired coordinate.
      *
      * @returns The position of the coordinates, or null if not
      *   contained in the editor.
      */
    def getPositionForCoordinate(coordinate: ICoordinate): IPosition | scala.Null = js.native
    /**
      * Gets the token at a given position.
      */
    def getTokenForPosition(position: IPosition): IToken = js.native
    /**
      * Gets the list of tokens for the editor model.
      */
    def getTokens(): js.Array[IToken] = js.native
    /**
      * Test whether the editor has keyboard focus.
      */
    def hasFocus(): scala.Boolean = js.native
    /**
      * Inserts a new line at the cursor position and indents it.
      */
    def newIndentedLine(): scala.Unit = js.native
    /**
      * Redo one undone edit.
      */
    def redo(): scala.Unit = js.native
    /**
      * Repaint the editor.
      *
      * #### Notes
      * A repainted editor should fit to its host node.
      */
    def refresh(): scala.Unit = js.native
    /**
      * Resize the editor to fit its host node.
      */
    def resizeToFit(): scala.Unit = js.native
    /**
      * Reveals the given position in the editor.
      *
      * @param position - The desired position to reveal.
      */
    def revealPosition(position: IPosition): scala.Unit = js.native
    /**
      * Reveals the given selection in the editor.
      *
      * @param position - The desired selection to reveal.
      */
    def revealSelection(selection: IRange): scala.Unit = js.native
    def setOption(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineWrap,
      value: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.bounded
    ): scala.Unit = js.native
    def setOption(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineWrap,
      value: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.off
    ): scala.Unit = js.native
    def setOption(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineWrap,
      value: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.on
    ): scala.Unit = js.native
    def setOption(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineWrap,
      value: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.wordWrapColumn
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_autoClosingBrackets(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.autoClosingBrackets,
      value: scala.Boolean
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontFamily): scala.Unit = js.native
    /**
      * Set a config option for the editor.
      */
    @JSName("setOption")
    def setOption_fontFamily(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontFamily,
      value: java.lang.String
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontSize): scala.Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.fontSize, value: scala.Double): scala.Unit = js.native
    @JSName("setOption")
    def setOption_insertSpaces(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.insertSpaces,
      value: scala.Boolean
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineHeight): scala.Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineHeight, value: scala.Double): scala.Unit = js.native
    @JSName("setOption")
    def setOption_lineNumbers(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.lineNumbers,
      value: scala.Boolean
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_matchBrackets(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.matchBrackets,
      value: scala.Boolean
    ): scala.Unit = js.native
    @JSName("setOption")
    def setOption_readOnly(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.readOnly, value: scala.Boolean): scala.Unit = js.native
    @JSName("setOption")
    def setOption_tabSize(option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.tabSize, value: scala.Double): scala.Unit = js.native
    @JSName("setOption")
    def setOption_wordWrapColumn(
      option: atJupyterlabCodeeditorLib.atJupyterlabCodeeditorLibStrings.wordWrapColumn,
      value: scala.Double
    ): scala.Unit = js.native
    def setSize(): scala.Unit = js.native
    /**
      * Set the size of the editor.
      *
      * @param size - The desired size.
      *
      * #### Notes
      * Use `null` if the size is unknown.
      */
    def setSize(size: IDimension): scala.Unit = js.native
    /**
      * Undo one edit (if any undo events are stored).
      */
    def undo(): scala.Unit = js.native
  }
  
  /**
    * An interface to manage selections by selection owners.
    *
    * #### Definitions
    * - a user code that has an associated uuid is called a selection owner, see `CodeEditor.ISelectionOwner`
    * - a selection belongs to a selection owner only if it is associated with the owner by an uuid, see `CodeEditor.ITextSelection`
    *
    * #### Read access
    * - any user code can observe any selection
    *
    * #### Write access
    * - if a user code is a selection owner then:
    *   - it can change selections belonging to it
    *   - but it must not change selections belonging to other selection owners
    * - otherwise it must not change any selection
    */
  /**
    * An editor model.
    */
  trait IModel
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * A mime type of the model.
      *
      * #### Notes
      * It is never `null`, the default mime type is `text/plain`.
      */
    var mimeType: java.lang.String
    /**
      * A signal emitted when a property changes.
      */
    var mimeTypeChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[java.lang.String]]
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      */
    val modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB
    /**
      * The currently selected code.
      */
    val selections: atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[js.Array[ITextSelection]]
    /**
      * The text stored in the model.
      */
    val value: atJupyterlabObservablesLib.libObservablestringMod.IObservableString
  }
  
  /**
    * The options used to initialize an editor.
    */
  trait IOptions extends js.Object {
    /**
      * The configuration options for the editor.
      */
    var config: js.UndefOr[stdLib.Partial[IConfig]] = js.undefined
    /**
      * The host widget used by the editor.
      */
    var host: stdLib.HTMLElement
    /**
      * The model used by the editor.
      */
    var model: IModel
    /**
      * The default selection style for the editor.
      */
    var selectionStyle: js.UndefOr[stdLib.Partial[ISelectionStyle]] = js.undefined
    /**
      * The desired uuid for the editor.
      */
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * A zero-based position in the editor.
    */
  trait IPosition
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * The cursor column number.
      */
    val column: scala.Double
    /**
      * The cursor line number.
      */
    val line: scala.Double
  }
  
  /**
    * A range.
    */
  trait IRange
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * The position of the last character in the current range.
      *
      * #### Notes
      * If this position is less than [start] then the range is considered
      * to be backward.
      */
    val end: IPosition
    /**
      * The position of the first character in the current range.
      *
      * #### Notes
      * If this position is greater than [end] then the range is considered
      * to be backward.
      */
    val start: IPosition
  }
  
  /**
    * A selection owner.
    */
  trait ISelectionOwner extends js.Object {
    /**
      * The uuid of this selection owner.
      */
    var uuid: java.lang.String
    /**
      * Returns the primary position of the cursor, never `null`.
      */
    def getCursorPosition(): IPosition
    /**
      * Returns the primary selection, never `null`.
      */
    def getSelection(): IRange
    /**
      * Gets the selections for all the cursors, never `null` or empty.
      */
    def getSelections(): js.Array[IRange]
    /**
      * Set the primary position of the cursor.
      *
      * @param position - The new primary position.
      *
      * #### Notes
      * This will remove any secondary cursors.
      */
    def setCursorPosition(position: IPosition): scala.Unit
    /**
      * Set the primary selection.
      *
      * @param selection - The desired selection range.
      *
      * #### Notes
      * This will remove any secondary cursors.
      */
    def setSelection(selection: IRange): scala.Unit
    /**
      * Sets the selections for all the cursors.
      *
      * @param selections - The new selections.
      *
      * #### Notes
      * Cursors will be removed or added, as necessary.
      * Passing an empty array resets a cursor position to the start of a
      * document.
      */
    def setSelections(selections: js.Array[IRange]): scala.Unit
  }
  
  /**
    * A selection style.
    */
  trait ISelectionStyle
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * A class name added to a selection.
      */
    var className: java.lang.String
    /**
      * A color for UI elements.
      */
    var color: java.lang.String
    /**
      * A display name added to a selection.
      */
    var displayName: java.lang.String
  }
  
  /**
    * A text selection.
    */
  trait ITextSelection extends IRange {
    /**
      * The style of this selection.
      */
    val style: ISelectionStyle
    /**
      * The uuid of the text selection owner.
      */
    val uuid: java.lang.String
  }
  
  /**
    * An interface for a text token, such as a word, keyword, or variable.
    */
  trait IToken extends js.Object {
    /**
      * The offset of the token in the code editor.
      */
    var offset: scala.Double
    /**
      * An optional type for the token.
      */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The value of the token.
      */
    var value: java.lang.String
  }
  
  /**
    * The default implementation of the editor model.
    */
  @js.native
  /**
    * Construct a new Model.
    */
  class Model () extends IModel {
    def this(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ModelNs.IOptions) = this()
    var _isDisposed: js.Any = js.native
    var _mimeTypeChanged: js.Any = js.native
    var _onMimeTypeChanged: js.Any = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: scala.Boolean = js.native
    /**
      * A mime type of the model.
      *
      * #### Notes
      * It is never `null`, the default mime type is `text/plain`.
      */
    /* CompleteClass */
    override var mimeType: java.lang.String = js.native
    /**
      * A signal emitted when a property changes.
      */
    /* CompleteClass */
    override var mimeTypeChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[java.lang.String]] = js.native
    /**
      * A signal emitted when a mimetype changes.
      */
    @JSName("mimeTypeChanged")
    val mimeTypeChanged_Model: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
        this.type, 
        atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[java.lang.String]
      ] = js.native
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      */
    /* CompleteClass */
    override val modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB = js.native
    /**
      * The currently selected code.
      */
    /* CompleteClass */
    override val selections: atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[js.Array[ITextSelection]] = js.native
    /**
      * The text stored in the model.
      */
    /* CompleteClass */
    override val value: atJupyterlabObservablesLib.libObservablestringMod.IObservableString = js.native
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
  }
  
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: IConfig = js.native
  /**
    * The default selection style.
    */
  val defaultSelectionStyle: ISelectionStyle = js.native
  @JSName("Model")
  @js.native
  object ModelNs extends js.Object {
    trait IOptions extends js.Object {
      /**
        * The mimetype of the model.
        */
      var mimeType: js.UndefOr[java.lang.String] = js.undefined
      /**
        * An optional modelDB for storing model state.
        */
      var modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.undefined
      /**
        * The initial value of the model.
        */
      var value: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[/* options */ IOptions, IEditor]
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[/* instance */ IEditor, /* event */ stdLib.KeyboardEvent, scala.Boolean]
}

