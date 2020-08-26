package typings.hapiIron.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBits extends js.Object {
  var keyBits: Double = js.native
}

object KeyBits {
  @scala.inline
  def apply(keyBits: Double): KeyBits = {
    val __obj = js.Dynamic.literal(keyBits = keyBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBits]
  }
  @scala.inline
  implicit class KeyBitsOps[Self <: KeyBits] (val x: Self) extends AnyVal {
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
    def setKeyBits(value: Double): Self = this.set("keyBits", value.asInstanceOf[js.Any])
  }
  
}

