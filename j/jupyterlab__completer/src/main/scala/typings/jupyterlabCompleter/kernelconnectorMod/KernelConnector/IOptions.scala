package typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.jupyterlabServices.sessionSessionMod.Session.ISession
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
  var session: IClientSession | ISession
}

object IOptions {
  @scala.inline
  def apply(session: IClientSession | ISession): IOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

