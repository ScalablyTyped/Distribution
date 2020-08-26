package typings.jestCli.anon

import typings.jestCli.jestCliStrings.string
import typings.jestCli.jestCliStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasDescriptionType extends js.Object {
  val alias: w = js.native
  val description: java.lang.String = js.native
  val `type`: string = js.native
}

object AliasDescriptionType {
  @scala.inline
  def apply(alias: w, description: java.lang.String, `type`: string): AliasDescriptionType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescriptionType]
  }
  @scala.inline
  implicit class AliasDescriptionTypeOps[Self <: AliasDescriptionType] (val x: Self) extends AnyVal {
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
    def setAlias(value: w): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

