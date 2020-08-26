package typings.jsCookie.anon

import typings.jsCookie.mod.CookieReadConverter
import typings.jsCookie.mod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Read[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.native
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.native
}

object Read {
  @scala.inline
  def apply[/* <: js.Object */ TConv](): Read[TConv] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read[TConv]]
  }
  @scala.inline
  implicit class ReadOps[Self <: Read[_], /* <: js.Object */ TConv] (val x: Self with Read[TConv]) extends AnyVal {
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
    def setRead(value: (/* value */ String, /* name */ String) => String): Self = this.set("read", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setWrite(value: (/* value */ String | TConv, /* name */ String) => String): Self = this.set("write", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

