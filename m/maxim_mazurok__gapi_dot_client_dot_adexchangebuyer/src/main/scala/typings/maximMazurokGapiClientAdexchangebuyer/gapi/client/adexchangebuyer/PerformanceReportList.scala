package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceReportList extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** A list of performance reports relevant for the account. */
  var performanceReport: js.UndefOr[js.Array[PerformanceReport]] = js.native
}
object PerformanceReportList {
  
  @scala.inline
  def apply(): PerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceReportList]
  }
  
  @scala.inline
  implicit class PerformanceReportListMutableBuilder[Self <: PerformanceReportList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPerformanceReport(value: js.Array[PerformanceReport]): Self = StObject.set(x, "performanceReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceReportUndefined: Self = StObject.set(x, "performanceReport", js.undefined)
    
    @scala.inline
    def setPerformanceReportVarargs(value: PerformanceReport*): Self = StObject.set(x, "performanceReport", js.Array(value :_*))
  }
}
