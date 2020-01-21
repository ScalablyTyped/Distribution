package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeploymentUpdate extends js.Object {
  /**
    * Output only. The user-provided default credential to use when deploying
    * this preview.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  /**
    * Output only. An optional user-provided description of the deployment
    * after the current update has been applied.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. Map of labels; provided by the client when the resource is
    * created or updated. Specifically: Label keys must be between 1 and 63
    * characters long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaDeploymentUpdateLabelEntry]] = js.native
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this deployment.
    */
  var manifest: js.UndefOr[String] = js.native
}

object SchemaDeploymentUpdate {
  @scala.inline
  def apply(
    credential: SchemaCredential = null,
    description: String = null,
    labels: js.Array[SchemaDeploymentUpdateLabelEntry] = null,
    manifest: String = null
  ): SchemaDeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeploymentUpdate]
  }
}

