package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.ResponseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcedureResponse extends ResponseBase {
  var invocationResult: js.UndefOr[ProcedureInvocationResult] = js.native
  var parameters: js.UndefOr[js.Array[_]] = js.native
}

