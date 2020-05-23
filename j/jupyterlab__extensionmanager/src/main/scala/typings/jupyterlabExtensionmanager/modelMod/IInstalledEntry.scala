package typings.jupyterlabExtensionmanager.modelMod

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.deprecated
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstalledEntry extends js.Object {
  /**
    * A short description of the extension.
    */
  var description: String
  /**
    * Whether the extension is currently enabled.
    */
  var enabled: Boolean
  /**
    * Whether the extension is currently installed.
    */
  var installed: js.UndefOr[Boolean] = js.undefined
  /**
    * The installed version of the extension.
    */
  var installed_version: String
  /**
    * The latest version of the extension.
    */
  var latest_version: String
  /**
    * The name of the extension.
    */
  var name: String
  /**
    * A flag indicating the status of an installed extension.
    */
  var status: ok | warning | error | deprecated | Null
  /**
    * A representative link of the package.
    */
  var url: String
}

object IInstalledEntry {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    installed_version: String,
    latest_version: String,
    name: String,
    url: String,
    installed: js.UndefOr[Boolean] = js.undefined,
    status: ok | warning | error | deprecated = null
  ): IInstalledEntry = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(installed)) __obj.updateDynamic("installed")(installed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstalledEntry]
  }
}

