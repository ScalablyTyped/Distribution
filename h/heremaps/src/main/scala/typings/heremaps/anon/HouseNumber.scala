package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HouseNumber extends js.Object {
  var City: Double
  var HouseNumber: Double
  var Street: js.Array[Double]
}

object HouseNumber {
  @scala.inline
  def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): HouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[HouseNumber]
  }
}

