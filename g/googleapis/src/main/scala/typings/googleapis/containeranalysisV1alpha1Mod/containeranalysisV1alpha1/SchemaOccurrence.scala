package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Occurrence` includes information about analysis occurrences for an image.
  */
@js.native
trait SchemaOccurrence extends js.Object {
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaAttestation] = js.native
  /**
    * Build details for a verifiable build.
    */
  var buildDetails: js.UndefOr[SchemaBuildDetails] = js.native
  /**
    * Output only. The time this `Occurrence` was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.native
  /**
    * Describes the initial scan status for this resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.native
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.native
  /**
    * Output only. This explicitly denotes which of the `Occurrence` details
    * are specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the `Occurrence` in the form
    * &quot;projects/{project_id}/occurrences/{OCCURRENCE_ID}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An analysis note associated with this image, in the form
    * &quot;providers/{provider_id}/notes/{NOTE_ID}&quot; This field can be
    * used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.native
  /**
    * A description of actions that can be taken to remedy the `Note`
    */
  var remediation: js.UndefOr[String] = js.native
  /**
    * The resource for which the `Occurrence` applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
  /**
    * The unique URL of the image or the container for which the `Occurrence`
    * applies. For example, https://gcr.io/project/image@sha256:foo This field
    * can be used as a filter in list requests.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The time this `Occurrence` was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Details of a security vulnerability note.
    */
  var vulnerabilityDetails: js.UndefOr[SchemaVulnerabilityDetails] = js.native
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
    def setAttestation(value: SchemaAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    @scala.inline
    def setBuildDetails(value: SchemaBuildDetails): Self = this.set("buildDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildDetails: Self = this.set("buildDetails", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeployment(value: SchemaDeployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    @scala.inline
    def setDerivedImage(value: SchemaDerived): Self = this.set("derivedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivedImage: Self = this.set("derivedImage", js.undefined)
    @scala.inline
    def setDiscovered(value: SchemaDiscovered): Self = this.set("discovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovered: Self = this.set("discovered", js.undefined)
    @scala.inline
    def setInstallation(value: SchemaInstallation): Self = this.set("installation", value.asInstanceOf[js.Any])
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
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setVulnerabilityDetails(value: SchemaVulnerabilityDetails): Self = this.set("vulnerabilityDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVulnerabilityDetails: Self = this.set("vulnerabilityDetails", js.undefined)
  }
  
}

