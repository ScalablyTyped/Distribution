package typings.ibmDashMobilefirst.WLNs.TrusteerNs

import typings.ibmDashMobilefirst.WLNs.FailureResponse
import typings.ibmDashMobilefirst.WLNs.Response
import typings.ibmDashMobilefirst.WLNs.ResponseHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Trusteer")
@js.native
object ^ extends js.Object {
  def getRiskAssessment(onSuccess: ResponseHandler[Response], onFailure: ResponseHandler[FailureResponse]): AssetmentRisks = js.native
}

