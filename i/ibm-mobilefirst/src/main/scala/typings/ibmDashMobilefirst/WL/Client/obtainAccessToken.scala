package typings.ibmDashMobilefirst.WL.Client

import typings.ibmDashMobilefirst.WL.FailureResponse
import typings.ibmDashMobilefirst.WL.Response
import typings.ibmDashMobilefirst.WL.ResponseHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client.obtainAccessToken")
@js.native
object obtainAccessToken extends js.Object {
  /**
    * @deprecated since version 7.0
    */
  def apply(scope: String, onSuccess: ResponseHandler[Response], onFailure: ResponseHandler[FailureResponse]): Unit = js.native
}

