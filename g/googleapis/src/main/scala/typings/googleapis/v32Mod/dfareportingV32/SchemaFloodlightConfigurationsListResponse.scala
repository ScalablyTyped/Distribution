package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Configuration List Response
  */
trait SchemaFloodlightConfigurationsListResponse extends StObject {
  
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[SchemaFloodlightConfiguration]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfigurationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaFloodlightConfigurationsListResponse {
  
  inline def apply(): SchemaFloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightConfigurationsListResponse]
  }
  
  extension [Self <: SchemaFloodlightConfigurationsListResponse](x: Self) {
    
    inline def setFloodlightConfigurations(value: js.Array[SchemaFloodlightConfiguration]): Self = StObject.set(x, "floodlightConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationsUndefined: Self = StObject.set(x, "floodlightConfigurations", js.undefined)
    
    inline def setFloodlightConfigurationsVarargs(value: SchemaFloodlightConfiguration*): Self = StObject.set(x, "floodlightConfigurations", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
