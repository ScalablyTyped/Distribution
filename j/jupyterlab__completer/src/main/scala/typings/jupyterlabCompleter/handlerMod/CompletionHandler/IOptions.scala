package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import typings.jupyterlabCompleter.widgetMod.Completer
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for cell completion handlers.
  */
trait IOptions extends js.Object {
  /**
    * The completion widget the handler will connect to.
    */
  var completer: Completer
  /**
    * The data connector used to populate completion requests.
    *
    * #### Notes
    * The only method of this connector that will ever be called is `fetch`, so
    * it is acceptable for the other methods to be simple functions that return
    * rejected promises.
    */
  var connector: IDataConnector[IReply, Unit, IRequest, String]
}

object IOptions {
  @scala.inline
  def apply(completer: Completer, connector: IDataConnector[IReply, Unit, IRequest, String]): IOptions = {
    val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

