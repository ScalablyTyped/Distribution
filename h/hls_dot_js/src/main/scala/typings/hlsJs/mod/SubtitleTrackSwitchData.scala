package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtitleTrackSwitchData extends StObject {
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[MediaPlaylistType | main] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object SubtitleTrackSwitchData {
  
  inline def apply(id: Double): SubtitleTrackSwitchData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtitleTrackSwitchData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtitleTrackSwitchData] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: MediaPlaylistType | main): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
