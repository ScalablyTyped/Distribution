package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityHouseNumber extends js.Object {
  var City: Double
  var HouseNumber: Double
  var Street: js.Array[Double]
}

object Anon_CityHouseNumber {
  @scala.inline
  def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): Anon_CityHouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CityHouseNumber]
  }
}

