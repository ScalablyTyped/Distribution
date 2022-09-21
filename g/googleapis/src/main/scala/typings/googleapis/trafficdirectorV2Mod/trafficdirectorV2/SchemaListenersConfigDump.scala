package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListenersConfigDump extends StObject {
  
  /**
    * State for any warming, active, or draining listeners.
    */
  var dynamicListeners: js.UndefOr[js.Array[SchemaDynamicListener]] = js.undefined
  
  /**
    * The statically loaded listener configs.
    */
  var staticListeners: js.UndefOr[js.Array[SchemaStaticListener]] = js.undefined
  
  /**
    * This is the :ref:`version_info ` in the last processed LDS discovery response. If there are only static bootstrap listeners, this field will be "".
    */
  var versionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaListenersConfigDump {
  
  inline def apply(): SchemaListenersConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListenersConfigDump]
  }
  
  extension [Self <: SchemaListenersConfigDump](x: Self) {
    
    inline def setDynamicListeners(value: js.Array[SchemaDynamicListener]): Self = StObject.set(x, "dynamicListeners", value.asInstanceOf[js.Any])
    
    inline def setDynamicListenersUndefined: Self = StObject.set(x, "dynamicListeners", js.undefined)
    
    inline def setDynamicListenersVarargs(value: SchemaDynamicListener*): Self = StObject.set(x, "dynamicListeners", js.Array(value*))
    
    inline def setStaticListeners(value: js.Array[SchemaStaticListener]): Self = StObject.set(x, "staticListeners", value.asInstanceOf[js.Any])
    
    inline def setStaticListenersUndefined: Self = StObject.set(x, "staticListeners", js.undefined)
    
    inline def setStaticListenersVarargs(value: SchemaStaticListener*): Self = StObject.set(x, "staticListeners", js.Array(value*))
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoNull: Self = StObject.set(x, "versionInfo", null)
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
