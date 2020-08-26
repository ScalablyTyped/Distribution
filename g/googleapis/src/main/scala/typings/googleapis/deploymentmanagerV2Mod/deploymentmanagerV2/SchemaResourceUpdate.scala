package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typings.googleapis.anon.Code
import typings.googleapis.anon.`3`
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
  var error: js.UndefOr[`3`] = js.native
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
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}

object SchemaResourceUpdate {
  @scala.inline
  def apply(): SchemaResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUpdate]
  }
  @scala.inline
  implicit class SchemaResourceUpdateOps[Self <: SchemaResourceUpdate] (val x: Self) extends AnyVal {
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
    def setAccessControl(value: SchemaResourceAccessControl): Self = this.set("accessControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControl: Self = this.set("accessControl", js.undefined)
    @scala.inline
    def setError(value: `3`): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFinalProperties(value: String): Self = this.set("finalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalProperties: Self = this.set("finalProperties", js.undefined)
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setProperties(value: String): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

