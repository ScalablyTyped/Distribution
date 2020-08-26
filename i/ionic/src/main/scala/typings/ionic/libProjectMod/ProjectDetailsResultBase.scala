package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetailsResultBase extends js.Object {
  val errors: js.Array[ProjectDetailsError] = js.native
  val `type`: js.UndefOr[ProjectType] = js.native
}

object ProjectDetailsResultBase {
  @scala.inline
  def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsResultBase = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsResultBase]
  }
  @scala.inline
  implicit class ProjectDetailsResultBaseOps[Self <: ProjectDetailsResultBase] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: ProjectDetailsError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ProjectDetailsError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ProjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

