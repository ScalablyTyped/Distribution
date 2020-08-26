package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedStarterTemplate extends BaseStarterTemplate {
  var archive: String = js.native
}

object ResolvedStarterTemplate {
  @scala.inline
  def apply(archive: String, name: String, projectType: ProjectType): ResolvedStarterTemplate = {
    val __obj = js.Dynamic.literal(archive = archive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedStarterTemplate]
  }
  @scala.inline
  implicit class ResolvedStarterTemplateOps[Self <: ResolvedStarterTemplate] (val x: Self) extends AnyVal {
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
    def setArchive(value: String): Self = this.set("archive", value.asInstanceOf[js.Any])
  }
  
}

