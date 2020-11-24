package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracking parameters supported by Dynamic Link.
  */
@js.native
trait SchemaAnalyticsInfo extends js.Object {
  
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[SchemaGooglePlayAnalytics] = js.native
  
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[SchemaITunesConnectAnalytics] = js.native
}
object SchemaAnalyticsInfo {
  
  @scala.inline
  def apply(): SchemaAnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsInfo]
  }
  
  @scala.inline
  implicit class SchemaAnalyticsInfoOps[Self <: SchemaAnalyticsInfo] (val x: Self) extends AnyVal {
    
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
    def setGooglePlayAnalytics(value: SchemaGooglePlayAnalytics): Self = this.set("googlePlayAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePlayAnalytics: Self = this.set("googlePlayAnalytics", js.undefined)
    
    @scala.inline
    def setItunesConnectAnalytics(value: SchemaITunesConnectAnalytics): Self = this.set("itunesConnectAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItunesConnectAnalytics: Self = this.set("itunesConnectAnalytics", js.undefined)
  }
}
