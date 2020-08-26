package typings.jestCli.anon

import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionStringType extends js.Object {
  val default: typings.jestCli.jestCliNumbers.`5` = js.native
  val description: java.lang.String = js.native
  val `type`: number = js.native
}

object DescriptionStringType {
  @scala.inline
  def apply(default: typings.jestCli.jestCliNumbers.`5`, description: java.lang.String, `type`: number): DescriptionStringType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionStringType]
  }
  @scala.inline
  implicit class DescriptionStringTypeOps[Self <: DescriptionStringType] (val x: Self) extends AnyVal {
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
    def setDefault(value: typings.jestCli.jestCliNumbers.`5`): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: number): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

