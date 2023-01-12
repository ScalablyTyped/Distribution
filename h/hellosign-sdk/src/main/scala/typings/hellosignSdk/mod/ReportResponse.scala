package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportResponse
  extends StObject
     with BaseResponse {
  
  var report: Report
}
object ReportResponse {
  
  inline def apply(report: Report, resHeaders: IncomingHttpHeaders): ReportResponse = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportResponse] (val x: Self) extends AnyVal {
    
    inline def setReport(value: Report): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
