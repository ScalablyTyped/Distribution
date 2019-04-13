package typings
package licenseDashCheckerDashWebpackDashPluginLib.licenseDashCheckerDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  var licenseName: java.lang.String
  var licenseText: java.lang.String
  var name: java.lang.String
  var repository: java.lang.String
  var version: java.lang.String
}

object Dependency {
  @scala.inline
  def apply(
    licenseName: java.lang.String,
    licenseText: java.lang.String,
    name: java.lang.String,
    repository: java.lang.String,
    version: java.lang.String
  ): Dependency = {
    val __obj = js.Dynamic.literal(licenseName = licenseName, licenseText = licenseText, name = name, repository = repository, version = version)
  
    __obj.asInstanceOf[Dependency]
  }
}

