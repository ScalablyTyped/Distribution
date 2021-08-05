package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Occurrence extends StObject {
  
  /** Describes an attestation of an artifact. */
  var attestation: js.UndefOr[Details] = js.undefined
  
  /** Describes a verifiable build. */
  var build: js.UndefOr[GrafeasV1beta1BuildDetails] = js.undefined
  
  /** Output only. The time this occurrence was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Describes the deployment of an artifact on a runtime. */
  var deployment: js.UndefOr[GrafeasV1beta1DeploymentDetails] = js.undefined
  
  /** Describes how this resource derives from the basis in the associated note. */
  var derivedImage: js.UndefOr[GrafeasV1beta1ImageDetails] = js.undefined
  
  /** Describes when a resource was discovered. */
  var discovered: js.UndefOr[GrafeasV1beta1DiscoveryDetails] = js.undefined
  
  /** Describes the installation of a package on the linked resource. */
  var installation: js.UndefOr[GrafeasV1beta1PackageDetails] = js.undefined
  
  /** Describes a specific in-toto link. */
  var intoto: js.UndefOr[GrafeasV1beta1IntotoDetails] = js.undefined
  
  /** Output only. This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests. */
  var noteName: js.UndefOr[String] = js.undefined
  
  /** A description of actions that can be taken to remedy the note. */
  var remediation: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The resource for which the occurrence applies. */
  var resource: js.UndefOr[Resource] = js.undefined
  
  /** Output only. The time this occurrence was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Describes a security vulnerability. */
  var vulnerability: js.UndefOr[GrafeasV1beta1VulnerabilityDetails] = js.undefined
}
object Occurrence {
  
  inline def apply(): Occurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Occurrence]
  }
  
  extension [Self <: Occurrence](x: Self) {
    
    inline def setAttestation(value: Details): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setBuild(value: GrafeasV1beta1BuildDetails): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployment(value: GrafeasV1beta1DeploymentDetails): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDerivedImage(value: GrafeasV1beta1ImageDetails): Self = StObject.set(x, "derivedImage", value.asInstanceOf[js.Any])
    
    inline def setDerivedImageUndefined: Self = StObject.set(x, "derivedImage", js.undefined)
    
    inline def setDiscovered(value: GrafeasV1beta1DiscoveryDetails): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredUndefined: Self = StObject.set(x, "discovered", js.undefined)
    
    inline def setInstallation(value: GrafeasV1beta1PackageDetails): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setIntoto(value: GrafeasV1beta1IntotoDetails): Self = StObject.set(x, "intoto", value.asInstanceOf[js.Any])
    
    inline def setIntotoUndefined: Self = StObject.set(x, "intoto", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoteName(value: String): Self = StObject.set(x, "noteName", value.asInstanceOf[js.Any])
    
    inline def setNoteNameUndefined: Self = StObject.set(x, "noteName", js.undefined)
    
    inline def setRemediation(value: String): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVulnerability(value: GrafeasV1beta1VulnerabilityDetails): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
  }
}
