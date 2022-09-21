package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlaceactiontypemetadataList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A filter constraining the place action types to return metadata for. The response includes entries that match the filter. We support only the following filters: 1. location=XYZ where XYZ is a string indicating the resource name of a location, in the format `locations/{location_id\}`. 2. region_code=XYZ where XYZ is a Unicode CLDR region code to find available action types. If no filter is provided, all place action types are returned.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The IETF BCP-47 code of language to get display names in. If this language is not available, they will be provided in English.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. How many action types to include per page. Default is 10, minimum is 1.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If specified, the next page of place action type metadata is retrieved. The `pageToken` is returned when a call to `placeActionTypeMetadata.list` returns more results than can fit into the requested page size.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlaceactiontypemetadataList {
  
  inline def apply(): ParamsResourcePlaceactiontypemetadataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlaceactiontypemetadataList]
  }
  
  extension [Self <: ParamsResourcePlaceactiontypemetadataList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
