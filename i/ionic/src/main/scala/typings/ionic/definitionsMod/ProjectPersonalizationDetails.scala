package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectPersonalizationDetails extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var packageId: js.UndefOr[String] = js.native
  var projectId: String = js.native
  var version: js.UndefOr[String] = js.native
}

object ProjectPersonalizationDetails {
  @scala.inline
  def apply(name: String, projectId: String): ProjectPersonalizationDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPersonalizationDetails]
  }
  @scala.inline
  implicit class ProjectPersonalizationDetailsOps[Self <: ProjectPersonalizationDetails] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setPackageId(value: String): Self = this.set("packageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

