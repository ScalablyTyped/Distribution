package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audiomuted extends StObject {
  
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  
  var clips: js.UndefOr[js.Array[Length]] = js.undefined
  
  var length: Double
  
  var poster_frame_index: js.UndefOr[Double] = js.undefined
}
object Audiomuted {
  
  @scala.inline
  def apply(length: Double): Audiomuted = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audiomuted]
  }
  
  @scala.inline
  implicit class AudiomutedMutableBuilder[Self <: Audiomuted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio_muted(value: Boolean): Self = StObject.set(x, "audio_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_mutedUndefined: Self = StObject.set(x, "audio_muted", js.undefined)
    
    @scala.inline
    def setClips(value: js.Array[Length]): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipsUndefined: Self = StObject.set(x, "clips", js.undefined)
    
    @scala.inline
    def setClipsVarargs(value: Length*): Self = StObject.set(x, "clips", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster_frame_index(value: Double): Self = StObject.set(x, "poster_frame_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster_frame_indexUndefined: Self = StObject.set(x, "poster_frame_index", js.undefined)
  }
}
