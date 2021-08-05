package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsAudioTrack extends StObject {
  
  var default: Boolean
  
  var audioCodec: String
  
  var autoselect: Boolean
  
  var forced: Boolean
  
  var groupId: String
  
  var id: Double
  
  var lang: String
  
  var name: String
  
  var `type`: String
  
  var url: String
}
object HlsAudioTrack {
  
  inline def apply(
    audioCodec: String,
    autoselect: Boolean,
    default: Boolean,
    forced: Boolean,
    groupId: String,
    id: Double,
    lang: String,
    name: String,
    `type`: String,
    url: String
  ): HlsAudioTrack = {
    val __obj = js.Dynamic.literal(audioCodec = audioCodec.asInstanceOf[js.Any], autoselect = autoselect.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsAudioTrack]
  }
  
  extension [Self <: HlsAudioTrack](x: Self) {
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
