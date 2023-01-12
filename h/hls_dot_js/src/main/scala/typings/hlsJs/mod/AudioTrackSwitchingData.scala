package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackSwitchingData extends StObject {
  
  var groupId: String
  
  var id: Double
  
  var name: String
  
  var `type`: MediaPlaylistType | main
  
  var url: String
}
object AudioTrackSwitchingData {
  
  inline def apply(groupId: String, id: Double, name: String, `type`: MediaPlaylistType | main, url: String): AudioTrackSwitchingData = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackSwitchingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTrackSwitchingData] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaPlaylistType | main): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
