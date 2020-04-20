package typings.ioTs.guardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guard_[A] extends js.Object {
  def is(u: js.Any): /* is A */ Boolean
}

object Guard_ {
  @scala.inline
  def apply[A](is: js.Any => /* is A */ Boolean): Guard_[A] = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is))
    __obj.asInstanceOf[Guard_[A]]
  }
}

