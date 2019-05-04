package typings
package atJupyterlabConsoleLib.libForeignMod.ForeignHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a foreign handler.
  */
trait IOptions extends js.Object {
  /**
    * The parent into which the handler will inject code cells.
    */
  var parent: IReceiver
  /**
    * The client session used by the foreign handler.
    */
  var session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  /**
    * The cell factory for foreign handlers.
    */
  def cellFactory(): atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell
}

object IOptions {
  @scala.inline
  def apply(
    cellFactory: () => atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell,
    parent: IReceiver,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  ): IOptions = {
    val __obj = js.Dynamic.literal(cellFactory = js.Any.fromFunction0(cellFactory), parent = parent, session = session)
  
    __obj.asInstanceOf[IOptions]
  }
}

