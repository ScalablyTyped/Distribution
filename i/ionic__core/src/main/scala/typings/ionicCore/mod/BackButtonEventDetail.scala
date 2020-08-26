package typings.ionicCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackButtonEventDetail extends js.Object {
  def register(
    priority: Double,
    handler: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]
  ): Unit = js.native
}

object BackButtonEventDetail {
  @scala.inline
  def apply(
    register: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]) => Unit
  ): BackButtonEventDetail = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[BackButtonEventDetail]
  }
  @scala.inline
  implicit class BackButtonEventDetailOps[Self <: BackButtonEventDetail] (val x: Self) extends AnyVal {
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
    def setRegister(
      value: (Double, js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[_] | Unit]) => Unit
    ): Self = this.set("register", js.Any.fromFunction2(value))
  }
  
}

