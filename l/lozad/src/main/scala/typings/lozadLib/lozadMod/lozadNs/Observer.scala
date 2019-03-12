package typings
package lozadLib.lozadMod.lozadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  def observe(): scala.Unit
  def triggerLoad(element: stdLib.Element): scala.Unit
}

object Observer {
  @scala.inline
  def apply(observe: () => scala.Unit, triggerLoad: stdLib.Element => scala.Unit): Observer = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), triggerLoad = js.Any.fromFunction1(triggerLoad))
  
    __obj.asInstanceOf[Observer]
  }
}

