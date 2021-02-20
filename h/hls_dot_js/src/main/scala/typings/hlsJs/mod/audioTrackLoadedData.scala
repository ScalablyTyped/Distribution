package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait audioTrackLoadedData extends StObject {
  
  var details: LevelDetails = js.native
  
  var id: String = js.native
  
  var stats: Stats = js.native
}
object audioTrackLoadedData {
  
  @scala.inline
  def apply(details: LevelDetails, id: String, stats: Stats): audioTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTrackLoadedData]
  }
  
  @scala.inline
  implicit class audioTrackLoadedDataMutableBuilder[Self <: audioTrackLoadedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
