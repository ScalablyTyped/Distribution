package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingsettingsGetSupportedCarriersResponse extends StObject {
  
  /**
    * A list of supported carriers. May be empty.
    */
  var carriers: js.UndefOr[js.Array[SchemaCarriersCarrier]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedCarriersResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaShippingsettingsGetSupportedCarriersResponse {
  
  inline def apply(): SchemaShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedCarriersResponse]
  }
  
  extension [Self <: SchemaShippingsettingsGetSupportedCarriersResponse](x: Self) {
    
    inline def setCarriers(value: js.Array[SchemaCarriersCarrier]): Self = StObject.set(x, "carriers", value.asInstanceOf[js.Any])
    
    inline def setCarriersUndefined: Self = StObject.set(x, "carriers", js.undefined)
    
    inline def setCarriersVarargs(value: SchemaCarriersCarrier*): Self = StObject.set(x, "carriers", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
