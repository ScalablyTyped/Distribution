package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackRelease extends StObject {
  
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
  implicit class TrackReleaseMutableBuilder[Self <: TrackRelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryTargeting(value: CountryTargeting): Self = StObject.set(x, "countryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryTargetingUndefined: Self = StObject.set(x, "countryTargeting", js.undefined)
    
    @scala.inline
    def setInAppUpdatePriority(value: Double): Self = StObject.set(x, "inAppUpdatePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppUpdatePriorityUndefined: Self = StObject.set(x, "inAppUpdatePriority", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReleaseNotes(value: js.Array[LocalizedText]): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    @scala.inline
    def setReleaseNotesVarargs(value: LocalizedText*): Self = StObject.set(x, "releaseNotes", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserFraction(value: Double): Self = StObject.set(x, "userFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFractionUndefined: Self = StObject.set(x, "userFraction", js.undefined)
    
    @scala.inline
    def setVersionCodes(value: js.Array[String]): Self = StObject.set(x, "versionCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodesUndefined: Self = StObject.set(x, "versionCodes", js.undefined)
    
    @scala.inline
    def setVersionCodesVarargs(value: String*): Self = StObject.set(x, "versionCodes", js.Array(value :_*))
  }
}
