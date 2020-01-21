package typings.jupyterlabServices.configMod.ConfigSection

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a config section.
  */
trait IOptions extends js.Object {
  /**
    * The section name.
    */
  var name: String
  /**
    * The optional server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(name: String, serverSettings: ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

