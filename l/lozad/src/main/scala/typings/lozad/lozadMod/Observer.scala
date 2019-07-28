package typings.lozad.lozadMod

import typings.std.Element
import typings.std.IntersectionObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var observer: IntersectionObserver
  def observe(): Unit
  def triggerLoad(element: Element): Unit
}

object Observer {
  @scala.inline
  def apply(observe: () => Unit, observer: IntersectionObserver, triggerLoad: Element => Unit): Observer = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), observer = observer, triggerLoad = js.Any.fromFunction1(triggerLoad))
  
    __obj.asInstanceOf[Observer]
  }
}

