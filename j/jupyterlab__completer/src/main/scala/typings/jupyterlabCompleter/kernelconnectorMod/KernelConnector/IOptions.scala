package typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector

import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for cell completion handlers.
  */
trait IOptions extends js.Object {
  /**
    * The session used by the kernel connector.
    */
  var session: ISessionConnection | Null
}

object IOptions {
  @scala.inline
  def apply(session: ISessionConnection = null): IOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

