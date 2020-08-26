package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Run only tests with a name that matches the regex patternDot`
import typings.jestCli.jestCliStrings.string
import typings.jestCli.jestCliStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `18` extends js.Object {
  val alias: t = js.native
  val description: `Run only tests with a name that matches the regex patternDot` = js.native
  val `type`: string = js.native
}

object `18` {
  @scala.inline
  def apply(
    alias: t,
    description: `Run only tests with a name that matches the regex patternDot`,
    `type`: string
  ): `18` = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  @scala.inline
  implicit class `18Ops`[Self <: `18`] (val x: Self) extends AnyVal {
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
    def setAlias(value: t): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: `Run only tests with a name that matches the regex patternDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

