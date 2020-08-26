package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`A string or array of string regexp patterns that Jest uses to detect test filesDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `19` extends js.Object {
  val description: `A string or array of string regexp patterns that Jest uses to detect test filesDot` = js.native
  val string: `true` = js.native
  val `type`: array = js.native
}

object `19` {
  @scala.inline
  def apply(
    description: `A string or array of string regexp patterns that Jest uses to detect test filesDot`,
    string: `true`,
    `type`: array
  ): `19` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  @scala.inline
  implicit class `19Ops`[Self <: `19`] (val x: Self) extends AnyVal {
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
    def setDescription(value: `A string or array of string regexp patterns that Jest uses to detect test filesDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: `true`): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

