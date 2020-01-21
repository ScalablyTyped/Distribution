package typings.jsforce.metadataMod

import typings.jsforce.jsforceStrings.Restricted
import typings.jsforce.jsforceStrings.Unrestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var apiAccessLevel: js.UndefOr[Unrestricted | Restricted] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var namespacePrefix: js.UndefOr[String] = js.undefined
  var objectPermissions: js.UndefOr[js.Array[ProfileObjectPermissions]] = js.undefined
  var postInstallClass: js.UndefOr[String] = js.undefined
  var setupWeblink: js.UndefOr[String] = js.undefined
  var types: js.Array[PackageTypeMembers]
  var uninstallClass: js.UndefOr[String] = js.undefined
  var version: String
}

object Package {
  @scala.inline
  def apply(
    types: js.Array[PackageTypeMembers],
    version: String,
    apiAccessLevel: Unrestricted | Restricted = null,
    description: String = null,
    fullName: String = null,
    namespacePrefix: String = null,
    objectPermissions: js.Array[ProfileObjectPermissions] = null,
    postInstallClass: String = null,
    setupWeblink: String = null,
    uninstallClass: String = null
  ): Package = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (apiAccessLevel != null) __obj.updateDynamic("apiAccessLevel")(apiAccessLevel.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (namespacePrefix != null) __obj.updateDynamic("namespacePrefix")(namespacePrefix.asInstanceOf[js.Any])
    if (objectPermissions != null) __obj.updateDynamic("objectPermissions")(objectPermissions.asInstanceOf[js.Any])
    if (postInstallClass != null) __obj.updateDynamic("postInstallClass")(postInstallClass.asInstanceOf[js.Any])
    if (setupWeblink != null) __obj.updateDynamic("setupWeblink")(setupWeblink.asInstanceOf[js.Any])
    if (uninstallClass != null) __obj.updateDynamic("uninstallClass")(uninstallClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

