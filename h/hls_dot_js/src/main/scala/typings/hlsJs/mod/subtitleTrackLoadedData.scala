package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subtitleTrackLoadedData extends StObject {
  
  var details: LevelDetails
  
  var id: String
  
  var stats: Stats
}
object subtitleTrackLoadedData {
  
  inline def apply(details: LevelDetails, id: String, stats: Stats): subtitleTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleTrackLoadedData]
  }
  
  extension [Self <: subtitleTrackLoadedData](x: Self) {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
