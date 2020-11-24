package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of analysis that can be done for a resource.
  */
@js.native
trait SchemaNote extends js.Object {
  
  /**
    * A note describing a package hosted by various package managers.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackage] = js.native
  
  /**
    * A note describing an attestation role.
    */
  var attestationAuthority: js.UndefOr[SchemaAuthority] = js.native
  
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[SchemaBasis] = js.native
  
  /**
    * A note describing build provenance for a verifiable build.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
  
  /**
    * Output only. The time this note was created. This field can be used as a
    * filter in list requests.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * A note describing something that can be deployed.
    */
  var deployable: js.UndefOr[SchemaDeployable] = js.native
  
  /**
    * A note describing the initial analysis of a resource.
    */
  var discovery: js.UndefOr[SchemaDiscovery] = js.native
  
  /**
    * Time of expiration for this note. Empty if note does not expire.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The type of analysis. This field can be used as a filter in
    * list requests.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A detailed description of this note.
    */
  var longDescription: js.UndefOr[String] = js.native
  
  /**
    * Output only. The name of the note in the form of
    * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Other notes related to this note.
    */
  var relatedNoteNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * URLs associated with this note.
    */
  var relatedUrl: js.UndefOr[js.Array[SchemaRelatedUrl]] = js.native
  
  /**
    * A one sentence description of this note.
    */
  var shortDescription: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time this note was last updated. This field can be used
    * as a filter in list requests.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * A note describing a package vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaVulnerability] = js.native
}
object SchemaNote {
  
  @scala.inline
  def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  
  @scala.inline
  implicit class SchemaNoteOps[Self <: SchemaNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_package(value: SchemaPackage): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setAttestationAuthority(value: SchemaAuthority): Self = this.set("attestationAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestationAuthority: Self = this.set("attestationAuthority", js.undefined)
    
    @scala.inline
    def setBaseImage(value: SchemaBasis): Self = this.set("baseImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseImage: Self = this.set("baseImage", js.undefined)
    
    @scala.inline
    def setBuild(value: SchemaBuild): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeployable(value: SchemaDeployable): Self = this.set("deployable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployable: Self = this.set("deployable", js.undefined)
    
    @scala.inline
    def setDiscovery(value: SchemaDiscovery): Self = this.set("discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscovery: Self = this.set("discovery", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLongDescription(value: String): Self = this.set("longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongDescription: Self = this.set("longDescription", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRelatedNoteNamesVarargs(value: String*): Self = this.set("relatedNoteNames", js.Array(value :_*))
    
    @scala.inline
    def setRelatedNoteNames(value: js.Array[String]): Self = this.set("relatedNoteNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedNoteNames: Self = this.set("relatedNoteNames", js.undefined)
    
    @scala.inline
    def setRelatedUrlVarargs(value: SchemaRelatedUrl*): Self = this.set("relatedUrl", js.Array(value :_*))
    
    @scala.inline
    def setRelatedUrl(value: js.Array[SchemaRelatedUrl]): Self = this.set("relatedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedUrl: Self = this.set("relatedUrl", js.undefined)
    
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVulnerability(value: SchemaVulnerability): Self = this.set("vulnerability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVulnerability: Self = this.set("vulnerability", js.undefined)
  }
}
