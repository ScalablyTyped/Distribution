package typings.licenseCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  var licenseName: String
  var licenseText: String
  var name: String
  var repository: String
  var version: String
}

object Dependency {
  @scala.inline
  def apply(licenseName: String, licenseText: String, name: String, repository: String, version: String): Dependency = {
    val __obj = js.Dynamic.literal(licenseName = licenseName.asInstanceOf[js.Any], licenseText = licenseText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
}

