package typings
package atJupyterlabExtensionmanagerLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstalledEntry extends js.Object {
  /**
    * A short description of the extension.
    */
  var description: java.lang.String
  /**
    * Whether the extension is currently enabled.
    */
  var enabled: scala.Boolean
  /**
    * Whether the extension is currently installed.
    */
  var installed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The installed version of the extension.
    */
  var installed_version: java.lang.String
  /**
    * The latest version of the extension.
    */
  var latest_version: java.lang.String
  /**
    * The name of the extension.
    */
  var name: java.lang.String
  /**
    * A flag indicating the status of an installed extension.
    */
  var status: atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.ok | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.warning | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.error | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.deprecated | scala.Null
  /**
    * A representative link of the package.
    */
  var url: java.lang.String
}

object IInstalledEntry {
  @scala.inline
  def apply(
    description: java.lang.String,
    enabled: scala.Boolean,
    installed_version: java.lang.String,
    latest_version: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    installed: js.UndefOr[scala.Boolean] = js.undefined,
    status: atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.ok | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.warning | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.error | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.deprecated = null
  ): IInstalledEntry = {
    val __obj = js.Dynamic.literal(description = description, enabled = enabled, installed_version = installed_version, latest_version = latest_version, name = name, url = url)
    if (!js.isUndefined(installed)) __obj.updateDynamic("installed")(installed)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstalledEntry]
  }
}

