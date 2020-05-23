package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var Location: DisplayPosition
  var MatchLevel: String
  var MatchQuality: HouseNumber
  var MatchType: String
  var Relevance: Double
}

object Location {
  @scala.inline
  def apply(
    Location: DisplayPosition,
    MatchLevel: String,
    MatchQuality: HouseNumber,
    MatchType: String,
    Relevance: Double
  ): Location = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], MatchLevel = MatchLevel.asInstanceOf[js.Any], MatchQuality = MatchQuality.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], Relevance = Relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

