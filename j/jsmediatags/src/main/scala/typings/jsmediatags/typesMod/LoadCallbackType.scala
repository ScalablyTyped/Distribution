package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadCallbackType extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.native
  def onSuccess(): Unit = js.native
}

object LoadCallbackType {
  @scala.inline
  def apply(onSuccess: () => Unit): LoadCallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[LoadCallbackType]
  }
  @scala.inline
  implicit class LoadCallbackTypeOps[Self <: LoadCallbackType] (val x: Self) extends AnyVal {
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
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: /* error */ jsmediatagsError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

