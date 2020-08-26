package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Use this flag to show full diffs instead of a patchDot`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.e
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasDefault extends js.Object {
  val alias: e = js.native
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Use this flag to show full diffs instead of a patchDot` = js.native
  val `type`: boolean = js.native
}

object AliasDefault {
  @scala.inline
  def apply(alias: e, description: `Use this flag to show full diffs instead of a patchDot`, `type`: boolean): AliasDefault = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefault]
  }
  @scala.inline
  implicit class AliasDefaultOps[Self <: AliasDefault] (val x: Self) extends AnyVal {
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
    def setAlias(value: e): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: `Use this flag to show full diffs instead of a patchDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

