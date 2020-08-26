package typings.graphqlToolsUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unsubscribe extends js.Object {
  def unsubscribe(): Unit = js.native
}

object Unsubscribe {
  @scala.inline
  def apply(unsubscribe: () => Unit): Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Unsubscribe]
  }
  @scala.inline
  implicit class UnsubscribeOps[Self <: Unsubscribe] (val x: Self) extends AnyVal {
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
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
  
}

