package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for DomainMappings.ListDomainMappings.
  */
@js.native
trait SchemaListDomainMappingsResponse extends StObject {
  
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListDomainMappingsResponse {
  
  @scala.inline
  def apply(): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDomainMappingsResponseMutableBuilder[Self <: SchemaListDomainMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainMappings(value: js.Array[SchemaDomainMapping]): Self = StObject.set(x, "domainMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMappingsUndefined: Self = StObject.set(x, "domainMappings", js.undefined)
    
    @scala.inline
    def setDomainMappingsVarargs(value: SchemaDomainMapping*): Self = StObject.set(x, "domainMappings", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
