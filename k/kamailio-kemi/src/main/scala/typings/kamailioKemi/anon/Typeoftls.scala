package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftls extends js.Object {
  def is_peer_verified(): Double = js.native
}

object Typeoftls {
  @scala.inline
  def apply(is_peer_verified: () => Double): Typeoftls = {
    val __obj = js.Dynamic.literal(is_peer_verified = js.Any.fromFunction0(is_peer_verified))
    __obj.asInstanceOf[Typeoftls]
  }
  @scala.inline
  implicit class TypeoftlsOps[Self <: Typeoftls] (val x: Self) extends AnyVal {
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
    def setIs_peer_verified(value: () => Double): Self = this.set("is_peer_verified", js.Any.fromFunction0(value))
  }
  
}

