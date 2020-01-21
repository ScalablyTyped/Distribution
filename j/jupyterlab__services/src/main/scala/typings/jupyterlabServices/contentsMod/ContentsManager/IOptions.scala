package typings.jupyterlabServices.contentsMod.ContentsManager

import typings.jupyterlabServices.contentsMod.Contents.IDrive
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a contents manager.
  */
trait IOptions extends js.Object {
  /**
    * The default drive backend for the contents manager.
    */
  var defaultDrive: js.UndefOr[IDrive] = js.undefined
  /**
    * The server settings associated with the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(defaultDrive: IDrive = null, serverSettings: ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDrive != null) __obj.updateDynamic("defaultDrive")(defaultDrive.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

