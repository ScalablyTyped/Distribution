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
  def apply(
    attestation: SchemaDetails = null,
    build: SchemaGrafeasV1beta1BuildDetails = null,
    createTime: String = null,
    deployment: SchemaGrafeasV1beta1DeploymentDetails = null,
    derivedImage: SchemaGrafeasV1beta1ImageDetails = null,
    discovered: SchemaGrafeasV1beta1DiscoveryDetails = null,
    installation: SchemaGrafeasV1beta1PackageDetails = null,
    kind: String = null,
    name: String = null,
    noteName: String = null,
    remediation: String = null,
    resource: SchemaResource = null,
    updateTime: String = null,
    vulnerability: SchemaGrafeasV1beta1VulnerabilityDetails = null
  ): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (derivedImage != null) __obj.updateDynamic("derivedImage")(derivedImage.asInstanceOf[js.Any])
    if (discovered != null) __obj.updateDynamic("discovered")(discovered.asInstanceOf[js.Any])
    if (installation != null) __obj.updateDynamic("installation")(installation.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noteName != null) __obj.updateDynamic("noteName")(noteName.asInstanceOf[js.Any])
    if (remediation != null) __obj.updateDynamic("remediation")(remediation.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (vulnerability != null) __obj.updateDynamic("vulnerability")(vulnerability.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOccurrence]
  }
}

