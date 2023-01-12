package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteContentReport extends StObject {
  
  /** The time at which the report is generated. Always populated when it is in a response. */
  var reportCreateTimestamp: js.UndefOr[String] = js.undefined
  
  /** Additional user-provided justification on the report. Optional. */
  var reportJustification: js.UndefOr[AppsDynamiteContentReportJustification] = js.undefined
  
  /** Type of the report. Always populated when it is in a response. */
  var reportType: js.UndefOr[AppsDynamiteSharedContentReportType] = js.undefined
  
  /** User ID of the reporter. Always populated when it is in a response. */
  var reporterUserId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** Create timestamp of the revisions of the message when it's reported. Always populated when it is in a response. */
  var revisionCreateTimestamp: js.UndefOr[String] = js.undefined
}
object AppsDynamiteContentReport {
  
  inline def apply(): AppsDynamiteContentReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteContentReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteContentReport] (val x: Self) extends AnyVal {
    
    inline def setReportCreateTimestamp(value: String): Self = StObject.set(x, "reportCreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReportCreateTimestampUndefined: Self = StObject.set(x, "reportCreateTimestamp", js.undefined)
    
    inline def setReportJustification(value: AppsDynamiteContentReportJustification): Self = StObject.set(x, "reportJustification", value.asInstanceOf[js.Any])
    
    inline def setReportJustificationUndefined: Self = StObject.set(x, "reportJustification", js.undefined)
    
    inline def setReportType(value: AppsDynamiteSharedContentReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
    
    inline def setReporterUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "reporterUserId", value.asInstanceOf[js.Any])
    
    inline def setReporterUserIdUndefined: Self = StObject.set(x, "reporterUserId", js.undefined)
    
    inline def setRevisionCreateTimestamp(value: String): Self = StObject.set(x, "revisionCreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimestampUndefined: Self = StObject.set(x, "revisionCreateTimestamp", js.undefined)
  }
}
