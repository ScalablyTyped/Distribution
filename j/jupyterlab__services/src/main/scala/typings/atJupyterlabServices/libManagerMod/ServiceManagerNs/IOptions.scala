package typings.atJupyterlabServices.libManagerMod.ServiceManagerNs

import typings.atJupyterlabCoreutils.libPollMod.PollNs.Standby
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IDrive
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a service manager.
  */
trait IOptions extends js.Object {
  /**
    * The default drive for the contents manager.
    */
  val defaultDrive: js.UndefOr[IDrive] = js.undefined
  /**
    * The server settings of the manager.
    */
  val serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(defaultDrive: IDrive = null, serverSettings: ISettings = null, standby: Standby = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDrive != null) __obj.updateDynamic("defaultDrive")(defaultDrive)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    if (standby != null) __obj.updateDynamic("standby")(standby)
    __obj.asInstanceOf[IOptions]
  }
}

