package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageIssue extends StObject {
  
  /** Required. The location of the vulnerability. */
  var affectedLocation: js.UndefOr[VulnerabilityLocation] = js.undefined
  
  /** The location of the available fix for vulnerability. */
  var fixedLocation: js.UndefOr[VulnerabilityLocation] = js.undefined
  
  /** Deprecated, use Details.effective_severity instead The severity (e.g., distro assigned severity) for this vulnerability. */
  var severityName: js.UndefOr[String] = js.undefined
}
object PackageIssue {
  
  inline def apply(): PackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageIssue]
  }
  
  extension [Self <: PackageIssue](x: Self) {
    
    inline def setAffectedLocation(value: VulnerabilityLocation): Self = StObject.set(x, "affectedLocation", value.asInstanceOf[js.Any])
    
    inline def setAffectedLocationUndefined: Self = StObject.set(x, "affectedLocation", js.undefined)
    
    inline def setFixedLocation(value: VulnerabilityLocation): Self = StObject.set(x, "fixedLocation", value.asInstanceOf[js.Any])
    
    inline def setFixedLocationUndefined: Self = StObject.set(x, "fixedLocation", js.undefined)
    
    inline def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    inline def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
  }
}
