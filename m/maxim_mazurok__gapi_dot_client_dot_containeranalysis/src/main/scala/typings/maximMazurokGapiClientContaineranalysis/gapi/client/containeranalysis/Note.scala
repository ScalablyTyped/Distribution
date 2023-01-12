package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  /** A note describing a package hosted by various package managers. */
  @JSName("package")
  var _package: js.UndefOr[PackageNote] = js.undefined
  
  /** A note describing an attestation role. */
  var attestation: js.UndefOr[AttestationNote] = js.undefined
  
  /** A note describing build provenance for a verifiable build. */
  var build: js.UndefOr[BuildNote] = js.undefined
  
  /** A note describing a compliance check. */
  var compliance: js.UndefOr[ComplianceNote] = js.undefined
  
  /** Output only. The time this note was created. This field can be used as a filter in list requests. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** A note describing something that can be deployed. */
  var deployment: js.UndefOr[DeploymentNote] = js.undefined
  
  /** A note describing the initial analysis of a resource. */
  var discovery: js.UndefOr[DiscoveryNote] = js.undefined
  
  /** A note describing a dsse attestation note. */
  var dsseAttestation: js.UndefOr[DSSEAttestationNote] = js.undefined
  
  /** Time of expiration for this note. Empty if note does not expire. */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** A note describing a base image. */
  var image: js.UndefOr[ImageNote] = js.undefined
  
  /** Output only. The type of analysis. This field can be used as a filter in list requests. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A detailed description of this note. */
  var longDescription: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Other notes related to this note. */
  var relatedNoteNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URLs associated with this note. */
  var relatedUrl: js.UndefOr[js.Array[RelatedUrl]] = js.undefined
  
  /** A one sentence description of this note. */
  var shortDescription: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this note was last updated. This field can be used as a filter in list requests. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** A note describing available package upgrades. */
  var upgrade: js.UndefOr[UpgradeNote] = js.undefined
  
  /** A note describing a package vulnerability. */
  var vulnerability: js.UndefOr[VulnerabilityNote] = js.undefined
}
object Note {
  
  inline def apply(): Note = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    inline def setAttestation(value: AttestationNote): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setBuild(value: BuildNote): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCompliance(value: ComplianceNote): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployment(value: DeploymentNote): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDiscovery(value: DiscoveryNote): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDsseAttestation(value: DSSEAttestationNote): Self = StObject.set(x, "dsseAttestation", value.asInstanceOf[js.Any])
    
    inline def setDsseAttestationUndefined: Self = StObject.set(x, "dsseAttestation", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setImage(value: ImageNote): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelatedNoteNames(value: js.Array[String]): Self = StObject.set(x, "relatedNoteNames", value.asInstanceOf[js.Any])
    
    inline def setRelatedNoteNamesUndefined: Self = StObject.set(x, "relatedNoteNames", js.undefined)
    
    inline def setRelatedNoteNamesVarargs(value: String*): Self = StObject.set(x, "relatedNoteNames", js.Array(value*))
    
    inline def setRelatedUrl(value: js.Array[RelatedUrl]): Self = StObject.set(x, "relatedUrl", value.asInstanceOf[js.Any])
    
    inline def setRelatedUrlUndefined: Self = StObject.set(x, "relatedUrl", js.undefined)
    
    inline def setRelatedUrlVarargs(value: RelatedUrl*): Self = StObject.set(x, "relatedUrl", js.Array(value*))
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgrade(value: UpgradeNote): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    
    inline def setVulnerability(value: VulnerabilityNote): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
    
    inline def set_package(value: PackageNote): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
