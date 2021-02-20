package typings.jupyterlabCodeeditor.editorMod

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.anon.PartialISelectionStyle
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.autoClosingBrackets
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.codeFolding
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.fontFamily
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.fontSize
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.handlePaste
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.insertSpaces
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.lineNumbers
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.lineWrap
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.matchBrackets
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.readOnly
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.rulers
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.tabSize
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeEditor {
  
  /**
    * The default implementation of the editor model.
    */
  @JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.Model")
  @js.native
  /**
    * Construct a new Model.
    */
  class Model () extends IModel {
    def this(options: typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
    
    var _isDisposed: js.Any = js.native
    
    var _mimeTypeChanged: js.Any = js.native
    
    var _onMimeTypeChanged: js.Any = js.native
    
    /**
      * Whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MModel: Boolean = js.native
    
    /**
      * A signal emitted when a mimetype changes.
      */
    @JSName("mimeTypeChanged")
    def mimeTypeChanged_MModel: ISignal[this.type, IChangedArgs[String, String, String]] = js.native
    
    /**
      * A mime type of the model.
      */
    @JSName("mimeType")
    def mimeType_MModel: String = js.native
    
    /**
      * Get the selections for the model.
      */
    @JSName("selections")
    def selections_MModel: IObservableMap[js.Array[ITextSelection]] = js.native
    
    /**
      * Get the value of the model.
      */
    @JSName("value")
    def value_MModel: IObservableString = js.native
  }
  object Model {
    
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The mimetype of the model.
        */
      var mimeType: js.UndefOr[String] = js.native
      
      /**
        * An optional modelDB for storing model state.
        */
      var modelDB: js.UndefOr[IModelDB] = js.native
      
      /**
        * The initial value of the model.
        */
      var value: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        @scala.inline
        def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
  
  /**
    * The default configuration options for an editor.
    */
  @JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.defaultConfig")
  @js.native
  val defaultConfig: IConfig = js.native
  
  /**
    * The default selection style.
    */
  @JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.defaultSelectionStyle")
  @js.native
  val defaultSelectionStyle: ISelectionStyle = js.native
  
  /**
    * The location of requested edges.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top
    - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine
    - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom
  */
  trait EdgeLocation extends StObject
  object EdgeLocation {
    
    @scala.inline
    def bottom: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom = "bottom".asInstanceOf[typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom]
    
    @scala.inline
    def top: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top = "top".asInstanceOf[typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top]
    
    @scala.inline
    def topLine: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine = "topLine".asInstanceOf[typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine]
  }
  
  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[/* options */ IOptions, IEditor]
  
  /**
    * The configuration options for an editor.
    */
  @js.native
  trait IConfig extends StObject {
    
    /**
      * Whether to automatically close brackets after opening them.
      */
    var autoClosingBrackets: Boolean = js.native
    
    /**
      * Wheter to allow code folding
      */
    var codeFolding: Boolean = js.native
    
    /**
      * User preferred font family for text editors.
      */
    var fontFamily: String | Null = js.native
    
    /**
      * User preferred size in pixel of the font used in text editors.
      */
    var fontSize: Double | Null = js.native
    
    /**
      * Whether the editor should handle paste events.
      */
    var handlePaste: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to insert spaces when pressing Tab.
      */
    var insertSpaces: Boolean = js.native
    
    /**
      * User preferred text line height, as a multiplier of font size.
      */
    var lineHeight: Double | Null = js.native
    
    /**
      * Whether line numbers should be displayed.
      */
    var lineNumbers: Boolean = js.native
    
    /**
      * Control the line wrapping of the editor. Possible values are:
      * - "off", lines will never wrap.
      * - "on", lines will wrap at the viewport border.
      * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
      * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
      */
    var lineWrap: off | on | wordWrapColumn | bounded = js.native
    
    /**
      * Whether to highlight matching brackets when one of them is selected.
      */
    var matchBrackets: Boolean = js.native
    
    /**
      * Whether the editor is read-only.
      */
    var readOnly: Boolean = js.native
    
    /**
      * Column index at which rulers should be added.
      */
    var rulers: js.Array[Double] = js.native
    
    /**
      * The number of spaces a tab is equal to.
      */
    var tabSize: Double = js.native
    
    /**
      * The column where to break text line.
      */
    var wordWrapColumn: Double = js.native
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
      tabSize: Double,
      wordWrapColumn: Double
    ): IConfig = {
      val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      @scala.inline
      def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      @scala.inline
      def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value :_*))
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An interface describing editor state coordinates.
    */
  @js.native
  trait ICoordinate
    extends JSONObject
       with ClientRect
  object ICoordinate {
    
    @scala.inline
    def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): ICoordinate = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoordinate]
    }
  }
  
  /**
    * The dimension of an element.
    */
  @js.native
  trait IDimension extends StObject {
    
    /**
      * The height of an element in pixels.
      */
    val height: Double = js.native
    
    /**
      * The width of an element in pixels.
      */
    val width: Double = js.native
  }
  object IDimension {
    
    @scala.inline
    def apply(height: Double, width: Double): IDimension = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDimension]
    }
    
    @scala.inline
    implicit class IDimensionMutableBuilder[Self <: IDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A widget that provides a code editor.
    */
  @js.native
  trait IEditor
    extends ISelectionOwner
       with IDisposable {
    
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
      * The widget of a character in the editor in pixels.
      */
    val charWidth: Double = js.native
    
    /**
      * Clear the undo history.
      */
    def clearHistory(): Unit = js.native
    
    /**
      * A signal emitted when either the top or bottom edge is requested.
      */
    val edgeRequested: ISignal[IEditor, EdgeLocation] = js.native
    
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
    def getOption_handlePaste(option: handlePaste): js.UndefOr[Boolean] = js.native
    @JSName("getOption")
    def getOption_insertSpaces(option: insertSpaces): Boolean = js.native
    @JSName("getOption")
    def getOption_lineHeight(option: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.lineHeight): Double | Null = js.native
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
      * Replaces selection with the given text.
      */
    var replaceSelection: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
    
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
    
    /**
      * The default selection style for the editor.
      */
    var selectionStyle: ISelectionStyle = js.native
    
    def setOption(option: lineWrap, value: bounded): Unit = js.native
    def setOption(option: lineWrap, value: off): Unit = js.native
    def setOption(option: lineWrap, value: on): Unit = js.native
    def setOption(option: lineWrap, value: wordWrapColumn): Unit = js.native
    @JSName("setOption")
    def setOption_autoClosingBrackets(option: autoClosingBrackets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_codeFolding(option: codeFolding, value: Boolean): Unit = js.native
    /**
      * Set a config option for the editor.
      */
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_handlePaste(option: handlePaste): Unit = js.native
    @JSName("setOption")
    def setOption_handlePaste(option: handlePaste, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_insertSpaces(option: insertSpaces, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.lineHeight): Unit = js.native
    @JSName("setOption")
    def setOption_lineHeight(option: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.lineHeight, value: Double): Unit = js.native
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
    
    /**
      * Set the size of the editor.
      *
      * @param size - The desired size.
      *
      * #### Notes
      * Use `null` if the size is unknown.
      */
    def setSize(): Unit = js.native
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
  @js.native
  trait IModel extends IDisposable {
    
    /**
      * A mime type of the model.
      *
      * #### Notes
      * It is never `null`, the default mime type is `text/plain`.
      */
    var mimeType: String = js.native
    
    /**
      * A signal emitted when a property changes.
      */
    var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]] = js.native
    
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      */
    val modelDB: IModelDB = js.native
    
    /**
      * The currently selected code.
      */
    val selections: IObservableMap[js.Array[ITextSelection]] = js.native
    
    /**
      * The text stored in the model.
      */
    val value: IObservableString = js.native
  }
  object IModel {
    
    @scala.inline
    def apply(
      dispose: () => Unit,
      isDisposed: Boolean,
      mimeType: String,
      mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      value: IObservableString
    ): IModel = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit class IModelMutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeChanged(value: ISignal[IModel, IChangedArgs[String, String, String]]): Self = StObject.set(x, "mimeTypeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelections(value: IObservableMap[js.Array[ITextSelection]]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: IObservableString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The options used to initialize an editor.
    */
  @js.native
  trait IOptions extends StObject {
    
    /**
      * The configuration options for the editor.
      */
    var config: js.UndefOr[PartialIConfig] = js.native
    
    /**
      * The host widget used by the editor.
      */
    var host: HTMLElement = js.native
    
    /**
      * The model used by the editor.
      */
    var model: IModel = js.native
    
    /**
      * The default selection style for the editor.
      */
    var selectionStyle: js.UndefOr[PartialISelectionStyle] = js.native
    
    /**
      * The desired uuid for the editor.
      */
    var uuid: js.UndefOr[String] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(host: HTMLElement, model: IModel): IOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: PartialIConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStyle(value: PartialISelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  /**
    * A zero-based position in the editor.
    */
  @js.native
  trait IPosition extends JSONObject {
    
    /**
      * The cursor column number.
      */
    val column: Double = js.native
    
    /**
      * The cursor line number.
      */
    val line: Double = js.native
  }
  object IPosition {
    
    @scala.inline
    def apply(column: Double, line: Double): IPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPosition]
    }
    
    @scala.inline
    implicit class IPositionMutableBuilder[Self <: IPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A range.
    */
  @js.native
  trait IRange extends JSONObject {
    
    /**
      * The position of the last character in the current range.
      *
      * #### Notes
      * If this position is less than [start] then the range is considered
      * to be backward.
      */
    val end: IPosition = js.native
    
    /**
      * The position of the first character in the current range.
      *
      * #### Notes
      * If this position is greater than [end] then the range is considered
      * to be backward.
      */
    val start: IPosition = js.native
  }
  object IRange {
    
    @scala.inline
    def apply(end: IPosition, start: IPosition): IRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRange]
    }
    
    @scala.inline
    implicit class IRangeMutableBuilder[Self <: IRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: IPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: IPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A selection owner.
    */
  @js.native
  trait ISelectionOwner extends StObject {
    
    /**
      * Returns the primary position of the cursor, never `null`.
      */
    def getCursorPosition(): IPosition = js.native
    
    /**
      * Returns the primary selection, never `null`.
      */
    def getSelection(): IRange = js.native
    
    /**
      * Gets the selections for all the cursors, never `null` or empty.
      */
    def getSelections(): js.Array[IRange] = js.native
    
    /**
      * Set the primary position of the cursor.
      *
      * @param position - The new primary position.
      *
      * #### Notes
      * This will remove any secondary cursors.
      */
    def setCursorPosition(position: IPosition): Unit = js.native
    
    /**
      * Set the primary selection.
      *
      * @param selection - The desired selection range.
      *
      * #### Notes
      * This will remove any secondary cursors.
      */
    def setSelection(selection: IRange): Unit = js.native
    
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
    def setSelections(selections: js.Array[IRange]): Unit = js.native
    
    /**
      * The uuid of this selection owner.
      */
    var uuid: String = js.native
  }
  object ISelectionOwner {
    
    @scala.inline
    def apply(
      getCursorPosition: () => IPosition,
      getSelection: () => IRange,
      getSelections: () => js.Array[IRange],
      setCursorPosition: IPosition => Unit,
      setSelection: IRange => Unit,
      setSelections: js.Array[IRange] => Unit,
      uuid: String
    ): ISelectionOwner = {
      val __obj = js.Dynamic.literal(getCursorPosition = js.Any.fromFunction0(getCursorPosition), getSelection = js.Any.fromFunction0(getSelection), getSelections = js.Any.fromFunction0(getSelections), setCursorPosition = js.Any.fromFunction1(setCursorPosition), setSelection = js.Any.fromFunction1(setSelection), setSelections = js.Any.fromFunction1(setSelections), uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectionOwner]
    }
    
    @scala.inline
    implicit class ISelectionOwnerMutableBuilder[Self <: ISelectionOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCursorPosition(value: () => IPosition): Self = StObject.set(x, "getCursorPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelection(value: () => IRange): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelections(value: () => js.Array[IRange]): Self = StObject.set(x, "getSelections", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCursorPosition(value: IPosition => Unit): Self = StObject.set(x, "setCursorPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSelection(value: IRange => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSelections(value: js.Array[IRange] => Unit): Self = StObject.set(x, "setSelections", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A selection style.
    */
  @js.native
  trait ISelectionStyle extends JSONObject {
    
    /**
      * A class name added to a selection.
      */
    var className: String = js.native
    
    /**
      * A color for UI elements.
      */
    var color: String = js.native
    
    /**
      * A display name added to a selection.
      */
    var displayName: String = js.native
  }
  object ISelectionStyle {
    
    @scala.inline
    def apply(className: String, color: String, displayName: String): ISelectionStyle = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectionStyle]
    }
    
    @scala.inline
    implicit class ISelectionStyleMutableBuilder[Self <: ISelectionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A text selection.
    */
  @js.native
  trait ITextSelection extends IRange {
    
    /**
      * The style of this selection.
      */
    val style: ISelectionStyle = js.native
    
    /**
      * The uuid of the text selection owner.
      */
    val uuid: String = js.native
  }
  object ITextSelection {
    
    @scala.inline
    def apply(end: IPosition, start: IPosition, style: ISelectionStyle, uuid: String): ITextSelection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextSelection]
    }
    
    @scala.inline
    implicit class ITextSelectionMutableBuilder[Self <: ITextSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: ISelectionStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An interface for a text token, such as a word, keyword, or variable.
    */
  @js.native
  trait IToken extends StObject {
    
    /**
      * The offset of the token in the code editor.
      */
    var offset: Double = js.native
    
    /**
      * An optional type for the token.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * The value of the token.
      */
    var value: String = js.native
  }
  object IToken {
    
    @scala.inline
    def apply(offset: Double, value: String): IToken = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    @scala.inline
    implicit class ITokenMutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[/* instance */ IEditor, /* event */ KeyboardEvent, Boolean]
}
