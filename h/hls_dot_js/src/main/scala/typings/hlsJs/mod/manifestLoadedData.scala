package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait manifestLoadedData extends js.Object {
  
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
  implicit class manifestLoadedDataOps[Self <: manifestLoadedData] (val x: Self) extends AnyVal {
    
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
    def setAudioTracksVarargs(value: Double*): Self = this.set("audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setAudioTracks(value: js.Array[Double]): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
