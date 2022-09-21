package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaylistContextType extends StObject
@JSImport("hls.js", "PlaylistContextType")
@js.native
object PlaylistContextType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaylistContextType & String] = js.native
  
  @js.native
  sealed trait AUDIO_TRACK
    extends StObject
       with PlaylistContextType
  /* "audioTrack" */ val AUDIO_TRACK: typings.hlsJs.mod.PlaylistContextType.AUDIO_TRACK & String = js.native
  
  @js.native
  sealed trait LEVEL
    extends StObject
       with PlaylistContextType
  /* "level" */ val LEVEL: typings.hlsJs.mod.PlaylistContextType.LEVEL & String = js.native
  
  @js.native
  sealed trait MANIFEST
    extends StObject
       with PlaylistContextType
  /* "manifest" */ val MANIFEST: typings.hlsJs.mod.PlaylistContextType.MANIFEST & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACK
    extends StObject
       with PlaylistContextType
  /* "subtitleTrack" */ val SUBTITLE_TRACK: typings.hlsJs.mod.PlaylistContextType.SUBTITLE_TRACK & String = js.native
}
