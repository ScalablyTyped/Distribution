package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment
  * variables with.  The contents of the target ConfigMap&#39;s Data field will
  * represent the key-value pairs as environment variables.
  */
@js.native
trait SchemaConfigMapEnvSource extends js.Object {
  /**
    * The ConfigMap to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.native
  /**
    * Specify whether the ConfigMap must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}

object SchemaConfigMapEnvSource {
  @scala.inline
  def apply(): SchemaConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigMapEnvSource]
  }
  @scala.inline
  implicit class SchemaConfigMapEnvSourceOps[Self <: SchemaConfigMapEnvSource] (val x: Self) extends AnyVal {
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
    def setLocalObjectReference(value: SchemaLocalObjectReference): Self = this.set("localObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalObjectReference: Self = this.set("localObjectReference", js.undefined)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
  
}

