package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCertificateRevocationListsResponse extends StObject {
  
  /**
    * The list of CertificateRevocationLists.
    */
  var certificateRevocationLists: js.UndefOr[js.Array[SchemaCertificateRevocationList]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListCertificateRevocationListsRequest.next_page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations (e.g. "us-west1") that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCertificateRevocationListsResponse {
  
  inline def apply(): SchemaListCertificateRevocationListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCertificateRevocationListsResponse]
  }
  
  extension [Self <: SchemaListCertificateRevocationListsResponse](x: Self) {
    
    inline def setCertificateRevocationLists(value: js.Array[SchemaCertificateRevocationList]): Self = StObject.set(x, "certificateRevocationLists", value.asInstanceOf[js.Any])
    
    inline def setCertificateRevocationListsUndefined: Self = StObject.set(x, "certificateRevocationLists", js.undefined)
    
    inline def setCertificateRevocationListsVarargs(value: SchemaCertificateRevocationList*): Self = StObject.set(x, "certificateRevocationLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
