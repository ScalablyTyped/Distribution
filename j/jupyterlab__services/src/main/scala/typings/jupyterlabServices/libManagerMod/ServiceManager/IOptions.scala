package typings.jupyterlabServices.libManagerMod.ServiceManager

import typings.jupyterlabServices.contentsMod.Contents.IDrive
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoPolling.pollMod.Poll.Standby
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
    if (defaultDrive != null) __obj.updateDynamic("defaultDrive")(defaultDrive.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (standby != null) __obj.updateDynamic("standby")(standby.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

