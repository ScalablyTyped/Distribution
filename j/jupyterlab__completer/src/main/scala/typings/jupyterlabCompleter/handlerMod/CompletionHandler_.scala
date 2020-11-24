package typings.jupyterlabCompleter.handlerMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IPosition
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.widgetMod.Completer
import typings.jupyterlabCompleter.widgetMod.Completer.ITextState
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler")
@js.native
class CompletionHandler_ protected () extends IDisposable {
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
  def isDisposed_MCompletionHandler_ : Boolean = js.native
  
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
