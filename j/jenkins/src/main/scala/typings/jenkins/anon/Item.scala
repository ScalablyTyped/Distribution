package typings.jenkins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  def cancel(n: Double): js.Promise[Unit] = js.native
  def item(n: Double): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
}

object Item {
  @scala.inline
  def apply(cancel: Double => js.Promise[Unit], item: Double => js.Promise[_], list: () => js.Promise[_]): Item = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setCancel(value: Double => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => js.Promise[_]): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => js.Promise[_]): Self = this.set("list", js.Any.fromFunction0(value))
  }
  
}

