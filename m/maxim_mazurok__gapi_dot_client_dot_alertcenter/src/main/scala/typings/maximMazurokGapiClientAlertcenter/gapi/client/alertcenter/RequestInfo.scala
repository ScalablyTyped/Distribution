package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInfo extends StObject {
  
  /** List of app developers who triggered notifications for above application. */
  var appDeveloperEmail: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The application that requires the SQL setup. */
  var appKey: js.UndefOr[String] = js.native
  
  /** Required. Number of requests sent for this application to set up default SQL instance. */
  var numberOfRequests: js.UndefOr[String] = js.native
}
object RequestInfo {
  
  @scala.inline
  def apply(): RequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInfo]
  }
  
  @scala.inline
  implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppDeveloperEmail(value: js.Array[String]): Self = StObject.set(x, "appDeveloperEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDeveloperEmailUndefined: Self = StObject.set(x, "appDeveloperEmail", js.undefined)
    
    @scala.inline
    def setAppDeveloperEmailVarargs(value: String*): Self = StObject.set(x, "appDeveloperEmail", js.Array(value :_*))
    
    @scala.inline
    def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
    
    @scala.inline
    def setNumberOfRequests(value: String): Self = StObject.set(x, "numberOfRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRequestsUndefined: Self = StObject.set(x, "numberOfRequests", js.undefined)
  }
}
