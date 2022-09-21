package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOccurrence extends StObject {
  
  /**
    * Describes the installation of a package on the linked resource.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackageOccurrence] = js.undefined
  
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaAttestationOccurrence] = js.undefined
  
  /**
    * Describes a verifiable build.
    */
  var build: js.UndefOr[SchemaBuildOccurrence] = js.undefined
  
  /**
    * Describes a compliance violation on a linked resource.
    */
  var compliance: js.UndefOr[SchemaComplianceOccurrence] = js.undefined
  
  /**
    * Output only. The time this occurrence was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaDeploymentOccurrence] = js.undefined
  
  /**
    * Describes when a resource was discovered.
    */
  var discovery: js.UndefOr[SchemaDiscoveryOccurrence] = js.undefined
  
  /**
    * Describes an attestation of an artifact using dsse.
    */
  var dsseAttestation: js.UndefOr[SchemaDSSEAttestationOccurrence] = js.undefined
  
  /**
    * https://github.com/secure-systems-lab/dsse
    */
  var envelope: js.UndefOr[SchemaEnvelope] = js.undefined
  
  /**
    * Describes how this resource derives from the basis in the associated note.
    */
  var image: js.UndefOr[SchemaImageOccurrence] = js.undefined
  
  /**
    * Output only. This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
    */
  var noteName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of actions that can be taken to remedy the note.
    */
  var remediation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this occurrence was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes an available package upgrade on the linked resource.
    */
  var upgrade: js.UndefOr[SchemaUpgradeOccurrence] = js.undefined
  
  /**
    * Describes a security vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaVulnerabilityOccurrence] = js.undefined
}
object SchemaOccurrence {
  
  inline def apply(): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccurrence]
  }
  
  extension [Self <: SchemaOccurrence](x: Self) {
    
    inline def setAttestation(value: SchemaAttestationOccurrence): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setBuild(value: SchemaBuildOccurrence): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCompliance(value: SchemaComplianceOccurrence): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployment(value: SchemaDeploymentOccurrence): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDiscovery(value: SchemaDiscoveryOccurrence): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDsseAttestation(value: SchemaDSSEAttestationOccurrence): Self = StObject.set(x, "dsseAttestation", value.asInstanceOf[js.Any])
    
    inline def setDsseAttestationUndefined: Self = StObject.set(x, "dsseAttestation", js.undefined)
    
    inline def setEnvelope(value: SchemaEnvelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setImage(value: SchemaImageOccurrence): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
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
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgrade(value: SchemaUpgradeOccurrence): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    
    inline def setVulnerability(value: SchemaVulnerabilityOccurrence): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
    
    inline def set_package(value: SchemaPackageOccurrence): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
