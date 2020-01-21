package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.FailureResponse
import typings.ibmMobilefirst.WL.ResponseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  def onFailure(response: FailureResponse): Unit
  def onSuccess(response: ResponseBase): Unit
}

object ConnectOptions {
  @scala.inline
  def apply(onFailure: FailureResponse => Unit, onSuccess: ResponseBase => Unit, timeout: Int | Double = null): ConnectOptions = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

