package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import typings.jupyterlabCompleter.widgetMod.Completer
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for cell completion handlers.
  */
@js.native
trait IOptions extends js.Object {
  
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
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompleter(value: Completer): Self = this.set("completer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = this.set("connector", value.asInstanceOf[js.Any])
  }
}
