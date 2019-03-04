package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityHouseNumber extends js.Object {
  var City: scala.Double
  var HouseNumber: scala.Double
  var Street: js.Array[scala.Double]
}

object Anon_CityHouseNumber {
  @scala.inline
  def apply(City: scala.Double, HouseNumber: scala.Double, Street: js.Array[scala.Double]): Anon_CityHouseNumber = {
    val __obj = js.Dynamic.literal(City = City, HouseNumber = HouseNumber, Street = Street)
  
    __obj.asInstanceOf[Anon_CityHouseNumber]
  }
}

