package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var Location: AnonDisplayPosition
  var MatchLevel: String
  var MatchQuality: AnonHouseNumber
  var MatchType: String
  var Relevance: Double
}

object AnonLocation {
  @scala.inline
  def apply(
    Location: AnonDisplayPosition,
    MatchLevel: String,
    MatchQuality: AnonHouseNumber,
    MatchType: String,
    Relevance: Double
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], MatchLevel = MatchLevel.asInstanceOf[js.Any], MatchQuality = MatchQuality.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], Relevance = Relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}

