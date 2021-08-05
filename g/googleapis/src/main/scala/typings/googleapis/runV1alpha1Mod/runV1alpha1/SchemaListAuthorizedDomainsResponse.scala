package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Authorized Domains.
  */
trait SchemaListAuthorizedDomainsResponse extends StObject {
  
  /**
    * The authorized domains belonging to the user.
    */
  var domains: js.UndefOr[js.Array[SchemaAuthorizedDomain]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAuthorizedDomainsResponse {
  
  inline def apply(): SchemaListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedDomainsResponse]
  }
  
  extension [Self <: SchemaListAuthorizedDomainsResponse](x: Self) {
    
    inline def setDomains(value: js.Array[SchemaAuthorizedDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: SchemaAuthorizedDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
