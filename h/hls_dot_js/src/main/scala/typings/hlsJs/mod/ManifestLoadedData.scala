package typings.hlsJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestLoadedData extends StObject {
  
  var audioTracks: js.Array[MediaPlaylist]
  
  var captions: js.UndefOr[js.Array[MediaPlaylist]] = js.undefined
  
  var contentSteering: ContentSteeringOptions | Null
  
  var levels: js.Array[LevelParsed]
  
  var networkDetails: Any
  
  var sessionData: (Record[String, AttrList]) | Null
  
  var sessionKeys: js.Array[LevelKey] | Null
  
  var startTimeOffset: Double | Null
  
  var stats: LoaderStats
  
  var subtitles: js.UndefOr[js.Array[MediaPlaylist]] = js.undefined
  
  var url: String
  
  var variableList: VariableMap | Null
}
object ManifestLoadedData {
  
  inline def apply(
    audioTracks: js.Array[MediaPlaylist],
    levels: js.Array[LevelParsed],
    networkDetails: Any,
    stats: LoaderStats,
    url: String
  ): ManifestLoadedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], networkDetails = networkDetails.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], contentSteering = null, sessionData = null, sessionKeys = null, startTimeOffset = null, variableList = null)
    __obj.asInstanceOf[ManifestLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestLoadedData] (val x: Self) extends AnyVal {
    
    inline def setAudioTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setCaptions(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
    
    inline def setCaptionsVarargs(value: MediaPlaylist*): Self = StObject.set(x, "captions", js.Array(value*))
    
    inline def setContentSteering(value: ContentSteeringOptions): Self = StObject.set(x, "contentSteering", value.asInstanceOf[js.Any])
    
    inline def setContentSteeringNull: Self = StObject.set(x, "contentSteering", null)
    
    inline def setLevels(value: js.Array[LevelParsed]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: LevelParsed*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setSessionData(value: Record[String, AttrList]): Self = StObject.set(x, "sessionData", value.asInstanceOf[js.Any])
    
    inline def setSessionDataNull: Self = StObject.set(x, "sessionData", null)
    
    inline def setSessionKeys(value: js.Array[LevelKey]): Self = StObject.set(x, "sessionKeys", value.asInstanceOf[js.Any])
    
    inline def setSessionKeysNull: Self = StObject.set(x, "sessionKeys", null)
    
    inline def setSessionKeysVarargs(value: LevelKey*): Self = StObject.set(x, "sessionKeys", js.Array(value*))
    
    inline def setStartTimeOffset(value: Double): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setSubtitles(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    inline def setSubtitlesVarargs(value: MediaPlaylist*): Self = StObject.set(x, "subtitles", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVariableList(value: VariableMap): Self = StObject.set(x, "variableList", value.asInstanceOf[js.Any])
    
    inline def setVariableListNull: Self = StObject.set(x, "variableList", null)
  }
}
