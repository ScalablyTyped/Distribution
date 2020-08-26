package typings.hapi.mod.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
  */
@js.native
trait StringifyArguments extends js.Object {
  /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
  var escape: js.UndefOr[Boolean] = js.native
  /** the replacer function or array. Defaults to no action. */
  var replacer: js.UndefOr[StringifyReplacer] = js.native
  /** number of spaces to indent nested object keys. Defaults to no indentation. */
  var space: js.UndefOr[StringifySpace] = js.native
  /* string suffix added after conversion to JSON string. Defaults to no suffix. */
  var suffix: js.UndefOr[String] = js.native
}

object StringifyArguments {
  @scala.inline
  def apply(): StringifyArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyArguments]
  }
  @scala.inline
  implicit class StringifyArgumentsOps[Self <: StringifyArguments] (val x: Self) extends AnyVal {
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
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setReplacerVarargs(value: (String | Double)*): Self = this.set("replacer", js.Array(value :_*))
    @scala.inline
    def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = this.set("replacer", js.Any.fromFunction2(value))
    @scala.inline
    def setReplacer(value: StringifyReplacer): Self = this.set("replacer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    @scala.inline
    def setSpace(value: StringifySpace): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

