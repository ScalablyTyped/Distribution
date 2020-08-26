package typings.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySeparator extends js.Object {
  var keySeparator: js.UndefOr[String] = js.native
}

object KeySeparator {
  @scala.inline
  def apply(): KeySeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeySeparator]
  }
  @scala.inline
  implicit class KeySeparatorOps[Self <: KeySeparator] (val x: Self) extends AnyVal {
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
    def setKeySeparator(value: String): Self = this.set("keySeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySeparator: Self = this.set("keySeparator", js.undefined)
  }
  
}

