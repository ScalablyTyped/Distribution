package typings.googleapis.polyV1Mod.polyV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Filter assets based on the specified category. Supported values are:
    * `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`,
    * `scenes`, `technology`, and `transport`.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Return only assets that have been curated by the Poly team.
    */
  var curated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return only assets with the matching format. Acceptable values are:
    * `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * One or more search terms to be matched against all text that Poly has
    * indexed for assets, which includes display_name, description, and tags.
    * Multiple keywords should be separated by spaces.
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    * Returns assets that are of the specified complexity or less. Defaults to
    * COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE
    * assets.
    */
  var maxComplexity: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`,
    * `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a
    * combination of popularity and other features.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of assets to be returned. This value must be between
    * `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a continuation token from a previous search whose results were
    * split into multiple pages. To get the next page, submit the same request
    * specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssetsList {
  
  @scala.inline
  def apply(): ParamsResourceAssetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAssetsListMutableBuilder[Self <: ParamsResourceAssetsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCurated(value: Boolean): Self = StObject.set(x, "curated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCuratedUndefined: Self = StObject.set(x, "curated", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setMaxComplexity(value: String): Self = StObject.set(x, "maxComplexity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComplexityUndefined: Self = StObject.set(x, "maxComplexity", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
