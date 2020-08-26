package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ParamsResourceCitiesListOps[Self <: ParamsResourceCitiesList] (val x: Self) extends AnyVal {
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
    def setCountryDartIdsVarargs(value: String*): Self = this.set("countryDartIds", js.Array(value :_*))
    @scala.inline
    def setCountryDartIds(value: js.Array[String]): Self = this.set("countryDartIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryDartIds: Self = this.set("countryDartIds", js.undefined)
    @scala.inline
    def setDartIdsVarargs(value: String*): Self = this.set("dartIds", js.Array(value :_*))
    @scala.inline
    def setDartIds(value: js.Array[String]): Self = this.set("dartIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDartIds: Self = this.set("dartIds", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setRegionDartIdsVarargs(value: String*): Self = this.set("regionDartIds", js.Array(value :_*))
    @scala.inline
    def setRegionDartIds(value: js.Array[String]): Self = this.set("regionDartIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionDartIds: Self = this.set("regionDartIds", js.undefined)
  }
  
}

