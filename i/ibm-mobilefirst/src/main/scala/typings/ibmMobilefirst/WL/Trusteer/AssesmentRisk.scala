package typings.ibmMobilefirst.WL.Trusteer

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
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], lastCalculated = lastCalculated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssesmentRisk]
  }
}

