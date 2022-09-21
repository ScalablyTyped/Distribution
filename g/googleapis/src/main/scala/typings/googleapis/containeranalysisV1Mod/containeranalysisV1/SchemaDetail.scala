package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetail extends StObject {
  
  /**
    * Required. The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
    */
  var affectedCpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The package this vulnerability affects.
    */
  var affectedPackage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
    */
  var affectedVersionEnd: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
    */
  var affectedVersionStart: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * A vendor-specific description of this vulnerability.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
    */
  var fixedCpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
    */
  var fixedPackage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
    */
  var fixedVersion: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
    */
  var isObsolete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
    */
  var packageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The distro assigned severity of this vulnerability.
    */
  var severityName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source from which the information in this Detail was obtained.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
    */
  var sourceUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the vendor of the product.
    */
  var vendor: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetail {
  
  inline def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  
  extension [Self <: SchemaDetail](x: Self) {
    
    inline def setAffectedCpeUri(value: String): Self = StObject.set(x, "affectedCpeUri", value.asInstanceOf[js.Any])
    
    inline def setAffectedCpeUriNull: Self = StObject.set(x, "affectedCpeUri", null)
    
    inline def setAffectedCpeUriUndefined: Self = StObject.set(x, "affectedCpeUri", js.undefined)
    
    inline def setAffectedPackage(value: String): Self = StObject.set(x, "affectedPackage", value.asInstanceOf[js.Any])
    
    inline def setAffectedPackageNull: Self = StObject.set(x, "affectedPackage", null)
    
    inline def setAffectedPackageUndefined: Self = StObject.set(x, "affectedPackage", js.undefined)
    
    inline def setAffectedVersionEnd(value: SchemaVersion): Self = StObject.set(x, "affectedVersionEnd", value.asInstanceOf[js.Any])
    
    inline def setAffectedVersionEndUndefined: Self = StObject.set(x, "affectedVersionEnd", js.undefined)
    
    inline def setAffectedVersionStart(value: SchemaVersion): Self = StObject.set(x, "affectedVersionStart", value.asInstanceOf[js.Any])
    
    inline def setAffectedVersionStartUndefined: Self = StObject.set(x, "affectedVersionStart", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFixedCpeUri(value: String): Self = StObject.set(x, "fixedCpeUri", value.asInstanceOf[js.Any])
    
    inline def setFixedCpeUriNull: Self = StObject.set(x, "fixedCpeUri", null)
    
    inline def setFixedCpeUriUndefined: Self = StObject.set(x, "fixedCpeUri", js.undefined)
    
    inline def setFixedPackage(value: String): Self = StObject.set(x, "fixedPackage", value.asInstanceOf[js.Any])
    
    inline def setFixedPackageNull: Self = StObject.set(x, "fixedPackage", null)
    
    inline def setFixedPackageUndefined: Self = StObject.set(x, "fixedPackage", js.undefined)
    
    inline def setFixedVersion(value: SchemaVersion): Self = StObject.set(x, "fixedVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedVersionUndefined: Self = StObject.set(x, "fixedVersion", js.undefined)
    
    inline def setIsObsolete(value: Boolean): Self = StObject.set(x, "isObsolete", value.asInstanceOf[js.Any])
    
    inline def setIsObsoleteNull: Self = StObject.set(x, "isObsolete", null)
    
    inline def setIsObsoleteUndefined: Self = StObject.set(x, "isObsolete", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeNull: Self = StObject.set(x, "packageType", null)
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    inline def setSeverityNameNull: Self = StObject.set(x, "severityName", null)
    
    inline def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceUpdateTime(value: String): Self = StObject.set(x, "sourceUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setSourceUpdateTimeNull: Self = StObject.set(x, "sourceUpdateTime", null)
    
    inline def setSourceUpdateTimeUndefined: Self = StObject.set(x, "sourceUpdateTime", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorNull: Self = StObject.set(x, "vendor", null)
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
