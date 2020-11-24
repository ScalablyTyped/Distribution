package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  var Location: DisplayPosition = js.native
  
  var MatchLevel: String = js.native
  
  var MatchQuality: HouseNumber = js.native
  
  var MatchType: String = js.native
  
  var Relevance: Double = js.native
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
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocation(value: DisplayPosition): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchLevel(value: String): Self = this.set("MatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchQuality(value: HouseNumber): Self = this.set("MatchQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchType(value: String): Self = this.set("MatchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("Relevance", value.asInstanceOf[js.Any])
  }
}
