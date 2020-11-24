package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItunesOptions extends js.Object {
  
  var appleWidgetKey: js.UndefOr[String] = js.native
  
  var baseURL: js.UndefOr[String] = js.native
  
  var concurrentRequests: js.UndefOr[Double] = js.native
  
  def errorCallback(error: js.Any): Unit = js.native
  
  var loginURL: js.UndefOr[String] = js.native
  
  var settingsURL: js.UndefOr[String] = js.native
  
  def successCallback(cookies: String): Unit = js.native
}
object ItunesOptions {
  
  @scala.inline
  def apply(errorCallback: js.Any => Unit, successCallback: String => Unit): ItunesOptions = {
    val __obj = js.Dynamic.literal(errorCallback = js.Any.fromFunction1(errorCallback), successCallback = js.Any.fromFunction1(successCallback))
    __obj.asInstanceOf[ItunesOptions]
  }
  
  @scala.inline
  implicit class ItunesOptionsOps[Self <: ItunesOptions] (val x: Self) extends AnyVal {
    
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
    def setErrorCallback(value: js.Any => Unit): Self = this.set("errorCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessCallback(value: String => Unit): Self = this.set("successCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppleWidgetKey(value: String): Self = this.set("appleWidgetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppleWidgetKey: Self = this.set("appleWidgetKey", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setConcurrentRequests(value: Double): Self = this.set("concurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentRequests: Self = this.set("concurrentRequests", js.undefined)
    
    @scala.inline
    def setLoginURL(value: String): Self = this.set("loginURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginURL: Self = this.set("loginURL", js.undefined)
    
    @scala.inline
    def setSettingsURL(value: String): Self = this.set("settingsURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsURL: Self = this.set("settingsURL", js.undefined)
  }
}
