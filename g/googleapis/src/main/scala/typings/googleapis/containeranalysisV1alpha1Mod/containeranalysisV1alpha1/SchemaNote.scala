package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNote extends StObject {
  
  /**
    * A note describing a package hosted by various package managers.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackage] = js.undefined
  
  /**
    * A note describing an attestation role.
    */
  var attestationAuthority: js.UndefOr[SchemaAttestationAuthority] = js.undefined
  
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[SchemaBasis] = js.undefined
  
  /**
    * Build provenance type for a verifiable build.
    */
  var buildType: js.UndefOr[SchemaBuildType] = js.undefined
  
  /**
    * A note describing a compliance check.
    */
  var compliance: js.UndefOr[SchemaComplianceNote] = js.undefined
  
  /**
    * Output only. The time this note was created. This field can be used as a filter in list requests.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A note describing something that can be deployed.
    */
  var deployable: js.UndefOr[SchemaDeployable] = js.undefined
  
  /**
    * A note describing a provider/analysis type.
    */
  var discovery: js.UndefOr[SchemaDiscovery] = js.undefined
  
  /**
    * A note describing a dsse attestation note.
    */
  var dsseAttestation: js.UndefOr[SchemaDSSEAttestationNote] = js.undefined
  
  /**
    * Time of expiration for this note, null if note does not expire.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A detailed description of this `Note`.
    */
  var longDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the note in the form "projects/{provider_project_id\}/notes/{NOTE_ID\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URLs associated with this note
    */
  var relatedUrl: js.UndefOr[js.Array[SchemaRelatedUrl]] = js.undefined
  
  /**
    * A note describing a software bill of materials.
    */
  var sbom: js.UndefOr[SchemaDocumentNote] = js.undefined
  
  /**
    * A one sentence description of this `Note`.
    */
  var shortDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A note describing an SPDX File.
    */
  var spdxFile: js.UndefOr[SchemaFileNote] = js.undefined
  
  /**
    * A note describing an SPDX Package.
    */
  var spdxPackage: js.UndefOr[SchemaPackageInfoNote] = js.undefined
  
  /**
    * A note describing a relationship between SPDX elements.
    */
  var spdxRelationship: js.UndefOr[SchemaRelationshipNote] = js.undefined
  
  /**
    * Output only. The time this note was last updated. This field can be used as a filter in list requests.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A note describing an upgrade.
    */
  var upgrade: js.UndefOr[SchemaUpgradeNote] = js.undefined
  
  /**
    * A package vulnerability type of note.
    */
  var vulnerabilityType: js.UndefOr[SchemaVulnerabilityType] = js.undefined
}
object SchemaNote {
  
  inline def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  
  extension [Self <: SchemaNote](x: Self) {
    
    inline def setAttestationAuthority(value: SchemaAttestationAuthority): Self = StObject.set(x, "attestationAuthority", value.asInstanceOf[js.Any])
    
    inline def setAttestationAuthorityUndefined: Self = StObject.set(x, "attestationAuthority", js.undefined)
    
    inline def setBaseImage(value: SchemaBasis): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "baseImage", js.undefined)
    
    inline def setBuildType(value: SchemaBuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setCompliance(value: SchemaComplianceNote): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployable(value: SchemaDeployable): Self = StObject.set(x, "deployable", value.asInstanceOf[js.Any])
    
    inline def setDeployableUndefined: Self = StObject.set(x, "deployable", js.undefined)
    
    inline def setDiscovery(value: SchemaDiscovery): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDsseAttestation(value: SchemaDSSEAttestationNote): Self = StObject.set(x, "dsseAttestation", value.asInstanceOf[js.Any])
    
    inline def setDsseAttestationUndefined: Self = StObject.set(x, "dsseAttestation", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setLongDescriptionNull: Self = StObject.set(x, "longDescription", null)
    
    inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelatedUrl(value: js.Array[SchemaRelatedUrl]): Self = StObject.set(x, "relatedUrl", value.asInstanceOf[js.Any])
    
    inline def setRelatedUrlUndefined: Self = StObject.set(x, "relatedUrl", js.undefined)
    
    inline def setRelatedUrlVarargs(value: SchemaRelatedUrl*): Self = StObject.set(x, "relatedUrl", js.Array(value*))
    
    inline def setSbom(value: SchemaDocumentNote): Self = StObject.set(x, "sbom", value.asInstanceOf[js.Any])
    
    inline def setSbomUndefined: Self = StObject.set(x, "sbom", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionNull: Self = StObject.set(x, "shortDescription", null)
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setSpdxFile(value: SchemaFileNote): Self = StObject.set(x, "spdxFile", value.asInstanceOf[js.Any])
    
    inline def setSpdxFileUndefined: Self = StObject.set(x, "spdxFile", js.undefined)
    
    inline def setSpdxPackage(value: SchemaPackageInfoNote): Self = StObject.set(x, "spdxPackage", value.asInstanceOf[js.Any])
    
    inline def setSpdxPackageUndefined: Self = StObject.set(x, "spdxPackage", js.undefined)
    
    inline def setSpdxRelationship(value: SchemaRelationshipNote): Self = StObject.set(x, "spdxRelationship", value.asInstanceOf[js.Any])
    
    inline def setSpdxRelationshipUndefined: Self = StObject.set(x, "spdxRelationship", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgrade(value: SchemaUpgradeNote): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    
    inline def setVulnerabilityType(value: SchemaVulnerabilityType): Self = StObject.set(x, "vulnerabilityType", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityTypeUndefined: Self = StObject.set(x, "vulnerabilityType", js.undefined)
    
    inline def set_package(value: SchemaPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
