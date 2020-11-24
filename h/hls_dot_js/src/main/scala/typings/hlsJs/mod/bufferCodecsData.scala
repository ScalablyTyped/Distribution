package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface mediaDetachingData {}
// interface mediaDetachedData {}
// interface bufferResetData {}
@js.native
trait bufferCodecsData extends js.Object {
  
  var tracks: Tracks = js.native
}
object bufferCodecsData {
  
  @scala.inline
  def apply(tracks: Tracks): bufferCodecsData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCodecsData]
  }
  
  @scala.inline
  implicit class bufferCodecsDataOps[Self <: bufferCodecsData] (val x: Self) extends AnyVal {
    
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
    def setTracks(value: Tracks): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
}
