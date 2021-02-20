package typings.jupyterlabCompleter

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItem
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItems
import typings.jupyterlabCompleter.widgetMod.Completer.IModel
import typings.jupyterlabCompleter.widgetMod.Completer.IOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/completer/lib/widget", "Completer")
  @js.native
  class Completer protected () extends Widget {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
    
    var _activeIndex: js.Any = js.native
    
    var _createCompletionItemNode: js.Any = js.native
    
    var _createIItemNode: js.Any = js.native
    
    /**
      * Cycle through the available completer items.
      *
      * #### Notes
      * When the user cycles all the way `down` to the last index, subsequent
      * `down` cycles will remain on the last index. When the user cycles `up` to
      * the first item, subsequent `up` cycles will remain on the first cycle.
      */
    var _cycle: js.Any = js.native
    
    var _editor: js.Any = js.native
    
    /**
      * Handle keydown events for the widget.
      */
    var _evtKeydown: js.Any = js.native
    
    /**
      * Handle mousedown events for the widget.
      */
    var _evtMousedown: js.Any = js.native
    
    /**
      * Handle scroll events for the widget
      */
    var _evtScroll: js.Any = js.native
    
    var _model: js.Any = js.native
    
    /**
      * Populate the completer up to the longest initial subset of items.
      *
      * @returns `true` if a subset match was found and populated.
      */
    var _populateSubset: js.Any = js.native
    
    var _renderer: js.Any = js.native
    
    var _resetFlag: js.Any = js.native
    
    var _selected: js.Any = js.native
    
    /**
      * Set the visible dimensions of the widget.
      */
    var _setGeometry: js.Any = js.native
    
    /**
      * Update the display-state and contents of the documentation panel
      */
    var _updateDocPanel: js.Any = js.native
    
    var _visibilityChanged: js.Any = js.native
    
    /**
      * The editor used by the completion widget.
      */
    def editor: IEditor | Null = js.native
    def editor_=(newValue: IEditor | Null): Unit = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the dock panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The model used by the completer widget.
      */
    def model: IModel | Null = js.native
    def model_=(model: IModel | Null): Unit = js.native
    
    /**
      * Handle model state changes.
      */
    /* protected */ def onModelStateChanged(): Unit = js.native
    
    /**
      * Reset the widget.
      */
    def reset(): Unit = js.native
    
    /**
      * Emit the selected signal for the current active item and reset.
      */
    def selectActive(): Unit = js.native
    
    /**
      * A signal emitted when a selection is made from the completer menu.
      */
    def selected: ISignal[this.type, String] = js.native
    
    /**
      * A signal emitted when the completer widget's visibility changes.
      *
      * #### Notes
      * This signal is useful when there are multiple floating widgets that may
      * contend with the same space and ought to be mutually exclusive.
      */
    def visibilityChanged: ISignal[this.type, Unit] = js.native
  }
  object Completer {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/completer/lib/widget", "Completer.Renderer")
    @js.native
    class Renderer () extends IRenderer {
      
      /**
        * Attaches type and match nodes to base node.
        */
      var _constructNode: js.Any = js.native
      
      /**
        * Create base node with the value to be inserted
        */
      var _createBaseNode: js.Any = js.native
      
      /**
        * Create match node to highlight potential prefix match within result.
        */
      var _createMatchNode: js.Any = js.native
      
      /**
        * Create an item node from an ICompletionItem for a text completer menu.
        */
      @JSName("createCompletionItemNode")
      def createCompletionItemNode_MRenderer(item: ICompletionItem, orderedTypes: js.Array[String]): HTMLLIElement = js.native
    }
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/completer/lib/widget", "Completer.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * A cursor span.
      */
    @js.native
    trait ICursorSpan extends JSONObject {
      
      /**
        * The end position of the cursor.
        */
      var end: Double = js.native
      
      /**
        * The start position of the cursor.
        */
      var start: Double = js.native
    }
    object ICursorSpan {
      
      @scala.inline
      def apply(end: Double, start: Double): ICursorSpan = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICursorSpan]
      }
      
      @scala.inline
      implicit class ICursorSpanMutableBuilder[Self <: ICursorSpan] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A completer menu item.
      */
    @js.native
    trait IItem extends StObject {
      
      /**
        * The raw text of a visible completer item.
        */
      var raw: String = js.native
      
      /**
        * The highlighted, marked up text of a visible completer item.
        */
      var text: String = js.native
    }
    object IItem {
      
      @scala.inline
      def apply(raw: String, text: String): IItem = {
        val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItem]
      }
      
      @scala.inline
      implicit class IItemMutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The data model backing a code completer widget.
      */
    @js.native
    trait IModel extends IDisposable {
      
      /**
        * Get the list of visible CompletionItems in the completer menu.
        */
      var completionItems: js.UndefOr[js.Function0[ICompletionItems]] = js.native
      
      /**
        * Create a resolved patch between the original state and a patch string.
        */
      def createPatch(patch: String): js.UndefOr[IPatch] = js.native
      
      /**
        * The current text state details.
        */
      var current: ITextState | Null = js.native
      
      /**
        * The cursor details that the API has used to return matching options.
        */
      var cursor: ICursorSpan | Null = js.native
      
      /**
        * Handle a cursor change.
        */
      def handleCursorChange(change: ITextState): Unit = js.native
      
      /**
        * Handle a completion request.
        */
      def handleTextChange(change: ITextState): Unit = js.native
      
      /**
        * Get the of visible items in the completer menu.
        */
      def items(): IIterator[IItem] = js.native
      
      /**
        * Get the unfiltered options in a completer menu.
        */
      def options(): IIterator[String] = js.native
      
      /**
        * An ordered list of types used for visual encoding.
        */
      def orderedTypes(): js.Array[String] = js.native
      
      /**
        * The original completer request details.
        */
      var original: ITextState | Null = js.native
      
      /**
        * The query against which items are filtered.
        */
      var query: String = js.native
      
      /**
        * Reset the state of the model and emit a state change signal.
        *
        * @param hard - Reset even if a subset match is in progress.
        */
      def reset(): Unit = js.native
      def reset(hard: Boolean): Unit = js.native
      
      /**
        * Set the list of visible CompletionItems in the completer menu.
        */
      var setCompletionItems: js.UndefOr[js.Function1[/* items */ ICompletionItems, Unit]] = js.native
      
      /**
        * Set the available options in the completer menu.
        */
      def setOptions(options: IterableOrArrayLike[String]): Unit = js.native
      def setOptions(options: IterableOrArrayLike[String], typeMap: JSONObject): Unit = js.native
      
      /**
        * A signal emitted when state of the completer menu changes.
        */
      val stateChanged: ISignal[IModel, Unit] = js.native
      
      /**
        * A flag that is true when the model value was modified by a subset match.
        */
      var subsetMatch: Boolean = js.native
      
      /**
        * The map from identifiers (`a.b`) to their types (function, module, class,
        * instance, etc.).
        */
      def typeMap(): TypeMap = js.native
    }
    
    /**
      * The initialization options for a completer widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The semantic parent of the completer widget, its referent editor.
        */
      var editor: js.UndefOr[IEditor | Null] = js.native
      
      /**
        * The model for the completer widget.
        */
      var model: js.UndefOr[IModel] = js.native
      
      /**
        * The renderer for the completer widget nodes.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorNull: Self = StObject.set(x, "editor", null)
        
        @scala.inline
        def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
    
    /**
      * An object describing a completion option injection into text.
      */
    @js.native
    trait IPatch extends StObject {
      
      /**
        * The end of the range to be patched.
        */
      var end: Double = js.native
      
      /**
        * The start of the range to be patched.
        */
      var start: Double = js.native
      
      /**
        * The value to be patched in.
        */
      var value: String = js.native
    }
    object IPatch {
      
      @scala.inline
      def apply(end: Double, start: Double, value: String): IPatch = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPatch]
      }
      
      @scala.inline
      implicit class IPatchMutableBuilder[Self <: IPatch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A renderer for completer widget nodes.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Create an item node (an `li` element)  from a ICompletionItem
        * for a text completer menu.
        */
      var createCompletionItemNode: js.UndefOr[
            js.Function2[/* item */ ICompletionItem, /* orderedTypes */ js.Array[String], HTMLLIElement]
          ] = js.native
      
      /**
        * Create an item node (an `li` element) for a text completer menu.
        */
      def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement = js.native
    }
    object IRenderer {
      
      @scala.inline
      def apply(createItemNode: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): IRenderer = {
        val __obj = js.Dynamic.literal(createItemNode = js.Any.fromFunction3(createItemNode))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateCompletionItemNode(value: (/* item */ ICompletionItem, /* orderedTypes */ js.Array[String]) => HTMLLIElement): Self = StObject.set(x, "createCompletionItemNode", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateCompletionItemNodeUndefined: Self = StObject.set(x, "createCompletionItemNode", js.undefined)
        
        @scala.inline
        def setCreateItemNode(value: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): Self = StObject.set(x, "createItemNode", js.Any.fromFunction3(value))
      }
    }
    
    /**
      * An interface for a completion request reflecting the state of the editor.
      */
    @js.native
    trait ITextState extends JSONObject {
      
      /**
        * The width of a character in the editor.
        */
      val charWidth: Double = js.native
      
      /**
        * The character number of the editor cursor within a line.
        */
      val column: Double = js.native
      
      /**
        * The line number of the editor cursor.
        */
      val line: Double = js.native
      
      /**
        * The height of a character in the editor.
        */
      val lineHeight: Double = js.native
      
      /**
        * The current value of the editor.
        */
      val text: String = js.native
    }
    object ITextState {
      
      @scala.inline
      def apply(charWidth: Double, column: Double, line: Double, lineHeight: Double, text: String): ITextState = {
        val __obj = js.Dynamic.literal(charWidth = charWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITextState]
      }
      
      @scala.inline
      implicit class ITextStateMutableBuilder[Self <: ITextState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCharWidth(value: Double): Self = StObject.set(x, "charWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type map that may add type annotations to completer matches.
      */
    type TypeMap = StringDictionary[String | Null]
  }
}
