package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`A list of custom reporters for the test suiteDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringType extends js.Object {
  val description: `A list of custom reporters for the test suiteDot` = js.native
  val string: `true` = js.native
  val `type`: array = js.native
}

object StringType {
  @scala.inline
  def apply(description: `A list of custom reporters for the test suiteDot`, string: `true`, `type`: array): StringType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringType]
  }
  @scala.inline
  implicit class StringTypeOps[Self <: StringType] (val x: Self) extends AnyVal {
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
    def setDescription(value: `A list of custom reporters for the test suiteDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: `true`): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

