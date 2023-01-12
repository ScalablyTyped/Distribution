package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItunesOptions extends StObject {
  
  var appleWidgetKey: js.UndefOr[String] = js.undefined
  
  var baseURL: js.UndefOr[String] = js.undefined
  
  var concurrentRequests: js.UndefOr[Double] = js.undefined
  
  def errorCallback(error: Any): Unit
  
  var loginURL: js.UndefOr[String] = js.undefined
  
  var settingsURL: js.UndefOr[String] = js.undefined
  
  def successCallback(cookies: String): Unit
}
object ItunesOptions {
  
  inline def apply(errorCallback: Any => Unit, successCallback: String => Unit): ItunesOptions = {
    val __obj = js.Dynamic.literal(errorCallback = js.Any.fromFunction1(errorCallback), successCallback = js.Any.fromFunction1(successCallback))
    __obj.asInstanceOf[ItunesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItunesOptions] (val x: Self) extends AnyVal {
    
    inline def setAppleWidgetKey(value: String): Self = StObject.set(x, "appleWidgetKey", value.asInstanceOf[js.Any])
    
    inline def setAppleWidgetKeyUndefined: Self = StObject.set(x, "appleWidgetKey", js.undefined)
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setConcurrentRequests(value: Double): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setConcurrentRequestsUndefined: Self = StObject.set(x, "concurrentRequests", js.undefined)
    
    inline def setErrorCallback(value: Any => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
    
    inline def setLoginURL(value: String): Self = StObject.set(x, "loginURL", value.asInstanceOf[js.Any])
    
    inline def setLoginURLUndefined: Self = StObject.set(x, "loginURL", js.undefined)
    
    inline def setSettingsURL(value: String): Self = StObject.set(x, "settingsURL", value.asInstanceOf[js.Any])
    
    inline def setSettingsURLUndefined: Self = StObject.set(x, "settingsURL", js.undefined)
    
    inline def setSuccessCallback(value: String => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
  }
}
