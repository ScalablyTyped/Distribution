package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVideocategoriesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The hl parameter specifies the language that should be used for text
    * values in the API response.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of video category IDs
    * for the resources that you are retrieving.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies the videoCategory resource properties that
    * the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * The regionCode parameter instructs the API to return the list of video
    * categories available in the specified country. The parameter value is an
    * ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
}
object ParamsResourceVideocategoriesList {
  
  @scala.inline
  def apply(): ParamsResourceVideocategoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideocategoriesList]
  }
  
  @scala.inline
  implicit class ParamsResourceVideocategoriesListOps[Self <: ParamsResourceVideocategoriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
}
