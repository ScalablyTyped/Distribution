package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicScopedRouteConfigs extends StObject {
  
  /**
    * The timestamp when the scoped route config set was last updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name assigned to the scoped route configurations.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scoped route configurations.
    */
  var scopedRouteConfigs: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the scoped routes configuration was loaded.
    */
  var versionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicScopedRouteConfigs {
  
  inline def apply(): SchemaDynamicScopedRouteConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicScopedRouteConfigs]
  }
  
  extension [Self <: SchemaDynamicScopedRouteConfigs](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScopedRouteConfigs(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "scopedRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setScopedRouteConfigsNull: Self = StObject.set(x, "scopedRouteConfigs", null)
    
    inline def setScopedRouteConfigsUndefined: Self = StObject.set(x, "scopedRouteConfigs", js.undefined)
    
    inline def setScopedRouteConfigsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "scopedRouteConfigs", js.Array(value*))
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoNull: Self = StObject.set(x, "versionInfo", null)
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
