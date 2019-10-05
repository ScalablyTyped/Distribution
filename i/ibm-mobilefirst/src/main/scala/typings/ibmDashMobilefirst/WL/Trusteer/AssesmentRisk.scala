package typings.ibmDashMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssesmentRisk extends js.Object {
  var additionalData: String
  var lastCalculated: Double
  var name: String
  var value: Double
}

object AssesmentRisk {
  @scala.inline
  def apply(additionalData: String, lastCalculated: Double, name: String, value: Double): AssesmentRisk = {
    val __obj = js.Dynamic.literal(additionalData = additionalData, lastCalculated = lastCalculated, name = name, value = value)
  
    __obj.asInstanceOf[AssesmentRisk]
  }
}

