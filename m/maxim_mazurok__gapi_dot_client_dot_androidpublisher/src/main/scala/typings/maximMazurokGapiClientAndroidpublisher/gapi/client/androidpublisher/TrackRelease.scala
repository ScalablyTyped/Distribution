package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackRelease extends js.Object {
  
  /** Restricts a release to a specific set of countries. */
  var countryTargeting: js.UndefOr[CountryTargeting] = js.native
  
  /**
    * In-app update priority of the release. All newly added APKs in the release will be considered at this priority. Can take values in the range [0, 5], with 5 the highest priority.
    * Defaults to 0. in_app_update_priority can not be updated once the release is rolled out. See https://developer.android.com/guide/playcore/in-app-updates.
    */
  var inAppUpdatePriority: js.UndefOr[Double] = js.native
  
  /**
    * The release name. Not required to be unique. If not set, the name is generated from the APK's version_name. If the release contains multiple APKs, the name is generated from the
    * date.
    */
  var name: js.UndefOr[String] = js.native
  
  /** A description of what is new in this release. */
  var releaseNotes: js.UndefOr[js.Array[LocalizedText]] = js.native
  
  /** The status of the release. */
  var status: js.UndefOr[String] = js.native
  
  /** Fraction of users who are eligible for a staged release. 0 < fraction < 1. Can only be set when status is "inProgress" or "halted". */
  var userFraction: js.UndefOr[Double] = js.native
  
  /** Version codes of all APKs in the release. Must include version codes to retain from previous releases. */
  var versionCodes: js.UndefOr[js.Array[String]] = js.native
}
object TrackRelease {
  
  @scala.inline
  def apply(): TrackRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackRelease]
  }
  
  @scala.inline
  implicit class TrackReleaseOps[Self <: TrackRelease] (val x: Self) extends AnyVal {
    
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
    def setCountryTargeting(value: CountryTargeting): Self = this.set("countryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryTargeting: Self = this.set("countryTargeting", js.undefined)
    
    @scala.inline
    def setInAppUpdatePriority(value: Double): Self = this.set("inAppUpdatePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppUpdatePriority: Self = this.set("inAppUpdatePriority", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReleaseNotesVarargs(value: LocalizedText*): Self = this.set("releaseNotes", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotes(value: js.Array[LocalizedText]): Self = this.set("releaseNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseNotes: Self = this.set("releaseNotes", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserFraction(value: Double): Self = this.set("userFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserFraction: Self = this.set("userFraction", js.undefined)
    
    @scala.inline
    def setVersionCodesVarargs(value: String*): Self = this.set("versionCodes", js.Array(value :_*))
    
    @scala.inline
    def setVersionCodes(value: js.Array[String]): Self = this.set("versionCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCodes: Self = this.set("versionCodes", js.undefined)
  }
}
