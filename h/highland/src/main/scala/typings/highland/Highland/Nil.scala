package typings.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// hacky unique
// TODO do we need this?
@js.native
trait Nil extends js.Object {
  var Highland_NIL: Nil = js.native
}

object Nil {
  @scala.inline
  def apply(Highland_NIL: Nil): Nil = {
    val __obj = js.Dynamic.literal(Highland_NIL = Highland_NIL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nil]
  }
  @scala.inline
  implicit class NilOps[Self <: Nil] (val x: Self) extends AnyVal {
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
    def setHighland_NIL(value: Nil): Self = this.set("Highland_NIL", value.asInstanceOf[js.Any])
  }
  
}

