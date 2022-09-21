package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteHeaderMatch extends StObject {
  
  /**
    * Required. The key of the header.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies how to match against the value of the header. If not specified, a default value of EXACT is used.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value of the header.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrpcRouteHeaderMatch {
  
  inline def apply(): SchemaGrpcRouteHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteHeaderMatch]
  }
  
  extension [Self <: SchemaGrpcRouteHeaderMatch](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
