package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStarterTemplate extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var projectType: ProjectType = js.native
}

object BaseStarterTemplate {
  @scala.inline
  def apply(name: String, projectType: ProjectType): BaseStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStarterTemplate]
  }
  @scala.inline
  implicit class BaseStarterTemplateOps[Self <: BaseStarterTemplate] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectType(value: ProjectType): Self = this.set("projectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

