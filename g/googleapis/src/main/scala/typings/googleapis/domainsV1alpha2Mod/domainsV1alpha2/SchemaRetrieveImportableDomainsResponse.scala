package typings.googleapis.domainsV1alpha2Mod.domainsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetrieveImportableDomainsResponse extends StObject {
  
  /**
    * A list of domains that the calling user manages in Google Domains.
    */
  var domains: js.UndefOr[js.Array[SchemaDomain]] = js.undefined
  
  /**
    * When present, there are more results to retrieve. Set `page_token` to this value on a subsequent call to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaRetrieveImportableDomainsResponse {
  
  inline def apply(): SchemaRetrieveImportableDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetrieveImportableDomainsResponse]
  }
  
  extension [Self <: SchemaRetrieveImportableDomainsResponse](x: Self) {
    
    inline def setDomains(value: js.Array[SchemaDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: SchemaDomain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
