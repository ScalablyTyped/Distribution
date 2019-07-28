package typings.jqueryDotCycle2.JQueryCycle2Ns

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  def before(opts: Options, curr: Element, next: Element, fwd: Boolean): Unit
}

object Transition {
  @scala.inline
  def apply(before: (Options, Element, Element, Boolean) => Unit): Transition = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction4(before))
  
    __obj.asInstanceOf[Transition]
  }
}

