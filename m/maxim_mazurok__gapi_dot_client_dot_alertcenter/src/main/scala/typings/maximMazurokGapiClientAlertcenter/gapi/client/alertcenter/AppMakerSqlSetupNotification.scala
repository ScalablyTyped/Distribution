package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMakerSqlSetupNotification extends StObject {
  
  /** List of applications with requests for default SQL set up. */
  var requestInfo: js.UndefOr[js.Array[RequestInfo]] = js.undefined
}
object AppMakerSqlSetupNotification {
  
  inline def apply(): AppMakerSqlSetupNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMakerSqlSetupNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppMakerSqlSetupNotification] (val x: Self) extends AnyVal {
    
    inline def setRequestInfo(value: js.Array[RequestInfo]): Self = StObject.set(x, "requestInfo", value.asInstanceOf[js.Any])
    
    inline def setRequestInfoUndefined: Self = StObject.set(x, "requestInfo", js.undefined)
    
    inline def setRequestInfoVarargs(value: RequestInfo*): Self = StObject.set(x, "requestInfo", js.Array(value*))
  }
}
