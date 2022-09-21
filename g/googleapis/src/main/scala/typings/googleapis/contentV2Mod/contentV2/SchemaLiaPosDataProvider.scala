package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaPosDataProvider extends StObject {
  
  /**
    * The ID of the POS data provider.
    */
  var posDataProviderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiaPosDataProvider {
  
  inline def apply(): SchemaLiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaPosDataProvider]
  }
  
  extension [Self <: SchemaLiaPosDataProvider](x: Self) {
    
    inline def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    inline def setPosDataProviderIdNull: Self = StObject.set(x, "posDataProviderId", null)
    
    inline def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    inline def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setPosExternalAccountIdNull: Self = StObject.set(x, "posExternalAccountId", null)
    
    inline def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
