package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsAudioTrack extends js.Object {
  
  var audioCodec: String = js.native
  
  var autoselect: Boolean = js.native
  
  var default: Boolean = js.native
  
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
  implicit class HlsAudioTrackOps[Self <: HlsAudioTrack] (val x: Self) extends AnyVal {
    
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
    def setAudioCodec(value: String): Self = this.set("audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoselect(value: Boolean): Self = this.set("autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced(value: Boolean): Self = this.set("forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
