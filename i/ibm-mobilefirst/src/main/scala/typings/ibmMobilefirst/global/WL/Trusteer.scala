package typings.ibmMobilefirst.global.WL

import typings.ibmMobilefirst.WL.ResponseHandler
import typings.ibmMobilefirst.WL.Trusteer.AssetmentRisks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Trusteer")
@js.native
object Trusteer extends js.Object {
  def getRiskAssessment(
    onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
    onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
  ): AssetmentRisks = js.native
}

