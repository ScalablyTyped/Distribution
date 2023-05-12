package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<hls.js.hls.js.LevelParsed, 'attrs'> */
trait MediaPlaylist extends StObject {
  
  var default: Boolean
  
  var attrs: MediaAttributes
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var autoselect: Boolean
  
  var bitrate: Double
  
  var details: js.UndefOr[LevelDetails] = js.undefined
  
  var forced: Boolean
  
  var groupId: String
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: Double
  
  var instreamId: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var textCodec: js.UndefOr[String] = js.undefined
  
  var `type`: MediaPlaylistType | main
  
  var unknownCodecs: js.UndefOr[js.Array[String]] = js.undefined
  
  var url: String
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MediaPlaylist {
  
  inline def apply(
    attrs: MediaAttributes,
    autoselect: Boolean,
    bitrate: Double,
    default: Boolean,
    forced: Boolean,
    groupId: String,
    id: Double,
    name: String,
    `type`: MediaPlaylistType | main,
    url: String
  ): MediaPlaylist = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoselect = autoselect.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaylist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaPlaylist] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: MediaAttributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstreamId(value: String): Self = StObject.set(x, "instreamId", value.asInstanceOf[js.Any])
    
    inline def setInstreamIdUndefined: Self = StObject.set(x, "instreamId", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTextCodec(value: String): Self = StObject.set(x, "textCodec", value.asInstanceOf[js.Any])
    
    inline def setTextCodecUndefined: Self = StObject.set(x, "textCodec", js.undefined)
    
    inline def setType(value: MediaPlaylistType | main): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecs(value: js.Array[String]): Self = StObject.set(x, "unknownCodecs", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecsUndefined: Self = StObject.set(x, "unknownCodecs", js.undefined)
    
    inline def setUnknownCodecsVarargs(value: String*): Self = StObject.set(x, "unknownCodecs", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
