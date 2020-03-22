package typings.jupyterlabConsole.foreignMod.ForeignHandler

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
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
  var sessionContext: ISessionContext
}

object IOptions {
  @scala.inline
  def apply(parent: IReceiver, sessionContext: ISessionContext): IOptions = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

