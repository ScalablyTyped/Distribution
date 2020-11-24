package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait audioTracksUpdatedData extends js.Object {
  
  var audioTracks: js.Array[HlsAudioTrack] = js.native
}
object audioTracksUpdatedData {
  
  @scala.inline
  def apply(audioTracks: js.Array[HlsAudioTrack]): audioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTracksUpdatedData]
  }
  
  @scala.inline
  implicit class audioTracksUpdatedDataOps[Self <: audioTracksUpdatedData] (val x: Self) extends AnyVal {
    
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
    def setAudioTracksVarargs(value: HlsAudioTrack*): Self = this.set("audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setAudioTracks(value: js.Array[HlsAudioTrack]): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
  }
}
