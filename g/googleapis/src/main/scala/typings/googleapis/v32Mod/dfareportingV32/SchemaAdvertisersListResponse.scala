package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advertiser List Response
  */
trait SchemaAdvertisersListResponse extends StObject {
  
  /**
    * Advertiser collection.
    */
  var advertisers: js.UndefOr[js.Array[SchemaAdvertiser]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertisersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaAdvertisersListResponse {
  
  inline def apply(): SchemaAdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertisersListResponse]
  }
  
  extension [Self <: SchemaAdvertisersListResponse](x: Self) {
    
    inline def setAdvertisers(value: js.Array[SchemaAdvertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    inline def setAdvertisersVarargs(value: SchemaAdvertiser*): Self = StObject.set(x, "advertisers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
