package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCaPoolsResponse extends StObject {
  
  /**
    * The list of CaPools.
    */
  var caPools: js.UndefOr[js.Array[SchemaCaPool]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListCertificateAuthoritiesRequest.next_page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations (e.g. "us-west1") that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCaPoolsResponse {
  
  inline def apply(): SchemaListCaPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCaPoolsResponse]
  }
  
  extension [Self <: SchemaListCaPoolsResponse](x: Self) {
    
    inline def setCaPools(value: js.Array[SchemaCaPool]): Self = StObject.set(x, "caPools", value.asInstanceOf[js.Any])
    
    inline def setCaPoolsUndefined: Self = StObject.set(x, "caPools", js.undefined)
    
    inline def setCaPoolsVarargs(value: SchemaCaPool*): Self = StObject.set(x, "caPools", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
