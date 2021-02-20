package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait manifestLoadedData extends StObject {
  
  var audioTracks: js.Array[Double] = js.native
  
  var levels: js.Array[Level] = js.native
  
  var stats: Stats = js.native
  
  var url: String = js.native
}
object manifestLoadedData {
  
  @scala.inline
  def apply(audioTracks: js.Array[Double], levels: js.Array[Level], stats: Stats, url: String): manifestLoadedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestLoadedData]
  }
  
  @scala.inline
  implicit class manifestLoadedDataMutableBuilder[Self <: manifestLoadedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioTracks(value: js.Array[Double]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTracksVarargs(value: Double*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
