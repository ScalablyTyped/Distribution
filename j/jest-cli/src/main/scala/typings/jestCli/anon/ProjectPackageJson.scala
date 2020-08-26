package typings.jestCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectPackageJson extends js.Object {
  var projectPackageJson: typings.jestCli.typesMod.ProjectPackageJson = js.native
  var shouldModifyScripts: Boolean = js.native
}

object ProjectPackageJson {
  @scala.inline
  def apply(projectPackageJson: typings.jestCli.typesMod.ProjectPackageJson, shouldModifyScripts: Boolean): ProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPackageJson]
  }
  @scala.inline
  implicit class ProjectPackageJsonOps[Self <: ProjectPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectPackageJson(value: typings.jestCli.typesMod.ProjectPackageJson): Self = this.set("projectPackageJson", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldModifyScripts(value: Boolean): Self = this.set("shouldModifyScripts", value.asInstanceOf[js.Any])
  }
  
}

