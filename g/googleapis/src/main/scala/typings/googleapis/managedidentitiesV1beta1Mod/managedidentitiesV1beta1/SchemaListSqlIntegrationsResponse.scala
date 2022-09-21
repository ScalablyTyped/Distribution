package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSqlIntegrationsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of SqlIntegrations of a domain.
    */
  var sqlIntegrations: js.UndefOr[js.Array[SchemaSqlIntegration]] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListSqlIntegrationsResponse {
  
  inline def apply(): SchemaListSqlIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSqlIntegrationsResponse]
  }
  
  extension [Self <: SchemaListSqlIntegrationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSqlIntegrations(value: js.Array[SchemaSqlIntegration]): Self = StObject.set(x, "sqlIntegrations", value.asInstanceOf[js.Any])
    
    inline def setSqlIntegrationsUndefined: Self = StObject.set(x, "sqlIntegrations", js.undefined)
    
    inline def setSqlIntegrationsVarargs(value: SchemaSqlIntegration*): Self = StObject.set(x, "sqlIntegrations", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
