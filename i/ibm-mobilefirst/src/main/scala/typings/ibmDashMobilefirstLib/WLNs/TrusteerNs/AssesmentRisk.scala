package typings
package ibmDashMobilefirstLib.WLNs.TrusteerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssesmentRisk extends js.Object {
  var additionalData: java.lang.String
  var lastCalculated: scala.Double
  var name: java.lang.String
  var value: scala.Double
}

object AssesmentRisk {
  @scala.inline
  def apply(
    additionalData: java.lang.String,
    lastCalculated: scala.Double,
    name: java.lang.String,
    value: scala.Double
  ): AssesmentRisk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalData")(additionalData)
    __obj.updateDynamic("lastCalculated")(lastCalculated)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AssesmentRisk]
  }
}

