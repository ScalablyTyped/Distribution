package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.FailureResponse
import typings.ibmMobilefirst.WL.ResponseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.native
  def onFailure(response: FailureResponse): Unit = js.native
  def onSuccess(response: ResponseBase): Unit = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(onFailure: FailureResponse => Unit, onSuccess: ResponseBase => Unit): ConnectOptions = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
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
    def setOnFailure(value: FailureResponse => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSuccess(value: ResponseBase => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

