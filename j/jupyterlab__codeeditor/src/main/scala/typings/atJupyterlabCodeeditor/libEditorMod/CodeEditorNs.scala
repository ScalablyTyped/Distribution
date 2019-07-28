package typings.atJupyterlabCodeeditor.libEditorMod

import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.autoClosingBrackets
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bounded
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.codeFolding
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.fontFamily
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.fontSize
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.insertSpaces
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineNumbers
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineWrap
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.matchBrackets
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.off
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.on
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.readOnly
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.rulers
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.tabSize
import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.wordWrapColumn
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.EdgeLocation
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IConfig
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ICoordinate
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IDimension
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IOptions
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IPosition
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IRange
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ISelectionOwner
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ISelectionStyle
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ITextSelection
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IToken
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.KeydownHandler
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Partial
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
    - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.top
    - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.topLine
    - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bottom
  */
  trait EdgeLocation extends js.Object
  
  /**
    * The configuration options for an editor.
    */
  trait IConfig extends js.Object {
    /**
      * Whether to automatically close brackets after opening them.
      */
    var autoClosingBrackets: Boolean
    /**
      * Wheter to allow code folding
      */
    var codeFolding: Boolean
    /**
      * User preferred font family for text editors.
      */
    var fontFamily: String | Null
    /**
      * User preferred size in pixel of the font used in text editors.
      */
    var fontSize: Double | Null
    /**
      * Whether to insert spaces when pressing Tab.
      */
    var insertSpaces: Boolean
    /**
      * User preferred text line height, as a multiplier of font size.
      */
    var lineHeight: Double | Null
    /**
      * Whether line numbers should be displayed.
      */
    var lineNumbers: Boolean
    /**
      * Control the line wrapping of the editor. Possible values are:
      * - "off", lines will never wrap.
      * - "on", lines will wrap at the viewport border.
      * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
      * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
      */
    var lineWrap: off | on | wordWrapColumn | bounded
    /**
      * Whether to highlight matching brackets when one of them is selected.
      */
    var matchBrackets: Boolean
    /**
      * Whether the editor is read-only.
      */
    var readOnly: Boolean
    /**
      * Column index at which rulers should be added.
      */
    var rulers: js.Array[Double]
    /**
      * The number of spaces a tab is equal to.
      */
    var tabSize: Double
    /**
      * The column where to break text line.
      */
    var wordWrapColumn: Double
  }
  
  /**
    * An interface describing editor state coordinates.
    */
  trait ICoordinate
    extends JSONObject
       with ClientRect
  
  /**
    * The dimension of an element.
    */
  trait IDimension extends js.Object {
    /**
      * The height of an element in pixels.
      */
    val height: Double
    /**
      * The width of an element in pixels.
      */
    val width: Double
  }
  
  /**
    * A widget that provides a code editor.
    */
  @js.native
  trait IEditor
    extends ISelectionOwner
       with IDisposable {
    /**
      * The widget of a character in the editor in pixels.
      */
    val charWidth: Double = js.native
    /**
      * A signal emitted when either the top or bottom edge is requested.
      */
    val edgeRequested: ISignal[IEditor, EdgeLocation] = js.native
    /**
      * The DOM node that hosts the editor.
      */
    val host: HTMLElement = js.native
    /**
      * Get the number of lines in the eidtor.
      */
    val lineCount: Double = js.native
    /**
      * The height of a line in the editor in pixels.
      */
    val lineHeight: Double = js.native
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
    def addKeydownHandler(handler: KeydownHandler): IDisposable = js.native
    /**
      * Explicitly blur the editor.
      */
    def blur(): Unit = js.native
    /**
      * Clear the undo history.
      */
    def clearHistory(): Unit = js.native
    /**
      * Brings browser focus to this editor text.
      */
    def focus(): Unit = js.native
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
    def getLine(line: Double): js.UndefOr[String] = js.native
    /**
      * Find an offset for the given position.
      *
      * @param position - The position of interest.
      *
      * @returns The offset at the position, clamped to the extent of the
      * editor contents.
      */
    def getOffsetAt(position: IPosition): Double = js.native
    @JSName("getOption")
    def getOption_autoClosingBrackets(option: autoClosingBrackets): Boolean = js.native
    @JSName("getOption")
    def getOption_codeFolding(option: codeFolding): Boolean = js.native
    /**
      * Get a config option for the editor.
      */
    @JSName("getOption")
    def getOption_fontFamily(option: fontFamily): String | Null = js.native
    @JSName("getOption")
    def getOption_fontSize(option: fontSize): Double | Null = js.native
    @JSName("getOption")
    def getOption_insertSpaces(option: insertSpaces): Boolean = js.native
    @JSName("getOption")
    def getOption_lineHeight(option: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight): Double | Null = js.native
    @JSName("getOption")
    def getOption_lineNumbers(option: lineNumbers): Boolean = js.native
    @JSName("getOption")
    def getOption_lineWrap(option: lineWrap): off | on | wordWrapColumn | bounded = js.native
    @JSName("getOption")
    def getOption_matchBrackets(option: matchBrackets): Boolean = js.native
    @JSName("getOption")
    def getOption_readOnly(option: readOnly): Boolean = js.native
    @JSName("getOption")
    def getOption_rulers(option: rulers): js.Array[Double] = js.native
    @JSName("getOption")
    def getOption_tabSize(option: tabSize): Double = js.native
    @JSName("getOption")
    def getOption_wordWrapColumn(option: wordWrapColumn): Double = js.native
    /**
      * Find a position for the given offset.
      *
      * @param offset - The offset of interest.
      *
      * @returns The position at the offset, clamped to the extent of the
      * editor contents.
      */
    def getPositionAt(offset: Double): js.UndefOr[IPosition] = js.native
    /**
      * Get the cursor position given window coordinates.
      *
      * @param coordinate - The desired coordinate.
      *
      * @returns The position of the coordinates, or null if not
      *   contained in the editor.
      */
    def getPositionForCoordinate(coordinate: ICoordinate): IPosition | Null = js.native
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
    def hasFocus(): Boolean = js.native
    /**
      * Inserts a new line at the cursor position and indents it.
      */
    def newIndentedLine(): Unit = js.native
    /**
      * Redo one undone edit.
      */
    def redo(): Unit = js.native
    /**
      * Repaint the editor.
      *
      * #### Notes
      * A repainted editor should fit to its host node.
      */
    def refresh(): Unit = js.native
    /**
      * Resize the editor to fit its host node.
      */
    def resizeToFit(): Unit = js.native
    /**
      * Reveals the given position in the editor.
      *
      * @param position - The desired position to reveal.
      */
    def revealPosition(position: IPosition): Unit = js.native
    /**
      * Reveals the given selection in the editor.
      *
      * @param position - The desired selection to reveal.
      */
    def revealSelection(selection: IRange): Unit = js.native
    def setOption(option: lineWrap, value: bounded): Unit = js.native
    def setOption(option: lineWrap, value: off): Unit = js.native
    def setOption(option: lineWrap, value: on): Unit = js.native
    def setOption(option: lineWrap, value: wordWrapColumn): Unit = js.native
    @JSName("setOption")
    def setOption_autoClosingBrackets(option: autoClosingBrackets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_codeFolding(option: codeFolding, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily): Unit = js.native
    /**
      * Set a config option for the editor.
      */
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_insertSpaces(option: insertSpaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.lineHeight, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_lineNumbers(option: lineNumbers, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_matchBrackets(option: matchBrackets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_readOnly(option: readOnly, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_rulers(option: rulers, value: js.Array[Double]): Unit = js.native
    @JSName("setOption")
    def setOption_tabSize(option: tabSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_wordWrapColumn(option: wordWrapColumn, value: Double): Unit = js.native
    def setSize(): Unit = js.native
    /**
      * Set the size of the editor.
      *
      * @param size - The desired size.
      *
      * #### Notes
      * Use `null` if the size is unknown.
      */
    def setSize(size: IDimension): Unit = js.native
    /**
      * Undo one edit (if any undo events are stored).
      */
    def undo(): Unit = js.native
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
  trait IModel extends IDisposable {
    /**
      * A mime type of the model.
      *
      * #### Notes
      * It is never `null`, the default mime type is `text/plain`.
      */
    var mimeType: String
    /**
      * A signal emitted when a property changes.
      */
    var mimeTypeChanged: ISignal[IModel, IChangedArgs[String]]
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      */
    val modelDB: IModelDB
    /**
      * The currently selected code.
      */
    val selections: IObservableMap[js.Array[ITextSelection]]
    /**
      * The text stored in the model.
      */
    val value: IObservableString
  }
  
  /**
    * The options used to initialize an editor.
    */
  trait IOptions extends js.Object {
    /**
      * The configuration options for the editor.
      */
    var config: js.UndefOr[Partial[IConfig]] = js.undefined
    /**
      * The host widget used by the editor.
      */
    var host: HTMLElement
    /**
      * The model used by the editor.
      */
    var model: IModel
    /**
      * The default selection style for the editor.
      */
    var selectionStyle: js.UndefOr[Partial[ISelectionStyle]] = js.undefined
    /**
      * The desired uuid for the editor.
      */
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  /**
    * A zero-based position in the editor.
    */
  trait IPosition extends JSONObject {
    /**
      * The cursor column number.
      */
    val column: Double
    /**
      * The cursor line number.
      */
    val line: Double
  }
  
  /**
    * A range.
    */
  trait IRange extends JSONObject {
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
    var uuid: String
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
    def setCursorPosition(position: IPosition): Unit
    /**
      * Set the primary selection.
      *
      * @param selection - The desired selection range.
      *
      * #### Notes
      * This will remove any secondary cursors.
      */
    def setSelection(selection: IRange): Unit
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
    def setSelections(selections: js.Array[IRange]): Unit
  }
  
  /**
    * A selection style.
    */
  trait ISelectionStyle extends JSONObject {
    /**
      * A class name added to a selection.
      */
    var className: String
    /**
      * A color for UI elements.
      */
    var color: String
    /**
      * A display name added to a selection.
      */
    var displayName: String
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
    val uuid: String
  }
  
  /**
    * An interface for a text token, such as a word, keyword, or variable.
    */
  trait IToken extends js.Object {
    /**
      * The offset of the token in the code editor.
      */
    var offset: Double
    /**
      * An optional type for the token.
      */
    var `type`: js.UndefOr[String] = js.undefined
    /**
      * The value of the token.
      */
    var value: String
  }
  
  /**
    * The default implementation of the editor model.
    */
  @js.native
  /**
    * Construct a new Model.
    */
  class Model () extends IModel {
    def this(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ModelNs.IOptions) = this()
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
    override val isDisposed: Boolean = js.native
    /**
      * A mime type of the model.
      *
      * #### Notes
      * It is never `null`, the default mime type is `text/plain`.
      */
    /* CompleteClass */
    override var mimeType: String = js.native
    /**
      * A signal emitted when a property changes.
      */
    /* CompleteClass */
    override var mimeTypeChanged: ISignal[IModel, IChangedArgs[String]] = js.native
    /**
      * A signal emitted when a mimetype changes.
      */
    @JSName("mimeTypeChanged")
    val mimeTypeChanged_Model: ISignal[this.type, IChangedArgs[String]] = js.native
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      */
    /* CompleteClass */
    override val modelDB: IModelDB = js.native
    /**
      * The currently selected code.
      */
    /* CompleteClass */
    override val selections: IObservableMap[js.Array[ITextSelection]] = js.native
    /**
      * The text stored in the model.
      */
    /* CompleteClass */
    override val value: IObservableString = js.native
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
    override def dispose(): Unit = js.native
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
      var mimeType: js.UndefOr[String] = js.undefined
      /**
        * An optional modelDB for storing model state.
        */
      var modelDB: js.UndefOr[IModelDB] = js.undefined
      /**
        * The initial value of the model.
        */
      var value: js.UndefOr[String] = js.undefined
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
  type KeydownHandler = js.Function2[/* instance */ IEditor, /* event */ KeyboardEvent, Boolean]
}

