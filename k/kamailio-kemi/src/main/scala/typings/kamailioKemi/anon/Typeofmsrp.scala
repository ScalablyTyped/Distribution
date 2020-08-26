package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmsrp extends js.Object {
  def cmap_lookup(): Double = js.native
  def cmap_save(): Double = js.native
  def is_reply(): Double = js.native
  def is_request(): Double = js.native
  def relay(): Double = js.native
  def relay_flags(rtflags: Double): Double = js.native
  def reply(rcode: String, rtext: String, rhdrs: String): Double = js.native
  def reply_flags(rtflags: Double): Double = js.native
  def set_dst(rtaddr: String, rfsock: String): Double = js.native
}

object Typeofmsrp {
  @scala.inline
  def apply(
    cmap_lookup: () => Double,
    cmap_save: () => Double,
    is_reply: () => Double,
    is_request: () => Double,
    relay: () => Double,
    relay_flags: Double => Double,
    reply: (String, String, String) => Double,
    reply_flags: Double => Double,
    set_dst: (String, String) => Double
  ): Typeofmsrp = {
    val __obj = js.Dynamic.literal(cmap_lookup = js.Any.fromFunction0(cmap_lookup), cmap_save = js.Any.fromFunction0(cmap_save), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), relay = js.Any.fromFunction0(relay), relay_flags = js.Any.fromFunction1(relay_flags), reply = js.Any.fromFunction3(reply), reply_flags = js.Any.fromFunction1(reply_flags), set_dst = js.Any.fromFunction2(set_dst))
    __obj.asInstanceOf[Typeofmsrp]
  }
  @scala.inline
  implicit class TypeofmsrpOps[Self <: Typeofmsrp] (val x: Self) extends AnyVal {
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
    def setCmap_lookup(value: () => Double): Self = this.set("cmap_lookup", js.Any.fromFunction0(value))
    @scala.inline
    def setCmap_save(value: () => Double): Self = this.set("cmap_save", js.Any.fromFunction0(value))
    @scala.inline
    def setIs_reply(value: () => Double): Self = this.set("is_reply", js.Any.fromFunction0(value))
    @scala.inline
    def setIs_request(value: () => Double): Self = this.set("is_request", js.Any.fromFunction0(value))
    @scala.inline
    def setRelay(value: () => Double): Self = this.set("relay", js.Any.fromFunction0(value))
    @scala.inline
    def setRelay_flags(value: Double => Double): Self = this.set("relay_flags", js.Any.fromFunction1(value))
    @scala.inline
    def setReply(value: (String, String, String) => Double): Self = this.set("reply", js.Any.fromFunction3(value))
    @scala.inline
    def setReply_flags(value: Double => Double): Self = this.set("reply_flags", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_dst(value: (String, String) => Double): Self = this.set("set_dst", js.Any.fromFunction2(value))
  }
  
}

