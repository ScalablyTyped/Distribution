package typings.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawArgument extends js.Object {
  var formattedKey: String = js.native
  var option: KnownOption = js.native
  var rawKey: String = js.native
  var value: js.Any = js.native
}

object RawArgument {
  @scala.inline
  def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
    val __obj = js.Dynamic.literal(formattedKey = formattedKey.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], rawKey = rawKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArgument]
  }
  @scala.inline
  implicit class RawArgumentOps[Self <: RawArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormattedKey(value: String): Self = this.set("formattedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOption(value: KnownOption): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawKey(value: String): Self = this.set("rawKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

