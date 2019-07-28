package typings.atJupyterlabServices.libNbconvertMod.NbConvertManagerNs

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a setting manager.
  */
trait IOptions extends js.Object {
  /**
    * The server settings used to make API requests.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

