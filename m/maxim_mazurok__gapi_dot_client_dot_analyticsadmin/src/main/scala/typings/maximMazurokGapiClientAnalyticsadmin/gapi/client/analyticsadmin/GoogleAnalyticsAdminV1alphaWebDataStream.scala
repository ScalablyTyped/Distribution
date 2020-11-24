package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaWebDataStream extends js.Object {
  
  /** Output only. Time when this stream was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Immutable. Domain name of the web app being measured, or empty. Example: "http://www.google.com", "https://www.google.com" */
  var defaultUri: js.UndefOr[String] = js.native
  
  /** Required. Human-readable display name for the Data Stream. The max allowed display name length is 100 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.native
  
  /** Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would just be "1A2BCD345E" */
  var measurementId: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this Data Stream. Format: properties/{property_id}/webDataStreams/{stream_id} Example: "properties/1000/webDataStreams/2000" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when stream payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaWebDataStream {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaWebDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaWebDataStream]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaWebDataStreamOps[Self <: GoogleAnalyticsAdminV1alphaWebDataStream] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDefaultUri(value: String): Self = this.set("defaultUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUri: Self = this.set("defaultUri", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFirebaseAppId(value: String): Self = this.set("firebaseAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirebaseAppId: Self = this.set("firebaseAppId", js.undefined)
    
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementId: Self = this.set("measurementId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
