package typings
package atJupyterlabCompleterLib.libKernelconnectorMod.KernelConnectorNs

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
  var session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession | atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession
}

object IOptions {
  @scala.inline
  def apply(
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession | atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession
  ): IOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

