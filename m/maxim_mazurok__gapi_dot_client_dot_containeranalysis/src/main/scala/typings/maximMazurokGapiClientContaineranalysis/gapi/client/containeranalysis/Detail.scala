package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  /** Required. The name of the package where the vulnerability was found. */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /** Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /** A vendor-specific description of this note. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The fix for this specific package version. */
  var fixedLocation: js.UndefOr[VulnerabilityLocation] = js.undefined
  
  /** Whether this detail is obsolete. Occurrences are expected not to point to obsolete details. */
  var isObsolete: js.UndefOr[Boolean] = js.undefined
  
  /** The max version of the package in which the vulnerability exists. */
  var maxAffectedVersion: js.UndefOr[Version] = js.undefined
  
  /** The min version of the package in which the vulnerability exists. */
  var minAffectedVersion: js.UndefOr[Version] = js.undefined
  
  /** The type of package; whether native or non native(ruby gems, node.js packages etc). */
  var packageType: js.UndefOr[String] = js.undefined
  
  /** The severity (eg: distro assigned severity) for this vulnerability. */
  var severityName: js.UndefOr[String] = js.undefined
  
  /** The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker. */
  var sourceUpdateTime: js.UndefOr[String] = js.undefined
}
object Detail {
  
  inline def apply(): Detail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detail]
  }
  
  extension [Self <: Detail](x: Self) {
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFixedLocation(value: VulnerabilityLocation): Self = StObject.set(x, "fixedLocation", value.asInstanceOf[js.Any])
    
    inline def setFixedLocationUndefined: Self = StObject.set(x, "fixedLocation", js.undefined)
    
    inline def setIsObsolete(value: Boolean): Self = StObject.set(x, "isObsolete", value.asInstanceOf[js.Any])
    
    inline def setIsObsoleteUndefined: Self = StObject.set(x, "isObsolete", js.undefined)
    
    inline def setMaxAffectedVersion(value: Version): Self = StObject.set(x, "maxAffectedVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxAffectedVersionUndefined: Self = StObject.set(x, "maxAffectedVersion", js.undefined)
    
    inline def setMinAffectedVersion(value: Version): Self = StObject.set(x, "minAffectedVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAffectedVersionUndefined: Self = StObject.set(x, "minAffectedVersion", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    inline def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
    
    inline def setSourceUpdateTime(value: String): Self = StObject.set(x, "sourceUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setSourceUpdateTimeUndefined: Self = StObject.set(x, "sourceUpdateTime", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
