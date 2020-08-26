package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/joi.@hapi/joi.DataUriOptions, 'paddingRequired'> */
@js.native
trait Base64Options extends js.Object {
  var paddingRequired: js.UndefOr[Boolean] = js.native
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.native
}

object Base64Options {
  @scala.inline
  def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  @scala.inline
  implicit class Base64OptionsOps[Self <: Base64Options] (val x: Self) extends AnyVal {
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
    def setPaddingRequired(value: Boolean): Self = this.set("paddingRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRequired: Self = this.set("paddingRequired", js.undefined)
    @scala.inline
    def setUrlSafe(value: Boolean): Self = this.set("urlSafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlSafe: Self = this.set("urlSafe", js.undefined)
  }
  
}

