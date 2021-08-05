package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message wraps a location affected by a vulnerability and its
  * associated fix (if one is available).
  */
trait SchemaPackageIssue extends StObject {
  
  /**
    * The location of the vulnerability.
    */
  var affectedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.undefined
  
  /**
    * The location of the available fix for vulnerability.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.undefined
  
  var severityName: js.UndefOr[String] = js.undefined
}
object SchemaPackageIssue {
  
  inline def apply(): SchemaPackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageIssue]
  }
  
  extension [Self <: SchemaPackageIssue](x: Self) {
    
    inline def setAffectedLocation(value: SchemaVulnerabilityLocation): Self = StObject.set(x, "affectedLocation", value.asInstanceOf[js.Any])
    
    inline def setAffectedLocationUndefined: Self = StObject.set(x, "affectedLocation", js.undefined)
    
    inline def setFixedLocation(value: SchemaVulnerabilityLocation): Self = StObject.set(x, "fixedLocation", value.asInstanceOf[js.Any])
    
    inline def setFixedLocationUndefined: Self = StObject.set(x, "fixedLocation", js.undefined)
    
    inline def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    inline def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
  }
}
