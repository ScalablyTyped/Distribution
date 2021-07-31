package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies all occurrences of this vulnerability in the package for a
  * specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8
  * for versions 2.1 - 2.2
  */
trait SchemaDetail extends StObject {
  
  /**
    * The name of the package where the vulnerability was found. This field can
    * be used as a filter in list requests.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /**
    * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in
    * which the vulnerability manifests.  Examples include distro or storage
    * location for vulnerable jar. This field can be used as a filter in list
    * requests.
    */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /**
    * A vendor-specific description of this note.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The fix for this specific package version.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.undefined
  
  /**
    * Whether this Detail is obsolete. Occurrences are expected not to point to
    * obsolete details.
    */
  var isObsolete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The max version of the package in which the vulnerability exists. This
    * field can be used as a filter in list requests.
    */
  var maxAffectedVersion: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * The min version of the package in which the vulnerability exists.
    */
  var minAffectedVersion: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * The type of package; whether native or non native(ruby gems, node.js
    * packages etc)
    */
  var packageType: js.UndefOr[String] = js.undefined
  
  /**
    * The severity (eg: distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.undefined
}
object SchemaDetail {
  
  @scala.inline
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  
  @scala.inline
  implicit class SchemaDetailMutableBuilder[Self <: SchemaDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFixedLocation(value: SchemaVulnerabilityLocation): Self = StObject.set(x, "fixedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedLocationUndefined: Self = StObject.set(x, "fixedLocation", js.undefined)
    
    @scala.inline
    def setIsObsolete(value: Boolean): Self = StObject.set(x, "isObsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObsoleteUndefined: Self = StObject.set(x, "isObsolete", js.undefined)
    
    @scala.inline
    def setMaxAffectedVersion(value: SchemaVersion): Self = StObject.set(x, "maxAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAffectedVersionUndefined: Self = StObject.set(x, "maxAffectedVersion", js.undefined)
    
    @scala.inline
    def setMinAffectedVersion(value: SchemaVersion): Self = StObject.set(x, "minAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAffectedVersionUndefined: Self = StObject.set(x, "minAffectedVersion", js.undefined)
    
    @scala.inline
    def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    @scala.inline
    def setSeverityName(value: String): Self = StObject.set(x, "severityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityNameUndefined: Self = StObject.set(x, "severityName", js.undefined)
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
