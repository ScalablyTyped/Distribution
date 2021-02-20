package typings.jupyterlabCompleter

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IPosition
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.widgetMod.Completer
import typings.jupyterlabCompleter.widgetMod.Completer.ITextState
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  @JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler")
  @js.native
  class CompletionHandler protected () extends IDisposable {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: IOptions) = this()
    
    var _connector: js.Any = js.native
    
    var _editor: js.Any = js.native
    
    var _enabled: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _isICompletionItemsConnector: js.Any = js.native
    
    /**
      * Make a completion request.
      */
    var _makeRequest: js.Any = js.native
    
    /**
      * If completion request fails, reset model and fail silently.
      */
    var _onFailure: js.Any = js.native
    
    /**
      * Receive completion items from provider.
      *
      * @param state - The state of the editor when completion request was made.
      *
      * @param reply - The API response returned for a completion request.
      */
    var _onFetchItemsReply: js.Any = js.native
    
    /**
      * Receive a completion reply from the connector.
      *
      * @param state - The state of the editor when completion request was made.
      *
      * @param reply - The API response returned for a completion request.
      */
    var _onReply: js.Any = js.native
    
    var _pending: js.Any = js.native
    
    /**
      * Updates model with text state and current cursor position.
      */
    var _updateModel: js.Any = js.native
    
    var _validate: js.Any = js.native
    
    /**
      * The completer widget managed by the handler.
      */
    val completer: Completer = js.native
    
    /**
      * The data connector used to populate completion requests.
      *
      * #### Notes
      * The only method of this connector that will ever be called is `fetch`, so
      * it is acceptable for the other methods to be simple functions that return
      * rejected promises.
      */
    def connector: IDataConnector[IReply, Unit, IRequest, String] = js.native
    def connector_=(connector: IDataConnector[IReply, Unit, IRequest, String]): Unit = js.native
    
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
    
    @js.native
    trait ICompleterConnecterResponseType extends StObject {
      
      var responseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply = js.native
    }
    object ICompleterConnecterResponseType {
      
      @scala.inline
      def apply(responseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply): ICompleterConnecterResponseType = {
        val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICompleterConnecterResponseType]
      }
      
      @scala.inline
      implicit class ICompleterConnecterResponseTypeMutableBuilder[Self <: ICompleterConnecterResponseType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResponseType(value: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
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
    @js.native
    trait ICompletionItem extends StObject {
      
      /**
        * Indicates if the item is deprecated.
        */
      var deprecated: js.UndefOr[Boolean] = js.native
      
      /**
        * A human-readable string with additional information
        * about this item, like type or symbol information.
        */
      var documentation: js.UndefOr[String] = js.native
      
      /**
        * LabIcon object for icon to be rendered with completion type.
        */
      var icon: js.UndefOr[LabIcon] = js.native
      
      /**
        * Completion to be inserted.
        */
      var insertText: js.UndefOr[String] = js.native
      
      /**
        * User facing completion.
        * If insertText is not set, this will be inserted.
        */
      var label: String = js.native
      
      /**
        * Type of this completion item.
        */
      var `type`: js.UndefOr[String] = js.native
    }
    object ICompletionItem {
      
      @scala.inline
      def apply(label: String): ICompletionItem = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICompletionItem]
      }
      
      @scala.inline
      implicit class ICompletionItemMutableBuilder[Self <: ICompletionItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
        
        @scala.inline
        def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
        
        @scala.inline
        def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * Type alias for ICompletionItem list.
      * Implementers of this interface should be responsible for
      * deduping and sorting the items in the list.
      */
    type ICompletionItems = js.Array[ICompletionItem]
    
    type ICompletionItemsConnector = (IDataConnector[ICompletionItemsReply, Unit, IRequest, String]) with ICompleterConnecterResponseType
    
    /**
      * A reply to a completion items fetch request.
      */
    @js.native
    trait ICompletionItemsReply extends StObject {
      
      /**
        * The end index for the substring being replaced by completion.
        */
      var end: Double = js.native
      
      /**
        * A list of completion items.
        */
      var items: ICompletionItems = js.native
      
      /**
        * The starting index for the substring being replaced by completion.
        */
      var start: Double = js.native
    }
    object ICompletionItemsReply {
      
      @scala.inline
      def apply(end: Double, items: ICompletionItems, start: Double): ICompletionItemsReply = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICompletionItemsReply]
      }
      
      @scala.inline
      implicit class ICompletionItemsReplyMutableBuilder[Self <: ICompletionItemsReply] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItems(value: ICompletionItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsVarargs(value: ICompletionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for cell completion handlers.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The completion widget the handler will connect to.
        */
      var completer: Completer = js.native
      
      /**
        * The data connector used to populate completion requests.
        * Use the connector with ICompletionItemsReply for enhanced completions.
        * #### Notes
        * The only method of this connector that will ever be called is `fetch`, so
        * it is acceptable for the other methods to be simple functions that return
        * rejected promises.
        */
      var connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        completer: Completer,
        connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector
      ): IOptions = {
        val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompleter(value: Completer): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A reply to a completion request.
      */
    @js.native
    trait IReply extends StObject {
      
      /**
        * The end index for the substring being replaced by completion.
        */
      var end: Double = js.native
      
      /**
        * A list of matching completion strings.
        */
      var matches: js.Array[String] = js.native
      
      /**
        * Any metadata that accompanies the completion reply.
        */
      var metadata: ReadonlyJSONObject = js.native
      
      /**
        * The starting index for the substring being replaced by completion.
        */
      var start: Double = js.native
    }
    object IReply {
      
      @scala.inline
      def apply(end: Double, matches: js.Array[String], metadata: ReadonlyJSONObject, start: Double): IReply = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[IReply]
      }
      
      @scala.inline
      implicit class IReplyMutableBuilder[Self <: IReply] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
        
        @scala.inline
        def setMetadata(value: ReadonlyJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The details of a completion request.
      */
    @js.native
    trait IRequest extends StObject {
      
      /**
        * The cursor offset position within the text being completed.
        */
      var offset: Double = js.native
      
      /**
        * The text being completed.
        */
      var text: String = js.native
    }
    object IRequest {
      
      @scala.inline
      def apply(offset: Double, text: String): IRequest = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      @scala.inline
      implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
