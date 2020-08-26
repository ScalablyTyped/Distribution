package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.ExternalServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFailure extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
}

object OnFailure {
  @scala.inline
  def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  @scala.inline
  implicit class OnFailureOps[Self <: OnFailure] (val x: Self) extends AnyVal {
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
    def setOnFailure(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

