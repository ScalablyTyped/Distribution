package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageContentReportSummary extends StObject {
  
  /** Total number of reports attached to this (revision of) message. */
  var numberReports: js.UndefOr[Double] = js.undefined
  
  /** Totoal number of reports attached to all revisions of this message (i.e. since creation). Set only when the request asks for it. */
  var numberReportsAllRevisions: js.UndefOr[Double] = js.undefined
}
object AppsDynamiteMessageContentReportSummary {
  
  inline def apply(): AppsDynamiteMessageContentReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageContentReportSummary]
  }
  
  extension [Self <: AppsDynamiteMessageContentReportSummary](x: Self) {
    
    inline def setNumberReports(value: Double): Self = StObject.set(x, "numberReports", value.asInstanceOf[js.Any])
    
    inline def setNumberReportsAllRevisions(value: Double): Self = StObject.set(x, "numberReportsAllRevisions", value.asInstanceOf[js.Any])
    
    inline def setNumberReportsAllRevisionsUndefined: Self = StObject.set(x, "numberReportsAllRevisions", js.undefined)
    
    inline def setNumberReportsUndefined: Self = StObject.set(x, "numberReports", js.undefined)
  }
}
