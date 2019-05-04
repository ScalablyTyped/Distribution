package typings
package atJupyterlabServicesLib.libManagerMod.ServiceManagerNs

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
  val defaultDrive: js.UndefOr[atJupyterlabServicesLib.libContentsMod.ContentsNs.IDrive] = js.undefined
  /**
    * The server settings of the manager.
    */
  val serverSettings: js.UndefOr[atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    defaultDrive: atJupyterlabServicesLib.libContentsMod.ContentsNs.IDrive = null,
    serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDrive != null) __obj.updateDynamic("defaultDrive")(defaultDrive)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

