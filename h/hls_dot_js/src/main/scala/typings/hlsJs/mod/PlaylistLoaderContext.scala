package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistLoaderContext
  extends StObject
     with LoaderContext {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var groupId: String | Null
  
  var id: Double | Null
  
  var isSidxRequest: js.UndefOr[Boolean] = js.undefined
  
  var level: Double | Null
  
  var levelDetails: js.UndefOr[LevelDetails] = js.undefined
  
  var loader: js.UndefOr[Loader[PlaylistLoaderContext]] = js.undefined
  
  var `type`: PlaylistContextType
}
object PlaylistLoaderContext {
  
  inline def apply(responseType: String, `type`: PlaylistContextType, url: String): PlaylistLoaderContext = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], deliveryDirectives = null, groupId = null, id = null, level = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistLoaderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistLoaderContext] (val x: Self) extends AnyVal {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIsSidxRequest(value: Boolean): Self = StObject.set(x, "isSidxRequest", value.asInstanceOf[js.Any])
    
    inline def setIsSidxRequestUndefined: Self = StObject.set(x, "isSidxRequest", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelDetails(value: LevelDetails): Self = StObject.set(x, "levelDetails", value.asInstanceOf[js.Any])
    
    inline def setLevelDetailsUndefined: Self = StObject.set(x, "levelDetails", js.undefined)
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLoader(value: Loader[PlaylistLoaderContext]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setType(value: PlaylistContextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
