package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsAudioTrack extends StObject {
  
  var default: Boolean = js.native
  
  var audioCodec: String = js.native
  
  var autoselect: Boolean = js.native
  
  var forced: Boolean = js.native
  
  var groupId: String = js.native
  
  var id: Double = js.native
  
  var lang: String = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object HlsAudioTrack {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class HlsAudioTrackMutableBuilder[Self <: HlsAudioTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
