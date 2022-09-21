package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageIssue extends StObject {
  
  /** Required. The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was found in. */
  var affectedCpeUri: js.UndefOr[String] = js.undefined
  
  /** Required. The package this vulnerability was found in. */
  var affectedPackage: js.UndefOr[String] = js.undefined
  
  /** Required. The version of the package that is installed on the resource affected by this vulnerability. */
  var affectedVersion: js.UndefOr[Version] = js.undefined
  
  /** Output only. The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available. */
  var effectiveSeverity: js.UndefOr[String] = js.undefined
  
  /** The location at which this package was found. */
  var fileLocation: js.UndefOr[js.Array[GrafeasV1FileLocation]] = js.undefined
  
  /** Output only. Whether a fix is available for this package. */
  var fixAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was fixed in. It is possible for this to be different from the affected_cpe_uri. */
  var fixedCpeUri: js.UndefOr[String] = js.undefined
  
  /** The package this vulnerability was fixed in. It is possible for this to be different from the affected_package. */
  var fixedPackage: js.UndefOr[String] = js.undefined
  
  /** Required. The version of the package this vulnerability was fixed in. Setting this to VersionKind.MAXIMUM means no fix is yet available. */
  var fixedVersion: js.UndefOr[Version] = js.undefined
  
  /** The type of package (e.g. OS, MAVEN, GO). */
  var packageType: js.UndefOr[String] = js.undefined
}
object PackageIssue {
  
  inline def apply(): PackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageIssue]
  }
  
  extension [Self <: PackageIssue](x: Self) {
    
    inline def setAffectedCpeUri(value: String): Self = StObject.set(x, "affectedCpeUri", value.asInstanceOf[js.Any])
    
    inline def setAffectedCpeUriUndefined: Self = StObject.set(x, "affectedCpeUri", js.undefined)
    
    inline def setAffectedPackage(value: String): Self = StObject.set(x, "affectedPackage", value.asInstanceOf[js.Any])
    
    inline def setAffectedPackageUndefined: Self = StObject.set(x, "affectedPackage", js.undefined)
    
    inline def setAffectedVersion(value: Version): Self = StObject.set(x, "affectedVersion", value.asInstanceOf[js.Any])
    
    inline def setAffectedVersionUndefined: Self = StObject.set(x, "affectedVersion", js.undefined)
    
    inline def setEffectiveSeverity(value: String): Self = StObject.set(x, "effectiveSeverity", value.asInstanceOf[js.Any])
    
    inline def setEffectiveSeverityUndefined: Self = StObject.set(x, "effectiveSeverity", js.undefined)
    
    inline def setFileLocation(value: js.Array[GrafeasV1FileLocation]): Self = StObject.set(x, "fileLocation", value.asInstanceOf[js.Any])
    
    inline def setFileLocationUndefined: Self = StObject.set(x, "fileLocation", js.undefined)
    
    inline def setFileLocationVarargs(value: GrafeasV1FileLocation*): Self = StObject.set(x, "fileLocation", js.Array(value*))
    
    inline def setFixAvailable(value: Boolean): Self = StObject.set(x, "fixAvailable", value.asInstanceOf[js.Any])
    
    inline def setFixAvailableUndefined: Self = StObject.set(x, "fixAvailable", js.undefined)
    
    inline def setFixedCpeUri(value: String): Self = StObject.set(x, "fixedCpeUri", value.asInstanceOf[js.Any])
    
    inline def setFixedCpeUriUndefined: Self = StObject.set(x, "fixedCpeUri", js.undefined)
    
    inline def setFixedPackage(value: String): Self = StObject.set(x, "fixedPackage", value.asInstanceOf[js.Any])
    
    inline def setFixedPackageUndefined: Self = StObject.set(x, "fixedPackage", js.undefined)
    
    inline def setFixedVersion(value: Version): Self = StObject.set(x, "fixedVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedVersionUndefined: Self = StObject.set(x, "fixedVersion", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
  }
}
