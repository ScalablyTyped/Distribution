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
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Plan]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1PlanOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1Plan] (val x: Self) extends AnyVal {
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
    def setBindable(value: Boolean): Self = this.set("bindable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindable: Self = this.set("bindable", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFree(value: Boolean): Self = this.set("free", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFree: Self = this.set("free", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSchemas(value: StringDictionary[js.Any]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
  
}

