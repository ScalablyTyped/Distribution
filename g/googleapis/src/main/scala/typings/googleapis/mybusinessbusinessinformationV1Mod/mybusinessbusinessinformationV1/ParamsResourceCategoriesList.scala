package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCategoriesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Filter string from user. The only field that supported is `displayName`. Eg: `filter=displayName=foo`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The BCP 47 code of language.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. How many categories to fetch per page. Default is 100, minimum is 1, and maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If specified, the next page of categories will be fetched.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Specifies which parts to the Category resource should be returned in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceCategoriesList {
  
  inline def apply(): ParamsResourceCategoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCategoriesList]
  }
  
  extension [Self <: ParamsResourceCategoriesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
