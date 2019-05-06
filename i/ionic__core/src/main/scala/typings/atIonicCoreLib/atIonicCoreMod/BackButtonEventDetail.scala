package typings
package atIonicCoreLib.atIonicCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonEventDetail extends js.Object {
  def register(priority: scala.Double, handler: js.Function0[js.Promise[_] | scala.Unit]): scala.Unit
}

object BackButtonEventDetail {
  @scala.inline
  def apply(register: (scala.Double, js.Function0[js.Promise[_] | scala.Unit]) => scala.Unit): BackButtonEventDetail = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[BackButtonEventDetail]
  }
}

