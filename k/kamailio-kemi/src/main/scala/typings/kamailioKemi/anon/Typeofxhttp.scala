package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofxhttp extends js.Object {
  def xhttp_reply(code: Double, reason: String, ctype: String, body: String): Double = js.native
}

object Typeofxhttp {
  @scala.inline
  def apply(xhttp_reply: (Double, String, String, String) => Double): Typeofxhttp = {
    val __obj = js.Dynamic.literal(xhttp_reply = js.Any.fromFunction4(xhttp_reply))
    __obj.asInstanceOf[Typeofxhttp]
  }
  @scala.inline
  implicit class TypeofxhttpOps[Self <: Typeofxhttp] (val x: Self) extends AnyVal {
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
    def setXhttp_reply(value: (Double, String, String, String) => Double): Self = this.set("xhttp_reply", js.Any.fromFunction4(value))
  }
  
}

