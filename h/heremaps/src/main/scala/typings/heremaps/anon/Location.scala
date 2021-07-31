package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
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
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: DisplayPosition): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchLevel(value: String): Self = StObject.set(x, "MatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchQuality(value: HouseNumber): Self = StObject.set(x, "MatchQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "MatchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "Relevance", value.asInstanceOf[js.Any])
  }
}
