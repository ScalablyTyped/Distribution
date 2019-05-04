package typings
package atJupyterlabInspectorLib.libKernelconnectorMod.KernelConnectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for an inspection handler.
  */
trait IOptions extends js.Object {
  /**
    * The session used to make API requests to the kernel.
    */
  var session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
}

object IOptions {
  @scala.inline
  def apply(session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession): IOptions = {
    val __obj = js.Dynamic.literal(session = session)
  
    __obj.asInstanceOf[IOptions]
  }
}

