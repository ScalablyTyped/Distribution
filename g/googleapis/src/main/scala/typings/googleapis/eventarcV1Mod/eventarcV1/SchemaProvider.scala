package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvider extends StObject {
  
  /**
    * Output only. Human friendly name for the Provider. For example "Cloud Storage".
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Event types for this provider.
    */
  var eventTypes: js.UndefOr[js.Array[SchemaEventType]] = js.undefined
  
  /**
    * Output only. In `projects/{project\}/locations/{location\}/providers/{provider_id\}` format.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaProvider {
  
  inline def apply(): SchemaProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvider]
  }
  
  extension [Self <: SchemaProvider](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventTypes(value: js.Array[SchemaEventType]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    inline def setEventTypesVarargs(value: SchemaEventType*): Self = StObject.set(x, "eventTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
