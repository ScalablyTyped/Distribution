package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCitiesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only cities from these countries.
    */
  var countryDartIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only cities with these DART IDs.
    */
  var dartIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only cities with names starting with this prefix.
    */
  var namePrefix: js.UndefOr[String] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Select only cities from these regions.
    */
  var regionDartIds: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceCitiesList {
  
  @scala.inline
  def apply(): ParamsResourceCitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCitiesList]
  }
  
  @scala.inline
  implicit class ParamsResourceCitiesListMutableBuilder[Self <: ParamsResourceCitiesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountryDartIds(value: js.Array[String]): Self = StObject.set(x, "countryDartIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryDartIdsUndefined: Self = StObject.set(x, "countryDartIds", js.undefined)
    
    @scala.inline
    def setCountryDartIdsVarargs(value: String*): Self = StObject.set(x, "countryDartIds", js.Array(value :_*))
    
    @scala.inline
    def setDartIds(value: js.Array[String]): Self = StObject.set(x, "dartIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDartIdsUndefined: Self = StObject.set(x, "dartIds", js.undefined)
    
    @scala.inline
    def setDartIdsVarargs(value: String*): Self = StObject.set(x, "dartIds", js.Array(value :_*))
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setRegionDartIds(value: js.Array[String]): Self = StObject.set(x, "regionDartIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionDartIdsUndefined: Self = StObject.set(x, "regionDartIds", js.undefined)
    
    @scala.inline
    def setRegionDartIdsVarargs(value: String*): Self = StObject.set(x, "regionDartIds", js.Array(value :_*))
  }
}
