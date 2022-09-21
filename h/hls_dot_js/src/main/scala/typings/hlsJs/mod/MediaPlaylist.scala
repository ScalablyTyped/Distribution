package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlaylist
  extends StObject
     with LevelParsed {
  
  var default: Boolean
  
  var autoselect: Boolean
  
  var forced: Boolean
  
  var groupId: js.UndefOr[String] = js.undefined
  
  @JSName("id")
  var id_MediaPlaylist: Double
  
  var instreamId: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var `type`: MediaPlaylistType | main
}
object MediaPlaylist {
  
  inline def apply(
    attrs: LevelAttributes,
    autoselect: Boolean,
    bitrate: Double,
    default: Boolean,
    forced: Boolean,
    id: Double,
    name: String,
    `type`: MediaPlaylistType | main,
    url: String
  ): MediaPlaylist = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoselect = autoselect.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaylist]
  }
  
  extension [Self <: MediaPlaylist](x: Self) {
    
    inline def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstreamId(value: String): Self = StObject.set(x, "instreamId", value.asInstanceOf[js.Any])
    
    inline def setInstreamIdUndefined: Self = StObject.set(x, "instreamId", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setType(value: MediaPlaylistType | main): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
