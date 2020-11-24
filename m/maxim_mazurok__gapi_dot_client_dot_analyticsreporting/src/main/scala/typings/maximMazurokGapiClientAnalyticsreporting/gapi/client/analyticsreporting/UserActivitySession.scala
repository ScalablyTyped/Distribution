package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserActivitySession extends js.Object {
  
  /** Represents a detailed view into each of the activity in this session. */
  var activities: js.UndefOr[js.Array[Activity]] = js.native
  
  /**
    * The data source of a hit. By default, hits sent from analytics.js are reported as "web" and hits sent from the mobile SDKs are reported as "app". These values can be overridden in
    * the Measurement Protocol.
    */
  var dataSource: js.UndefOr[String] = js.native
  
  /** The type of device used: "mobile", "tablet" etc. */
  var deviceCategory: js.UndefOr[String] = js.native
  
  /** Platform on which the activity happened: "android", "ios" etc. */
  var platform: js.UndefOr[String] = js.native
  
  /** Date of this session in ISO-8601 format. */
  var sessionDate: js.UndefOr[String] = js.native
  
  /** Unique ID of the session. */
  var sessionId: js.UndefOr[String] = js.native
}
object UserActivitySession {
  
  @scala.inline
  def apply(): UserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivitySession]
  }
  
  @scala.inline
  implicit class UserActivitySessionOps[Self <: UserActivitySession] (val x: Self) extends AnyVal {
    
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: js.Array[Activity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setDataSource(value: String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDeviceCategory(value: String): Self = this.set("deviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCategory: Self = this.set("deviceCategory", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setSessionDate(value: String): Self = this.set("sessionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDate: Self = this.set("sessionDate", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
  }
}
