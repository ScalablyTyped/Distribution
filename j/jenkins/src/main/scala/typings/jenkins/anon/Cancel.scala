package typings.jenkins.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  def cancel(n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def item(n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
}

object Cancel {
  @scala.inline
  def apply(
    cancel: (Double, js.Function1[/* err */ Error, Unit]) => Unit,
    item: (Double, js.Function2[/* err */ Error, /* data */ js.Any, Unit]) => Unit,
    list: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit
  ): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), item = js.Any.fromFunction2(item), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
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
    def setCancel(value: (Double, js.Function1[/* err */ Error, Unit]) => Unit): Self = this.set("cancel", js.Any.fromFunction2(value))
    @scala.inline
    def setItem(value: (Double, js.Function2[/* err */ Error, /* data */ js.Any, Unit]) => Unit): Self = this.set("item", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

