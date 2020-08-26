package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of an analysis type that has been found on a resource.
  */
@js.native
trait SchemaOccurrence extends js.Object {
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaDetails] = js.native
  /**
    * Describes a verifiable build.
    */
  var build: js.UndefOr[SchemaGrafeasV1beta1BuildDetails] = js.native
  /**
    * Output only. The time this occurrence was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaGrafeasV1beta1DeploymentDetails] = js.native
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[SchemaGrafeasV1beta1ImageDetails] = js.native
  /**
    * Describes when a resource was discovered.
    */
  var discovered: js.UndefOr[SchemaGrafeasV1beta1DiscoveryDetails] = js.native
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaGrafeasV1beta1PackageDetails] = js.native
  /**
    * Output only. This explicitly denotes which of the occurrence details are
    * specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the occurrence in the form of
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. Immutable. The analysis note associated with this occurrence,
    * in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can
    * be used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.native
  /**
    * A description of actions that can be taken to remedy the note.
    */
  var remediation: js.UndefOr[String] = js.native
  /**
    * Required. Immutable. The resource for which the occurrence applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
  /**
    * Output only. The time this occurrence was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Describes a security vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaGrafeasV1beta1VulnerabilityDetails] = js.native
}

object SchemaOccurrence {
  @scala.inline
  def apply(): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccurrence]
  }
  @scala.inline
  implicit class SchemaOccurrenceOps[Self <: SchemaOccurrence] (val x: Self) extends AnyVal {
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
    def setAttestation(value: SchemaDetails): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    @scala.inline
    def setBuild(value: SchemaGrafeasV1beta1BuildDetails): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeployment(value: SchemaGrafeasV1beta1DeploymentDetails): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    @scala.inline
    def setDerivedImage(value: SchemaGrafeasV1beta1ImageDetails): Self = this.set("derivedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivedImage: Self = this.set("derivedImage", js.undefined)
    @scala.inline
    def setDiscovered(value: SchemaGrafeasV1beta1DiscoveryDetails): Self = this.set("discovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovered: Self = this.set("discovered", js.undefined)
    @scala.inline
    def setInstallation(value: SchemaGrafeasV1beta1PackageDetails): Self = this.set("installation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallation: Self = this.set("installation", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoteName(value: String): Self = this.set("noteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteName: Self = this.set("noteName", js.undefined)
    @scala.inline
    def setRemediation(value: String): Self = this.set("remediation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediation: Self = this.set("remediation", js.undefined)
    @scala.inline
    def setResource(value: SchemaResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setVulnerability(value: SchemaGrafeasV1beta1VulnerabilityDetails): Self = this.set("vulnerability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVulnerability: Self = this.set("vulnerability", js.undefined)
  }
  
}

