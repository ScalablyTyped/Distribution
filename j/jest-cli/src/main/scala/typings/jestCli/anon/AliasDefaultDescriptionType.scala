package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Run tests that failed in the previous executionDot`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.f
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasDefaultDescriptionType extends js.Object {
  val alias: f = js.native
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Run tests that failed in the previous executionDot` = js.native
  val `type`: boolean = js.native
}

object AliasDefaultDescriptionType {
  @scala.inline
  def apply(alias: f, description: `Run tests that failed in the previous executionDot`, `type`: boolean): AliasDefaultDescriptionType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultDescriptionType]
  }
  @scala.inline
  implicit class AliasDefaultDescriptionTypeOps[Self <: AliasDefaultDescriptionType] (val x: Self) extends AnyVal {
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
    def setAlias(value: f): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: `Run tests that failed in the previous executionDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

