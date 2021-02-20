package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface mediaDetachingData {}
// interface mediaDetachedData {}
// interface bufferResetData {}
@js.native
trait bufferCodecsData extends StObject {
  
  var tracks: Tracks = js.native
}
object bufferCodecsData {
  
  @scala.inline
  def apply(tracks: Tracks): bufferCodecsData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCodecsData]
  }
  
  @scala.inline
  implicit class bufferCodecsDataMutableBuilder[Self <: bufferCodecsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: Tracks): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
