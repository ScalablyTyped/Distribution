package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The ID of the app. Android's Play store app uses bundle ID, for example `com.google.android.gm`. Apple's App store app ID uses 9 digit string, for example `422689480`. */
  var appId: js.UndefOr[String] = js.undefined
  
  /** Output only. The display name of the app. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.undefined
}
object AppAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): AppAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AppAssignedTargetingOptionDetailsMutableBuilder[Self <: AppAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
