package typings.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalculationMethod extends js.Object {
  var calculationMethod: String
  var usageTypes: js.Array[String]
}

object AnonCalculationMethod {
  @scala.inline
  def apply(calculationMethod: String, usageTypes: js.Array[String]): AnonCalculationMethod = {
    val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCalculationMethod]
  }
}

