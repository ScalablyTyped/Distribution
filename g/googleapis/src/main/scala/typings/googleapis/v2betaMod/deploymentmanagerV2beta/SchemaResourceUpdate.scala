package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.googleapis.AnonCode
import typings.googleapis.AnonErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourceUpdate extends js.Object {
  /**
    * The Access Control Policy to set on this resource after updating the
    * resource itself.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.native
  /**
    * Output only. If errors are generated during update of the resource, this
    * field will be populated.
    */
  var error: js.UndefOr[AnonErrorsArray] = js.native
  /**
    * Output only. The expanded properties of the resource with reference
    * values expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  /**
    * Output only. The intent of the resource: PREVIEW, UPDATE, or CANCEL.
    */
  var intent: js.UndefOr[String] = js.native
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  /**
    * Output only. The set of updated properties for this resource, before
    * references are expanded. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  /**
    * Output only. The state of the resource.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaResourceUpdate {
  @scala.inline
  def apply(
    accessControl: SchemaResourceAccessControl = null,
    error: AnonErrorsArray = null,
    finalProperties: String = null,
    intent: String = null,
    manifest: String = null,
    properties: String = null,
    state: String = null,
    warnings: js.Array[AnonCode] = null
  ): SchemaResourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (finalProperties != null) __obj.updateDynamic("finalProperties")(finalProperties.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceUpdate]
  }
}

