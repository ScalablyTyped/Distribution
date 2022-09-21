package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicListenerState extends StObject {
  
  /**
    * The timestamp when the Listener was last successfully updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The listener config.
    */
  var listener: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the listener was loaded. In the future, discrete per-listener versions may be supported by the API.
    */
  var versionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicListenerState {
  
  inline def apply(): SchemaDynamicListenerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicListenerState]
  }
  
  extension [Self <: SchemaDynamicListenerState](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setListener(value: StringDictionary[Any]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerNull: Self = StObject.set(x, "listener", null)
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoNull: Self = StObject.set(x, "versionInfo", null)
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
