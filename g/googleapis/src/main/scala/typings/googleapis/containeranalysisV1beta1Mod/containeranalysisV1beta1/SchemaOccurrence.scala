package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of an analysis type that has been found on a resource.
  */
trait SchemaOccurrence extends StObject {
  
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaDetails] = js.undefined
  
  /**
    * Describes a verifiable build.
    */
  var build: js.UndefOr[SchemaGrafeasV1beta1BuildDetails] = js.undefined
  
  /**
    * Output only. The time this occurrence was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaGrafeasV1beta1DeploymentDetails] = js.undefined
  
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[SchemaGrafeasV1beta1ImageDetails] = js.undefined
  
  /**
    * Describes when a resource was discovered.
    */
  var discovered: js.UndefOr[SchemaGrafeasV1beta1DiscoveryDetails] = js.undefined
  
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaGrafeasV1beta1PackageDetails] = js.undefined
  
  /**
    * Output only. This explicitly denotes which of the occurrence details are
    * specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name of the occurrence in the form of
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. The analysis note associated with this occurrence,
    * in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can
    * be used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.undefined
  
  /**
    * A description of actions that can be taken to remedy the note.
    */
  var remediation: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. The resource for which the occurrence applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * Output only. The time this occurrence was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Describes a security vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaGrafeasV1beta1VulnerabilityDetails] = js.undefined
}
object SchemaOccurrence {
  
  @scala.inline
  def apply(): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccurrence]
  }
  
  @scala.inline
  implicit class SchemaOccurrenceMutableBuilder[Self <: SchemaOccurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestation(value: SchemaDetails): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    @scala.inline
    def setBuild(value: SchemaGrafeasV1beta1BuildDetails): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeployment(value: SchemaGrafeasV1beta1DeploymentDetails): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    @scala.inline
    def setDerivedImage(value: SchemaGrafeasV1beta1ImageDetails): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
    
    @scala.inline
    def setDiscovered(value: SchemaGrafeasV1beta1DiscoveryDetails): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveredUndefined: Self = StObject.set(x, "discovered", js.undefined)
    
    @scala.inline
    def setInstallation(value: SchemaGrafeasV1beta1PackageDetails): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoteName(value: String): Self = StObject.set(x, "noteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteNameUndefined: Self = StObject.set(x, "noteName", js.undefined)
    
    @scala.inline
    def setRemediation(value: String): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVulnerability(value: SchemaGrafeasV1beta1VulnerabilityDetails): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
  }
}
