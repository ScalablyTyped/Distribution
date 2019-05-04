package typings
package atJupyterlabConsoleLib.libHistoryMod.ConsoleHistoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console history object.
  */
trait IOptions extends js.Object {
  /**
    * The client session used by the foreign handler.
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

