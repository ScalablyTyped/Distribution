package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelAmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnError extends js.Object {
  var onError: js.UndefOr[
    js.Function3[/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String, Unit]
  ] = js.native
  var onSuccess: js.UndefOr[js.Function2[/* knuddelAmount */ KnuddelAmount, /* reason */ String, Unit]] = js.native
}

object OnError {
  @scala.inline
  def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
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
    def setOnError(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String) => Unit): Self = this.set("onError", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

