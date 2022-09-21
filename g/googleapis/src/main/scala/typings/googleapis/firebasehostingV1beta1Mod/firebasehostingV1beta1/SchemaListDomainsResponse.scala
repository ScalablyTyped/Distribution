package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDomainsResponse extends StObject {
  
  /**
    * The list of domains, if any exist.
    */
  var domains: js.UndefOr[js.Array[SchemaDomain]] = js.undefined
  
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDomainsResponse {
  
  inline def apply(): SchemaListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainsResponse]
  }
  
  extension [Self <: SchemaListDomainsResponse](x: Self) {
    
    inline def setDomains(value: js.Array[SchemaDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: SchemaDomain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
