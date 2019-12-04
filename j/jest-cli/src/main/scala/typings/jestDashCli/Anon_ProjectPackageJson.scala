package typings.jestDashCli

import typings.jestDashCli.buildInitTypesMod.ProjectPackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectPackageJson extends js.Object {
  var projectPackageJson: ProjectPackageJson
  var shouldModifyScripts: Boolean
}

object Anon_ProjectPackageJson {
  @scala.inline
  def apply(projectPackageJson: ProjectPackageJson, shouldModifyScripts: Boolean): Anon_ProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ProjectPackageJson]
  }
}

