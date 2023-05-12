package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistLoaderContext
  extends StObject
     with LoaderContext {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var id: Double | Null
  
  var level: Double | Null
  
  var levelDetails: js.UndefOr[LevelDetails] = js.undefined
  
  var `type`: PlaylistContextType
}
object PlaylistLoaderContext {
  
  inline def apply(responseType: String, `type`: PlaylistContextType, url: String): PlaylistLoaderContext = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], deliveryDirectives = null, id = null, level = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistLoaderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistLoaderContext] (val x: Self) extends AnyVal {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelDetails(value: LevelDetails): Self = StObject.set(x, "levelDetails", value.asInstanceOf[js.Any])
    
    inline def setLevelDetailsUndefined: Self = StObject.set(x, "levelDetails", js.undefined)
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setType(value: PlaylistContextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
