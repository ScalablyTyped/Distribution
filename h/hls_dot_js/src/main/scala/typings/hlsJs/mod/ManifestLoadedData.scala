package typings.hlsJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestLoadedData extends StObject {
  
  var audioTracks: js.Array[MediaPlaylist]
  
  var captions: js.UndefOr[js.Array[MediaPlaylist]] = js.undefined
  
  var levels: js.Array[LevelParsed]
  
  var networkDetails: Any
  
  var sessionData: (Record[String, AttrList]) | Null
  
  var stats: LoaderStats
  
  var subtitles: js.UndefOr[js.Array[MediaPlaylist]] = js.undefined
  
  var url: String
}
object ManifestLoadedData {
  
  inline def apply(
    audioTracks: js.Array[MediaPlaylist],
    levels: js.Array[LevelParsed],
    networkDetails: Any,
    stats: LoaderStats,
    url: String
  ): ManifestLoadedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], networkDetails = networkDetails.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], sessionData = null)
    __obj.asInstanceOf[ManifestLoadedData]
  }
  
  extension [Self <: ManifestLoadedData](x: Self) {
    
    inline def setAudioTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setCaptions(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
    
    inline def setCaptionsVarargs(value: MediaPlaylist*): Self = StObject.set(x, "captions", js.Array(value*))
    
    inline def setLevels(value: js.Array[LevelParsed]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: LevelParsed*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setSessionData(value: Record[String, AttrList]): Self = StObject.set(x, "sessionData", value.asInstanceOf[js.Any])
    
    inline def setSessionDataNull: Self = StObject.set(x, "sessionData", null)
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setSubtitles(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    inline def setSubtitlesVarargs(value: MediaPlaylist*): Self = StObject.set(x, "subtitles", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
