package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Restricts the attributes returned to those matching a filter. The only field available for filtering is `category`. For example, `filter=category=\"REQUEST\"`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Limit on the number of Attribute definitions to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Token to retrieve the next page of results or empty to get the first page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the consent store to retrieve Attribute definitions from.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
