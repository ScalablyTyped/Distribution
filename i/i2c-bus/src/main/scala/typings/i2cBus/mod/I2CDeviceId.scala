package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2CDeviceId extends js.Object {
  var manufacturer: Double
  var name: String
  var product: Double
}

object I2CDeviceId {
  @scala.inline
  def apply(manufacturer: Double, name: String, product: Double): I2CDeviceId = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[I2CDeviceId]
  }
}

