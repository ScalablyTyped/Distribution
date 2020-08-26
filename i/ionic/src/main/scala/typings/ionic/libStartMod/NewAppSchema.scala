package typings.ionic.libStartMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewAppSchema
  extends BaseAppSchema
     with AppSchema {
  var cloned: `false` = js.native
  var name: String = js.native
  var template: String = js.native
  var `type`: ProjectType = js.native
}

object NewAppSchema {
  @scala.inline
  def apply(
    cloned: `false`,
    name: String,
    projectDir: String,
    projectId: String,
    template: String,
    `type`: ProjectType
  ): NewAppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewAppSchema]
  }
  @scala.inline
  implicit class NewAppSchemaOps[Self <: NewAppSchema] (val x: Self) extends AnyVal {
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
    def setCloned(value: `false`): Self = this.set("cloned", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ProjectType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

