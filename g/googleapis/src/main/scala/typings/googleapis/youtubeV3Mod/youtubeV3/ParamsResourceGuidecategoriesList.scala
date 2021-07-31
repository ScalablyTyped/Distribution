package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGuidecategoriesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The hl parameter specifies the language that will be used for text values
    * in the API response.
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel
    * category ID(s) for the resource(s) that are being retrieved. In a
    * guideCategory resource, the id property specifies the YouTube channel
    * category ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter specifies the guideCategory resource properties that
    * the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * The regionCode parameter instructs the API to return the list of guide
    * categories available in the specified country. The parameter value is an
    * ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceGuidecategoriesList {
  
  @scala.inline
  def apply(): ParamsResourceGuidecategoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGuidecategoriesList]
  }
  
  @scala.inline
  implicit class ParamsResourceGuidecategoriesListMutableBuilder[Self <: ParamsResourceGuidecategoriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
