package typings.jestCli

import typings.jestCli.typesMod.ProjectPackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectPackageJson extends js.Object {
  var projectPackageJson: ProjectPackageJson
  var shouldModifyScripts: Boolean
}

object AnonProjectPackageJson {
  @scala.inline
  def apply(projectPackageJson: ProjectPackageJson, shouldModifyScripts: Boolean): AnonProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProjectPackageJson]
  }
}

