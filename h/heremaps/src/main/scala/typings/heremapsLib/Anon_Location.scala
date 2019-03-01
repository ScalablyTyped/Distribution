package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var Location: Anon_AddressDisplayPosition
  var MatchLevel: java.lang.String
  var MatchQuality: Anon_CityHouseNumber
  var MatchType: java.lang.String
  var Relevance: scala.Double
}

object Anon_Location {
  @scala.inline
  def apply(
    Location: Anon_AddressDisplayPosition,
    MatchLevel: java.lang.String,
    MatchQuality: Anon_CityHouseNumber,
    MatchType: java.lang.String,
    Relevance: scala.Double
  ): Anon_Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("MatchLevel")(MatchLevel)
    __obj.updateDynamic("MatchQuality")(MatchQuality)
    __obj.updateDynamic("MatchType")(MatchType)
    __obj.updateDynamic("Relevance")(Relevance)
    __obj.asInstanceOf[Anon_Location]
  }
}

