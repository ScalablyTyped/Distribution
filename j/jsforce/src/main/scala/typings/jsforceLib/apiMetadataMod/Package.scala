package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var apiAccessLevel: js.UndefOr[
    jsforceLib.jsforceLibStrings.Unrestricted | jsforceLib.jsforceLibStrings.Restricted
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  var namespacePrefix: js.UndefOr[java.lang.String] = js.undefined
  var objectPermissions: js.UndefOr[js.Array[ProfileObjectPermissions]] = js.undefined
  var postInstallClass: js.UndefOr[java.lang.String] = js.undefined
  var setupWeblink: js.UndefOr[java.lang.String] = js.undefined
  var types: js.Array[PackageTypeMembers]
  var uninstallClass: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object Package {
  @scala.inline
  def apply(
    types: js.Array[PackageTypeMembers],
    version: java.lang.String,
    apiAccessLevel: jsforceLib.jsforceLibStrings.Unrestricted | jsforceLib.jsforceLibStrings.Restricted = null,
    description: java.lang.String = null,
    fullName: java.lang.String = null,
    namespacePrefix: java.lang.String = null,
    objectPermissions: js.Array[ProfileObjectPermissions] = null,
    postInstallClass: java.lang.String = null,
    setupWeblink: java.lang.String = null,
    uninstallClass: java.lang.String = null
  ): Package = {
    val __obj = js.Dynamic.literal(types = types, version = version)
    if (apiAccessLevel != null) __obj.updateDynamic("apiAccessLevel")(apiAccessLevel.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (namespacePrefix != null) __obj.updateDynamic("namespacePrefix")(namespacePrefix)
    if (objectPermissions != null) __obj.updateDynamic("objectPermissions")(objectPermissions)
    if (postInstallClass != null) __obj.updateDynamic("postInstallClass")(postInstallClass)
    if (setupWeblink != null) __obj.updateDynamic("setupWeblink")(setupWeblink)
    if (uninstallClass != null) __obj.updateDynamic("uninstallClass")(uninstallClass)
    __obj.asInstanceOf[Package]
  }
}

