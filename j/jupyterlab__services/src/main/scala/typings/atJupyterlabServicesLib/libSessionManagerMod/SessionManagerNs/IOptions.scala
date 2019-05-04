package typings
package atJupyterlabServicesLib.libSessionManagerMod.SessionManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a SessionManager.
  */
trait IOptions extends js.Object {
  /**
    * The server settings for the manager.
    */
  var serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

