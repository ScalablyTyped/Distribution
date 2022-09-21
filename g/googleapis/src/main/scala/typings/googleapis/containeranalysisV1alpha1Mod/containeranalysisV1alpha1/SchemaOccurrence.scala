package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOccurrence extends StObject {
  
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaAttestation] = js.undefined
  
  /**
    * Build details for a verifiable build.
    */
  var buildDetails: js.UndefOr[SchemaBuildDetails] = js.undefined
  
  /**
    * Describes whether or not a resource passes compliance checks.
    */
  var compliance: js.UndefOr[SchemaComplianceOccurrence] = js.undefined
  
  /**
    * Output only. The time this `Occurrence` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.undefined
  
  /**
    * Describes how this resource derives from the basis in the associated note.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.undefined
  
  /**
    * Describes the initial scan status for this resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.undefined
  
  /**
    * This represents a DSSE attestation occurrence
    */
  var dsseAttestation: js.UndefOr[SchemaDSSEAttestationOccurrence] = js.undefined
  
  /**
    * https://github.com/secure-systems-lab/dsse
    */
  var envelope: js.UndefOr[SchemaEnvelope] = js.undefined
  
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.undefined
  
  /**
    * Output only. This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the `Occurrence` in the form "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An analysis note associated with this image, in the form "providers/{provider_id\}/notes/{NOTE_ID\}" This field can be used as a filter in list requests.
    */
  var noteName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of actions that can be taken to remedy the `Note`
    */
  var remediation: js.UndefOr[String | Null] = js.undefined
  
  /**
    *  The resource for which the `Occurrence` applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
    */
  var resourceUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes a specific software bill of materials document.
    */
  var sbom: js.UndefOr[SchemaDocumentOccurrence] = js.undefined
  
  /**
    * Describes a specific SPDX File.
    */
  var spdxFile: js.UndefOr[SchemaFileOccurrence] = js.undefined
  
  /**
    * Describes a specific SPDX Package.
    */
  var spdxPackage: js.UndefOr[SchemaPackageInfoOccurrence] = js.undefined
  
  /**
    * Describes a specific relationship between SPDX elements.
    */
  var spdxRelationship: js.UndefOr[SchemaRelationshipOccurrence] = js.undefined
  
  /**
    * Output only. The time this `Occurrence` was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes an upgrade.
    */
  var upgrade: js.UndefOr[SchemaUpgradeOccurrence] = js.undefined
  
  /**
    * Details of a security vulnerability note.
    */
  var vulnerabilityDetails: js.UndefOr[SchemaVulnerabilityDetails] = js.undefined
}
object SchemaOccurrence {
  
  inline def apply(): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccurrence]
  }
  
  extension [Self <: SchemaOccurrence](x: Self) {
    
    inline def setAttestation(value: SchemaAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setBuildDetails(value: SchemaBuildDetails): Self = StObject.set(x, "buildDetails", value.asInstanceOf[js.Any])
    
    inline def setBuildDetailsUndefined: Self = StObject.set(x, "buildDetails", js.undefined)
    
    inline def setCompliance(value: SchemaComplianceOccurrence): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDerivedImage(value: SchemaDerived): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    inline def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
    
    inline def setDiscovered(value: SchemaDiscovered): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredUndefined: Self = StObject.set(x, "discovered", js.undefined)
    
    inline def setDsseAttestation(value: SchemaDSSEAttestationOccurrence): Self = StObject.set(x, "dsseAttestation", value.asInstanceOf[js.Any])
    
    inline def setDsseAttestationUndefined: Self = StObject.set(x, "dsseAttestation", js.undefined)
    
    inline def setEnvelope(value: SchemaEnvelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setInstallation(value: SchemaInstallation): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoteName(value: String): Self = StObject.set(x, "noteName", value.asInstanceOf[js.Any])
    
    inline def setNoteNameNull: Self = StObject.set(x, "noteName", null)
    
    inline def setNoteNameUndefined: Self = StObject.set(x, "noteName", js.undefined)
    
    inline def setRemediation(value: String): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationNull: Self = StObject.set(x, "remediation", null)
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlNull: Self = StObject.set(x, "resourceUrl", null)
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    inline def setSbom(value: SchemaDocumentOccurrence): Self = StObject.set(x, "sbom", value.asInstanceOf[js.Any])
    
    inline def setSbomUndefined: Self = StObject.set(x, "sbom", js.undefined)
    
    inline def setSpdxFile(value: SchemaFileOccurrence): Self = StObject.set(x, "spdxFile", value.asInstanceOf[js.Any])
    
    inline def setSpdxFileUndefined: Self = StObject.set(x, "spdxFile", js.undefined)
    
    inline def setSpdxPackage(value: SchemaPackageInfoOccurrence): Self = StObject.set(x, "spdxPackage", value.asInstanceOf[js.Any])
    
    inline def setSpdxPackageUndefined: Self = StObject.set(x, "spdxPackage", js.undefined)
    
    inline def setSpdxRelationship(value: SchemaRelationshipOccurrence): Self = StObject.set(x, "spdxRelationship", value.asInstanceOf[js.Any])
    
    inline def setSpdxRelationshipUndefined: Self = StObject.set(x, "spdxRelationship", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgrade(value: SchemaUpgradeOccurrence): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    
    inline def setVulnerabilityDetails(value: SchemaVulnerabilityDetails): Self = StObject.set(x, "vulnerabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityDetailsUndefined: Self = StObject.set(x, "vulnerabilityDetails", js.undefined)
  }
}
