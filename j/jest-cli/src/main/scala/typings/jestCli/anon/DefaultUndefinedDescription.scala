package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Disables stack trace in test results output`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultUndefinedDescription extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Disables stack trace in test results output` = js.native
  val `type`: boolean = js.native
}

object DefaultUndefinedDescription {
  @scala.inline
  def apply(description: `Disables stack trace in test results output`, `type`: boolean): DefaultUndefinedDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedDescription]
  }
  @scala.inline
  implicit class DefaultUndefinedDescriptionOps[Self <: DefaultUndefinedDescription] (val x: Self) extends AnyVal {
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
    def setDescription(value: `Disables stack trace in test results output`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

