package typings.licenseDashCheckerDashWebpackDashPlugin.licenseDashCheckerDashWebpackDashPluginMod

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
    val __obj = js.Dynamic.literal(licenseName = licenseName, licenseText = licenseText, name = name, repository = repository, version = version)
  
    __obj.asInstanceOf[Dependency]
  }
}

