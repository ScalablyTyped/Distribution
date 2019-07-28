package typings.atJupyterlabServices.libSessionManagerMod.SessionManagerNs

import typings.atJupyterlabCoreutils.libPollMod.PollNs.Standby
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
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
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: ISettings = null, standby: Standby = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    if (standby != null) __obj.updateDynamic("standby")(standby)
    __obj.asInstanceOf[IOptions]
  }
}

