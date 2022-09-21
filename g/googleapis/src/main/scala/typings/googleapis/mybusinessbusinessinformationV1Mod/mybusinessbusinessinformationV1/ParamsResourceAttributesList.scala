package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAttributesList
  extends StObject
     with StandardParameters {
  
  /**
    * The primary category stable ID to find available attributes. Must be of the format categories/{category_id\}.
    */
  var categoryName: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP 47 code of language to get attribute display names in. If this language is not available, they will be provided in English.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * How many attributes to include per page. Default is 200, minimum is 1.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, the next page of attribute metadata is retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the location to look up available attributes. If this field is set, category_name, region_code, language_code and show_all are not required and must not be set.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The ISO 3166-1 alpha-2 country code to find available attributes.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata for all available attributes are returned when this field is set to true, disregarding parent and category_name fields. language_code and region_code are required when show_all is set to true.
    */
  var showAll: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceAttributesList {
  
  inline def apply(): ParamsResourceAttributesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAttributesList]
  }
  
  extension [Self <: ParamsResourceAttributesList](x: Self) {
    
    inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setCategoryNameUndefined: Self = StObject.set(x, "categoryName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setShowAll(value: Boolean): Self = StObject.set(x, "showAll", value.asInstanceOf[js.Any])
    
    inline def setShowAllUndefined: Self = StObject.set(x, "showAll", js.undefined)
  }
}
