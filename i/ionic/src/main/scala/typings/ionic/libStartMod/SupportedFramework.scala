package typings.ionic.libStartMod

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedFramework extends js.Object {
  var description: String = js.native
  var name: String = js.native
  var `type`: ProjectType = js.native
}

object SupportedFramework {
  @scala.inline
  def apply(description: String, name: String, `type`: ProjectType): SupportedFramework = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFramework]
  }
  @scala.inline
  implicit class SupportedFrameworkOps[Self <: SupportedFramework] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ProjectType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

