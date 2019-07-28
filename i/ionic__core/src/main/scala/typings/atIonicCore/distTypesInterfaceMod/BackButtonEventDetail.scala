package typings.atIonicCore.distTypesInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonEventDetail extends js.Object {
  def register(priority: Double, handler: js.Function0[js.Promise[_] | Unit]): Unit
}

object BackButtonEventDetail {
  @scala.inline
  def apply(register: (Double, js.Function0[js.Promise[_] | Unit]) => Unit): BackButtonEventDetail = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[BackButtonEventDetail]
  }
}

