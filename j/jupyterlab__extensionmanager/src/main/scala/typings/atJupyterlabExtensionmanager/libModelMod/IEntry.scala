package typings.atJupyterlabExtensionmanager.libModelMod

import typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.deprecated
import typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.error
import typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.ok
import typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntry extends js.Object {
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
  var installed: Boolean
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

object IEntry {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    installed: Boolean,
    installed_version: String,
    latest_version: String,
    name: String,
    url: String,
    status: ok | warning | error | deprecated = null
  ): IEntry = {
    val __obj = js.Dynamic.literal(description = description, enabled = enabled, installed = installed, installed_version = installed_version, latest_version = latest_version, name = name, url = url)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

