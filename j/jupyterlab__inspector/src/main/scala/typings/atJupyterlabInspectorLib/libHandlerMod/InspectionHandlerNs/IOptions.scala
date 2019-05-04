package typings
package atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs

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
  var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[IReply, scala.Unit, IRequest]
  /**
    * The mime renderer for the inspection handler.
    */
  var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[IReply, scala.Unit, IRequest],
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector, rendermime = rendermime)
  
    __obj.asInstanceOf[IOptions]
  }
}

