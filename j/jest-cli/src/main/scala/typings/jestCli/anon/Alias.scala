package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`
import typings.jestCli.jestCliStrings.b
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  val alias: b = js.native
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot` = js.native
  val `type`: boolean = js.native
}

object Alias {
  @scala.inline
  def apply(
    alias: b,
    description: `Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`,
    `type`: boolean
  ): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
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
    def setAlias(value: b): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: `Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

