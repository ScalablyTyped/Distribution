package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var Location: Anon_AddressDisplayPosition
  var MatchLevel: String
  var MatchQuality: Anon_CityHouseNumber
  var MatchType: String
  var Relevance: Double
}

object Anon_Location {
  @scala.inline
  def apply(
    Location: Anon_AddressDisplayPosition,
    MatchLevel: String,
    MatchQuality: Anon_CityHouseNumber,
    MatchType: String,
    Relevance: Double
  ): Anon_Location = {
    val __obj = js.Dynamic.literal(Location = Location, MatchLevel = MatchLevel, MatchQuality = MatchQuality, MatchType = MatchType, Relevance = Relevance)
  
    __obj.asInstanceOf[Anon_Location]
  }
}

