package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Divert all output to stderrDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `22` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Divert all output to stderrDot` = js.native
  val `type`: boolean = js.native
}

object `22` {
  @scala.inline
  def apply(description: `Divert all output to stderrDot`, `type`: boolean): `22` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
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
    def setDescription(value: `Divert all output to stderrDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

