package typings.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler[THandlerName /* <: String */] extends js.Object {
  var handler: js.UndefOr[THandlerName] = js.native
}

object Handler {
  @scala.inline
  def apply[/* <: java.lang.String */ THandlerName](): Handler[THandlerName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler[THandlerName]]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler[_], /* <: java.lang.String */ THandlerName] (val x: Self with Handler[THandlerName]) extends AnyVal {
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
    def setHandler(value: THandlerName): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
  }
  
}

