package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaIosAppDataStream extends StObject {
  
  /** Required. Immutable. The Apple App Store Bundle ID for the app Example: "com.example.myiosapp" */
  var bundleId: js.UndefOr[String] = js.native
  
  /** Output only. Time when this stream was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Human-readable display name for the Data Stream. The max allowed display name length is 255 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. ID of the corresponding iOS app in Firebase, if any. This ID can change if the iOS app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this Data Stream. Format: properties/{property_id}/iosAppDataStreams/{stream_id} Example: "properties/1000/iosAppDataStreams/2000" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when stream payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaIosAppDataStream {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaIosAppDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaIosAppDataStream]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaIosAppDataStreamMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaIosAppDataStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
