package typings.licenseDashChecker.licenseDashCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  /**
    * Module description
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Publisher e-mail
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Path to license file, if available
    */
  var licenseFile: js.UndefOr[String] = js.undefined
  /**
    * Whether the license is modified
    */
  var licenseModified: js.UndefOr[String] = js.undefined
  /**
    * Contents of the license
    */
  var licenseText: js.UndefOr[String] = js.undefined
  /**
    * Array of licenses
    */
  var licenses: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Module name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Publisher name
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Repository URL
    */
  var repository: js.UndefOr[String] = js.undefined
  /**
    * Publisher URL
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Module version
    */
  var version: js.UndefOr[String] = js.undefined
}

object ModuleInfo {
  @scala.inline
  def apply(
    description: String = null,
    email: String = null,
    licenseFile: String = null,
    licenseModified: String = null,
    licenseText: String = null,
    licenses: String | js.Array[String] = null,
    name: String = null,
    publisher: String = null,
    repository: String = null,
    url: String = null,
    version: String = null
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

