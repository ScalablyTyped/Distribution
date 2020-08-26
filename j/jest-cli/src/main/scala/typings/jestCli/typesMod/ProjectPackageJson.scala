package typings.jestCli.typesMod

import typings.jestCli.anon.PartialInitialOptions
import typings.jestCli.jestCliStrings.commonjs
import typings.jestCli.jestCliStrings.module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectPackageJson extends js.Object {
  var jest: js.UndefOr[PartialInitialOptions] = js.native
  var scripts: js.UndefOr[Record[String, String]] = js.native
  var `type`: js.UndefOr[commonjs | module] = js.native
}

object ProjectPackageJson {
  @scala.inline
  def apply(): ProjectPackageJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectPackageJson]
  }
  @scala.inline
  implicit class ProjectPackageJsonOps[Self <: ProjectPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJest(value: PartialInitialOptions): Self = this.set("jest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJest: Self = this.set("jest", js.undefined)
    @scala.inline
    def setScripts(value: Record[String, String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setType(value: commonjs | module): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

