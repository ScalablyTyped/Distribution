package typings.jupyterlabConsole.historyMod.ConsoleHistory

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
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
  var sessionContext: ISessionContext
}

object IOptions {
  @scala.inline
  def apply(sessionContext: ISessionContext): IOptions = {
    val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

