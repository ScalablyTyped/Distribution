package typings.jestCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPackageJson extends js.Object {
  var projectPackageJson: typings.jestCli.typesMod.ProjectPackageJson
  var shouldModifyScripts: Boolean
}

object ProjectPackageJson {
  @scala.inline
  def apply(projectPackageJson: typings.jestCli.typesMod.ProjectPackageJson, shouldModifyScripts: Boolean): ProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPackageJson]
  }
}

