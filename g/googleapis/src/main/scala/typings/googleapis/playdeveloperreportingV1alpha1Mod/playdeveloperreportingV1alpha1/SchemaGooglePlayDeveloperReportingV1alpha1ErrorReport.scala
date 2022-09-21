package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport extends StObject {
  
  /**
    * The issue this report was associated with. **Please note:** this resource is currently in Alpha. There could be changes to the issue grouping that would result in similar but more recent error reports being assigned to a different issue.
    */
  var issue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the report. Format: apps/{app\}/errorReports/{report\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Textual representation of the error report. These textual reports are produced by the platform. The reports are then sanitized and filtered to remove any potentially sensitive information. Although their format is fairly stable, they are not entirely meant for machine consumption and we cannot guarantee that there won't be subtle changes to the formatting that may break systems trying to parse information out of the reports.
    */
  var reportText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the error for which this report was generated.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport](x: Self) {
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueNull: Self = StObject.set(x, "issue", null)
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportText(value: String): Self = StObject.set(x, "reportText", value.asInstanceOf[js.Any])
    
    inline def setReportTextNull: Self = StObject.set(x, "reportText", null)
    
    inline def setReportTextUndefined: Self = StObject.set(x, "reportText", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
