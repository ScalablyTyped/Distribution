package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasDefaultUndefinedDescriptionString extends js.Object {
  val alias: u = js.native
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: java.lang.String = js.native
  val `type`: boolean = js.native
}

object AliasDefaultUndefinedDescriptionString {
  @scala.inline
  def apply(alias: u, description: java.lang.String, `type`: boolean): AliasDefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultUndefinedDescriptionString]
  }
  @scala.inline
  implicit class AliasDefaultUndefinedDescriptionStringOps[Self <: AliasDefaultUndefinedDescriptionString] (val x: Self) extends AnyVal {
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
    def setAlias(value: u): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

