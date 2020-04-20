package typings.jupyterlabInspector.handlerMod.InspectionHandler

import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for an inspection handler.
  */
trait IOptions extends js.Object {
  /**
    * The connector used to make inspection requests.
    *
    * #### Notes
    * The only method of this connector that will ever be called is `fetch`, so
    * it is acceptable for the other methods to be simple functions that return
    * rejected promises.
    */
  var connector: IDataConnector[IReply, Unit, IRequest, String]
  /**
    * The mime renderer for the inspection handler.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest, String], rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

