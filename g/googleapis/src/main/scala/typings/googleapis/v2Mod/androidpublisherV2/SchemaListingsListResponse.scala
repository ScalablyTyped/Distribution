package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#listingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var listings: js.UndefOr[js.Array[SchemaListing]] = js.undefined
}
object SchemaListingsListResponse {
  
  inline def apply(): SchemaListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListingsListResponse]
  }
  
  extension [Self <: SchemaListingsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListings(value: js.Array[SchemaListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setListingsVarargs(value: SchemaListing*): Self = StObject.set(x, "listings", js.Array(value :_*))
  }
}
