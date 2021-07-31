package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItunesOptions extends StObject {
  
  var appleWidgetKey: js.UndefOr[String] = js.undefined
  
  var baseURL: js.UndefOr[String] = js.undefined
  
  var concurrentRequests: js.UndefOr[Double] = js.undefined
  
  def errorCallback(error: js.Any): Unit
  
  var loginURL: js.UndefOr[String] = js.undefined
  
  var settingsURL: js.UndefOr[String] = js.undefined
  
  def successCallback(cookies: String): Unit
}
object ItunesOptions {
  
  @scala.inline
  def apply(errorCallback: js.Any => Unit, successCallback: String => Unit): ItunesOptions = {
    val __obj = js.Dynamic.literal(errorCallback = js.Any.fromFunction1(errorCallback), successCallback = js.Any.fromFunction1(successCallback))
    __obj.asInstanceOf[ItunesOptions]
  }
  
  @scala.inline
  implicit class ItunesOptionsMutableBuilder[Self <: ItunesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppleWidgetKey(value: String): Self = StObject.set(x, "appleWidgetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleWidgetKeyUndefined: Self = StObject.set(x, "appleWidgetKey", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    @scala.inline
    def setConcurrentRequests(value: Double): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentRequestsUndefined: Self = StObject.set(x, "concurrentRequests", js.undefined)
    
    @scala.inline
    def setErrorCallback(value: js.Any => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoginURL(value: String): Self = StObject.set(x, "loginURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginURLUndefined: Self = StObject.set(x, "loginURL", js.undefined)
    
    @scala.inline
    def setSettingsURL(value: String): Self = StObject.set(x, "settingsURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsURLUndefined: Self = StObject.set(x, "settingsURL", js.undefined)
    
    @scala.inline
    def setSuccessCallback(value: String => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
  }
}
