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
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDomainsResponse {
  
  @scala.inline
  def apply(): SchemaListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDomainsResponseMutableBuilder[Self <: SchemaListDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: js.Array[SchemaDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: SchemaDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
