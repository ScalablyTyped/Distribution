package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloodlightConfigurationsListResponse extends StObject {
  
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[SchemaFloodlightConfiguration]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfigurationsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaFloodlightConfigurationsListResponse {
  
  inline def apply(): SchemaFloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightConfigurationsListResponse]
  }
  
  extension [Self <: SchemaFloodlightConfigurationsListResponse](x: Self) {
    
    inline def setFloodlightConfigurations(value: js.Array[SchemaFloodlightConfiguration]): Self = StObject.set(x, "floodlightConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationsUndefined: Self = StObject.set(x, "floodlightConfigurations", js.undefined)
    
    inline def setFloodlightConfigurationsVarargs(value: SchemaFloodlightConfiguration*): Self = StObject.set(x, "floodlightConfigurations", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
