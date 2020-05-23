package typings.licenseCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Dependency> */
trait PartialDependency extends js.Object {
  var licenseName: js.UndefOr[String] = js.undefined
  var licenseText: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PartialDependency {
  @scala.inline
  def apply(
    licenseName: String = null,
    licenseText: String = null,
    name: String = null,
    repository: String = null,
    version: String = null
  ): PartialDependency = {
    val __obj = js.Dynamic.literal()
    if (licenseName != null) __obj.updateDynamic("licenseName")(licenseName.asInstanceOf[js.Any])
    if (licenseText != null) __obj.updateDynamic("licenseText")(licenseText.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDependency]
  }
}

