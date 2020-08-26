package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryInforamtion extends js.Object {
  var ref: String = js.native
  var value: ProtectedValue | ArrayBuffer = js.native
}

object BinaryInforamtion {
  @scala.inline
  def apply(ref: String, value: ProtectedValue | ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryInforamtion]
  }
  @scala.inline
  implicit class BinaryInforamtionOps[Self <: BinaryInforamtion] (val x: Self) extends AnyVal {
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
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ProtectedValue | ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

