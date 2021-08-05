package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of analysis that can be done for a resource.
  */
trait SchemaNote extends StObject {
  
  /**
    * A note describing a package hosted by various package managers.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackage] = js.undefined
  
  /**
    * A note describing an attestation role.
    */
  var attestationAuthority: js.UndefOr[SchemaAuthority] = js.undefined
  
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[SchemaBasis] = js.undefined
  
  /**
    * A note describing build provenance for a verifiable build.
    */
  var build: js.UndefOr[SchemaBuild] = js.undefined
  
  /**
    * Output only. The time this note was created. This field can be used as a
    * filter in list requests.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * A note describing something that can be deployed.
    */
  var deployable: js.UndefOr[SchemaDeployable] = js.undefined
  
  /**
    * A note describing the initial analysis of a resource.
    */
  var discovery: js.UndefOr[SchemaDiscovery] = js.undefined
  
  /**
    * Time of expiration for this note. Empty if note does not expire.
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The type of analysis. This field can be used as a filter in
    * list requests.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A detailed description of this note.
    */
  var longDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name of the note in the form of
    * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Other notes related to this note.
    */
  var relatedNoteNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URLs associated with this note.
    */
  var relatedUrl: js.UndefOr[js.Array[SchemaRelatedUrl]] = js.undefined
  
  /**
    * A one sentence description of this note.
    */
  var shortDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this note was last updated. This field can be used
    * as a filter in list requests.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A note describing a package vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaVulnerability] = js.undefined
}
object SchemaNote {
  
  inline def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  
  extension [Self <: SchemaNote](x: Self) {
    
    inline def setAttestationAuthority(value: SchemaAuthority): Self = StObject.set(x, "attestationAuthority", value.asInstanceOf[js.Any])
    
    inline def setAttestationAuthorityUndefined: Self = StObject.set(x, "attestationAuthority", js.undefined)
    
    inline def setBaseImage(value: SchemaBasis): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "baseImage", js.undefined)
    
    inline def setBuild(value: SchemaBuild): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeployable(value: SchemaDeployable): Self = StObject.set(x, "deployable", value.asInstanceOf[js.Any])
    
    inline def setDeployableUndefined: Self = StObject.set(x, "deployable", js.undefined)
    
    inline def setDiscovery(value: SchemaDiscovery): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelatedNoteNames(value: js.Array[String]): Self = StObject.set(x, "relatedNoteNames", value.asInstanceOf[js.Any])
    
    inline def setRelatedNoteNamesUndefined: Self = StObject.set(x, "relatedNoteNames", js.undefined)
    
    inline def setRelatedNoteNamesVarargs(value: String*): Self = StObject.set(x, "relatedNoteNames", js.Array(value :_*))
    
    inline def setRelatedUrl(value: js.Array[SchemaRelatedUrl]): Self = StObject.set(x, "relatedUrl", value.asInstanceOf[js.Any])
    
    inline def setRelatedUrlUndefined: Self = StObject.set(x, "relatedUrl", js.undefined)
    
    inline def setRelatedUrlVarargs(value: SchemaRelatedUrl*): Self = StObject.set(x, "relatedUrl", js.Array(value :_*))
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVulnerability(value: SchemaVulnerability): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
    
    inline def set_package(value: SchemaPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
