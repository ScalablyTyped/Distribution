package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonCriteriaModeInfo extends StObject {
  
  /** Whether Common Criteria Mode is enabled. */
  var commonCriteriaModeStatus: js.UndefOr[String] = js.undefined
}
object CommonCriteriaModeInfo {
  
  inline def apply(): CommonCriteriaModeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCriteriaModeInfo]
  }
  
  extension [Self <: CommonCriteriaModeInfo](x: Self) {
    
    inline def setCommonCriteriaModeStatus(value: String): Self = StObject.set(x, "commonCriteriaModeStatus", value.asInstanceOf[js.Any])
    
    inline def setCommonCriteriaModeStatusUndefined: Self = StObject.set(x, "commonCriteriaModeStatus", js.undefined)
  }
}
