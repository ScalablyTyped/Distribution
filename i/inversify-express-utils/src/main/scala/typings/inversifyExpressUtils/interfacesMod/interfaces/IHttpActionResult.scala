package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpActionResult extends js.Object {
  def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

object IHttpActionResult {
  @scala.inline
  def apply(executeAsync: () => js.Promise[HttpResponseMessage]): IHttpActionResult = {
    val __obj = js.Dynamic.literal(executeAsync = js.Any.fromFunction0(executeAsync))
    __obj.asInstanceOf[IHttpActionResult]
  }
  @scala.inline
  implicit class IHttpActionResultOps[Self <: IHttpActionResult] (val x: Self) extends AnyVal {
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
    def setExecuteAsync(value: () => js.Promise[HttpResponseMessage]): Self = this.set("executeAsync", js.Any.fromFunction0(value))
  }
  
}

