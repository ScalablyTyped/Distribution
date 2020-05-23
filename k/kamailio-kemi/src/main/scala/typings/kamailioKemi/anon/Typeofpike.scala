package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpike extends js.Object {
  def pike_check_req(): Double
}

object Typeofpike {
  @scala.inline
  def apply(pike_check_req: () => Double): Typeofpike = {
    val __obj = js.Dynamic.literal(pike_check_req = js.Any.fromFunction0(pike_check_req))
    __obj.asInstanceOf[Typeofpike]
  }
}

