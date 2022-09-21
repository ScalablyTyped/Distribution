package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackageIssue extends StObject {
  
  /**
    * Required. The location of the vulnerability.
    */
  var affectedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.undefined
  
  /**
    * Output only. The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
    */
  var effectiveSeverity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the available fix for vulnerability.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.undefined
  
  /**
    * The type of package (e.g. OS, MAVEN, GO).
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated, use Details.effective_severity instead The severity (e.g., distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackageIssue {
  
  inline def apply(): SchemaPackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageIssue]
  }
  
  extension [Self <: SchemaPackageIssue](x: Self) {
    
    inline def setAffectedLocation(value: SchemaVulnerabilityLocation): Self = StObject.set(x, "affectedLocation", value.asInstanceOf[js.Any])
    
    inline def setAffectedLocationUndefined: Self = StObject.set(x, "affectedLocation", js.undefined)
    
    inline def setEffectiveSeverity(value: String): Self = StObject.set(x, "effectiveSeverity", value.asInstanceOf[js.Any])
    
    inline def setEffectiveSeverityNull: Self = StObject.set(x, "effectiveSeverity", null)
    
    inline def setEffectiveSeverityUndefined: Self = StObject.set(x, "effectiveSeverity", js.undefined)
    
    inline def setFixedLocation(value: SchemaVulnerabilityLocation): Self = StObject.set(x, "fixedLocation", value.asInstanceOf[js.Any])
    
    inline def setFixedLocationUndefined: Self = StObject.set(x, "fixedLocation", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    inline def setSeverityNameNull: Self = StObject.set(x, "severityName", null)
    
    inline def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
  }
}
