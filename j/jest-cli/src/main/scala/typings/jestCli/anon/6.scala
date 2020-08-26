package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Specifies when notifications will appear for test resultsDot`
import typings.jestCli.jestCliStrings.`failure-change`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6` extends js.Object {
  val default: `failure-change` = js.native
  val description: `Specifies when notifications will appear for test resultsDot` = js.native
  val `type`: string = js.native
}

object `6` {
  @scala.inline
  def apply(
    default: `failure-change`,
    description: `Specifies when notifications will appear for test resultsDot`,
    `type`: string
  ): `6` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
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
    def setDefault(value: `failure-change`): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: `Specifies when notifications will appear for test resultsDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

