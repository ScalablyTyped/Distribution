package typings.atJupyterlabInspector.libKernelconnectorMod.KernelConnector

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
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
  var session: IClientSession
}

object IOptions {
  @scala.inline
  def apply(session: IClientSession): IOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

