package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo extends StObject {
  
  /**
    * Bool describing whether query expansion has occurred.
    */
  var expandedQuery: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Number of pinned results. This field will only be set when expansion happens and SearchRequest.QueryExpansionSpec.pin_unexpanded_results is set to true.
    */
  var pinnedResultCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchResponseQueryExpansionInfo](x: Self) {
    
    inline def setExpandedQuery(value: Boolean): Self = StObject.set(x, "expandedQuery", value.asInstanceOf[js.Any])
    
    inline def setExpandedQueryNull: Self = StObject.set(x, "expandedQuery", null)
    
    inline def setExpandedQueryUndefined: Self = StObject.set(x, "expandedQuery", js.undefined)
    
    inline def setPinnedResultCount(value: String): Self = StObject.set(x, "pinnedResultCount", value.asInstanceOf[js.Any])
    
    inline def setPinnedResultCountNull: Self = StObject.set(x, "pinnedResultCount", null)
    
    inline def setPinnedResultCountUndefined: Self = StObject.set(x, "pinnedResultCount", js.undefined)
  }
}
