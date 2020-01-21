package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plan message describes a Service Plan.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1Plan extends js.Object {
  /**
    * Specifies whether instances of the service can be bound to applications.
    * If not specified, `Service.bindable` will be presumed.
    */
  var bindable: js.UndefOr[Boolean] = js.native
  /**
    * Textual description of the plan. Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the service is free.
    */
  var free: js.UndefOr[Boolean] = js.native
  /**
    * ID is a globally unique identifier used to uniquely identify the plan.
    * User must make no presumption about the format of this field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * User friendly name of the plan. The name must be globally unique within
    * GCP project. Note, which is different from (&quot;This must be globally
    * unique within a platform marketplace&quot;).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Schema definitions for service instances and bindings for the plan.
    */
  var schemas: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1Plan {
  @scala.inline
  def apply(
    bindable: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    free: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    schemas: StringDictionary[js.Any] = null
  ): SchemaGoogleCloudServicebrokerV1alpha1Plan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bindable)) __obj.updateDynamic("bindable")(bindable.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(free)) __obj.updateDynamic("free")(free.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Plan]
  }
}

