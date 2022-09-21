package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStaticListener extends StObject {
  
  /**
    * The timestamp when the Listener was last successfully updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The listener config.
    */
  var listener: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaStaticListener {
  
  inline def apply(): SchemaStaticListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStaticListener]
  }
  
  extension [Self <: SchemaStaticListener](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setListener(value: StringDictionary[Any]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerNull: Self = StObject.set(x, "listener", null)
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
  }
}
