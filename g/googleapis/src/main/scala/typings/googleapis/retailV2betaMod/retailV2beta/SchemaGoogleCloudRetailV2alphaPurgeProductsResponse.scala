package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaPurgeProductsResponse extends StObject {
  
  /**
    * The total count of products purged as a result of the operation.
    */
  var purgeCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A sample of the product names that will be deleted. Only populated if `force` is set to false. A max of 100 names will be returned and the names are chosen at random.
    */
  var purgeSample: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaPurgeProductsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaPurgeProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaPurgeProductsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaPurgeProductsResponse](x: Self) {
    
    inline def setPurgeCount(value: String): Self = StObject.set(x, "purgeCount", value.asInstanceOf[js.Any])
    
    inline def setPurgeCountNull: Self = StObject.set(x, "purgeCount", null)
    
    inline def setPurgeCountUndefined: Self = StObject.set(x, "purgeCount", js.undefined)
    
    inline def setPurgeSample(value: js.Array[String]): Self = StObject.set(x, "purgeSample", value.asInstanceOf[js.Any])
    
    inline def setPurgeSampleNull: Self = StObject.set(x, "purgeSample", null)
    
    inline def setPurgeSampleUndefined: Self = StObject.set(x, "purgeSample", js.undefined)
    
    inline def setPurgeSampleVarargs(value: String*): Self = StObject.set(x, "purgeSample", js.Array(value*))
  }
}
