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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

