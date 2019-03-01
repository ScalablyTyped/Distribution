package typings
package licenseDashCheckerLib.licenseDashCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  /**
    * Module description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Publisher e-mail
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to license file, if available
    */
  var licenseFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the license is modified
    */
  var licenseModified: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contents of the license
    */
  var licenseText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of licenses
    */
  var licenses: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Module name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Publisher name
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Repository URL
    */
  var repository: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Publisher URL
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Module version
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ModuleInfo {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    email: java.lang.String = null,
    licenseFile: java.lang.String = null,
    licenseModified: java.lang.String = null,
    licenseText: java.lang.String = null,
    licenses: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    publisher: java.lang.String = null,
    repository: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (licenseFile != null) __obj.updateDynamic("licenseFile")(licenseFile)
    if (licenseModified != null) __obj.updateDynamic("licenseModified")(licenseModified)
    if (licenseText != null) __obj.updateDynamic("licenseText")(licenseText)
    if (licenses != null) __obj.updateDynamic("licenses")(licenses.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ModuleInfo]
  }
}

