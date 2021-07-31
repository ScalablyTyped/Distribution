package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonCriteriaModeInfo extends StObject {
  
  /** Whether Common Criteria Mode is enabled. */
  var commonCriteriaModeStatus: js.UndefOr[String] = js.undefined
}
object CommonCriteriaModeInfo {
  
  @scala.inline
  def apply(): CommonCriteriaModeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCriteriaModeInfo]
  }
  
  @scala.inline
  implicit class CommonCriteriaModeInfoMutableBuilder[Self <: CommonCriteriaModeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonCriteriaModeStatus(value: String): Self = StObject.set(x, "commonCriteriaModeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCriteriaModeStatusUndefined: Self = StObject.set(x, "commonCriteriaModeStatus", js.undefined)
  }
}
