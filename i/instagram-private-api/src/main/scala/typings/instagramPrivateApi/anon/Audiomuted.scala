package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audiomuted extends js.Object {
  
  var audio_muted: js.UndefOr[Boolean] = js.native
  
  var clips: js.UndefOr[js.Array[Length]] = js.native
  
  var length: Double = js.native
  
  var poster_frame_index: js.UndefOr[Double] = js.native
}
object Audiomuted {
  
  @scala.inline
  def apply(length: Double): Audiomuted = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audiomuted]
  }
  
  @scala.inline
  implicit class AudiomutedOps[Self <: Audiomuted] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_muted(value: Boolean): Self = this.set("audio_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio_muted: Self = this.set("audio_muted", js.undefined)
    
    @scala.inline
    def setClipsVarargs(value: Length*): Self = this.set("clips", js.Array(value :_*))
    
    @scala.inline
    def setClips(value: js.Array[Length]): Self = this.set("clips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClips: Self = this.set("clips", js.undefined)
    
    @scala.inline
    def setPoster_frame_index(value: Double): Self = this.set("poster_frame_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster_frame_index: Self = this.set("poster_frame_index", js.undefined)
  }
}
