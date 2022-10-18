package typings.jupyterlabCompleter

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IPosition
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IOptions
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.libWidgetMod.Completer
import typings.jupyterlabCompleter.libWidgetMod.Completer.ITextState
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlerMod {
  
  @JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler")
  @js.native
  open class CompletionHandler protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _connector: Any = js.native
    
    /* private */ var _editor: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isICompletionItemsConnector: Any = js.native
    
    /**
      * Make a completion request.
      */
    /* private */ var _makeRequest: Any = js.native
    
    /**
      * If completion request fails, reset model and fail silently.
      */
    /* private */ var _onFailure: Any = js.native
    
    /**
      * Receive completion items from provider.
      *
      * @param state - The state of the editor when completion request was made.
      *
      * @param reply - The API response returned for a completion request.
      */
    /* private */ var _onFetchItemsReply: Any = js.native
    
    /**
      * Receive a completion reply from the connector.
      *
      * @param state - The state of the editor when completion request was made.
      *
      * @param reply - The API response returned for a completion request.
      */
    /* private */ var _onReply: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /**
      * Updates model with text state and current cursor position.
      */
    /* private */ var _updateModel: Any = js.native
    
    /* private */ var _validate: Any = js.native
    
    /**
      * The completer widget managed by the handler.
      */
    val completer: Completer = js.native
    
    /**
      * The data connector used to populate completion requests.
      * @deprecated will be removed, or will return `CompletionHandler.ICompletionItemsConnector`
      * instead of `IDataConnector` in future versions
      *
      * #### Notes
      * The only method of this connector that will ever be called is `fetch`, so
      * it is acceptable for the other methods to be simple functions that return
      * rejected promises.
      */
    def connector: IDataConnector[IReply, Unit, IRequest, String] = js.native
    def connector_=(connector: IDataConnector[IReply, Unit, IRequest, String]): Unit = js.native
    
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
    
    /**
      * The editor used by the completion handler.
      */
    def editor: IEditor | Null = js.native
    def editor_=(newValue: IEditor | Null): Unit = js.native
    
    /**
      * Get the state of the text editor at the given position.
      */
    /* protected */ def getState(editor: IEditor, position: IPosition): ITextState = js.native
    
    /**
      * Invoke the handler and launch a completer.
      */
    def invoke(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the completion handler is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCompletionHandler: Boolean = js.native
    
    /**
      * Handle a completion selected signal from the completion widget.
      */
    /* protected */ def onCompletionSelected(completer: Completer, `val`: String): Unit = js.native
    
    /**
      * Handle `invoke-request` messages.
      */
    /* protected */ def onInvokeRequest(msg: Message): Unit = js.native
    
    /**
      * Handle selection changed signal from an editor.
      *
      * #### Notes
      * If a sub-class reimplements this method, then that class must either call
      * its super method or it must take responsibility for adding and removing
      * the completer completable class to the editor host node.
      *
      * Despite the fact that the editor widget adds a class whenever there is a
      * primary selection, this method checks independently for two reasons:
      *
      * 1. The editor widget connects to the same signal to add that class, so
      *    there is no guarantee that the class will be added before this method
      *    is invoked so simply checking for the CSS class's existence is not an
      *    option. Secondarily, checking the editor state should be faster than
      *    querying the DOM in either case.
      * 2. Because this method adds a class that indicates whether completer
      *    functionality ought to be enabled, relying on the behavior of the
      *    `jp-mod-has-primary-selection` to filter out any editors that have
      *    a selection means the semantic meaning of `jp-mod-completer-enabled`
      *    is obscured because there may be cases where the enabled class is added
      *    even though the completer is not available.
      */
    /* protected */ def onSelectionsChanged(): Unit = js.native
    
    /**
      * Handle a text changed signal from an editor.
      */
    /* protected */ def onTextChanged(): Unit = js.native
    
    /**
      * Handle a visibility change signal from a completer widget.
      */
    /* protected */ def onVisibilityChanged(completer: Completer): Unit = js.native
    
    /**
      * Process a message sent to the completion handler.
      */
    def processMessage(msg: Message): Unit = js.native
  }
  object CompletionHandler {
    
    @JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler.ICompletionItemsResponseType")
    @js.native
    val ICompletionItemsResponseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    object Msg {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      @JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler.Msg.InvokeRequest")
      @js.native
      val InvokeRequest: Message = js.native
    }
    
    trait ICompleterConnecterResponseType extends StObject {
      
      var responseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
    }
    object ICompleterConnecterResponseType {
      
      inline def apply(): ICompleterConnecterResponseType = {
        val __obj = js.Dynamic.literal(responseType = "ICompletionItemsReply")
        __obj.asInstanceOf[ICompleterConnecterResponseType]
      }
      
      extension [Self <: ICompleterConnecterResponseType](x: Self) {
        
        inline def setResponseType(value: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Completion item object based off of LSP CompletionItem.
      * Compared to the old kernel completions interface, this enhances the completions UI to support:
      * - differentiation between inserted text and user facing text
      * - documentation for each completion item to be displayed adjacently
      * - deprecation styling
      * - custom icons
      * and other potential new features.
      */
    trait ICompletionItem extends StObject {
      
      /**
        * Indicates if the item is deprecated.
        */
      var deprecated: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A human-readable string with additional information
        * about this item, like type or symbol information.
        */
      var documentation: js.UndefOr[String] = js.undefined
      
      /**
        * LabIcon object for icon to be rendered with completion type.
        */
      var icon: js.UndefOr[LabIcon] = js.undefined
      
      /**
        * Completion to be inserted.
        */
      var insertText: js.UndefOr[String] = js.undefined
      
      /**
        * User facing completion.
        * If insertText is not set, this will be inserted.
        */
      var label: String
      
      /**
        * Type of this completion item.
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ICompletionItem {
      
      inline def apply(label: String): ICompletionItem = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICompletionItem]
      }
      
      extension [Self <: ICompletionItem](x: Self) {
        
        inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
        
        inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
        
        inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
        
        inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
        
        inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
        
        inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * Type alias for ICompletionItem list.
      * Implementers of this interface should be responsible for
      * deduping and sorting the items in the list.
      */
    type ICompletionItems = js.Array[ICompletionItem]
    
    @js.native
    trait ICompletionItemsConnector
      extends StObject
         with IDataConnector[ICompletionItemsReply, Unit, IRequest, String]
         with ICompleterConnecterResponseType
    
    /**
      * A reply to a completion items fetch request.
      */
    trait ICompletionItemsReply extends StObject {
      
      /**
        * The end index for the substring being replaced by completion.
        */
      var end: Double
      
      /**
        * A list of completion items.
        */
      var items: ICompletionItems
      
      /**
        * The starting index for the substring being replaced by completion.
        */
      var start: Double
    }
    object ICompletionItemsReply {
      
      inline def apply(end: Double, items: ICompletionItems, start: Double): ICompletionItemsReply = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICompletionItemsReply]
      }
      
      extension [Self <: ICompletionItemsReply](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setItems(value: ICompletionItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsVarargs(value: ICompletionItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions extends StObject {
      
      /**
        * The completion widget the handler will connect to.
        */
      var completer: Completer
      
      /**
        * The data connector used to populate completion requests.
        * Use the connector with ICompletionItemsReply for enhanced completions.
        * #### Notes
        * The only method of this connector that will ever be called is `fetch`, so
        * it is acceptable for the other methods to be simple functions that return
        * rejected promises.
        *
        * @deprecated passing `IDataConnector` is deprecated;
        * pass `CompletionHandler.ICompletionItemsConnector`
        */
      var connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector
    }
    object IOptions {
      
      inline def apply(
        completer: Completer,
        connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector
      ): IOptions = {
        val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCompleter(value: Completer): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
        
        inline def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @deprecated use `ICompletionItemsReply` instead
      *
      * A reply to a completion request.
      */
    trait IReply extends StObject {
      
      /**
        * The end index for the substring being replaced by completion.
        */
      var end: Double
      
      /**
        * A list of matching completion strings.
        */
      var matches: js.Array[String]
      
      /**
        * Any metadata that accompanies the completion reply.
        */
      var metadata: ReadonlyJSONObject
      
      /**
        * The starting index for the substring being replaced by completion.
        */
      var start: Double
    }
    object IReply {
      
      inline def apply(end: Double, matches: js.Array[String], metadata: ReadonlyJSONObject, start: Double): IReply = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[IReply]
      }
      
      extension [Self <: IReply](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
        
        inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
        
        inline def setMetadata(value: ReadonlyJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The details of a completion request.
      */
    trait IRequest extends StObject {
      
      /**
        * The cursor offset position within the text being completed.
        */
      var offset: Double
      
      /**
        * The text being completed.
        */
      var text: String
    }
    object IRequest {
      
      inline def apply(offset: Double, text: String): IRequest = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      extension [Self <: IRequest](x: Self) {
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
