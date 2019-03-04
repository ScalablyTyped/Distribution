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
  def apply(observe: js.Function0[scala.Unit], triggerLoad: js.Function1[stdLib.Element, scala.Unit]): Observer = {
    val __obj = js.Dynamic.literal(observe = observe, triggerLoad = triggerLoad)
  
    __obj.asInstanceOf[Observer]
  }
}

