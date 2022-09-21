package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Filter assets based on the specified category. Supported values are: `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`, `scenes`, `technology`, and `transport`.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Return only assets that have been curated by the Poly team.
    */
  var curated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * One or more search terms to be matched against all text that Poly has indexed for assets, which includes display_name, description, and tags. Multiple keywords should be separated by spaces.
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    * Returns assets that are of the specified complexity or less. Defaults to COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE assets.
    */
  var maxComplexity: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a combination of popularity and other features.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssetsList {
  
  inline def apply(): ParamsResourceAssetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetsList]
  }
  
  extension [Self <: ParamsResourceAssetsList](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCurated(value: Boolean): Self = StObject.set(x, "curated", value.asInstanceOf[js.Any])
    
    inline def setCuratedUndefined: Self = StObject.set(x, "curated", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setMaxComplexity(value: String): Self = StObject.set(x, "maxComplexity", value.asInstanceOf[js.Any])
    
    inline def setMaxComplexityUndefined: Self = StObject.set(x, "maxComplexity", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
