package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for initializing a terminal session object.
  */
trait IOptions extends js.Object {
  /**
    * The server settings for the session.
    */
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

