package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for SubmitConfigSource method.
  */
@js.native
trait SchemaSubmitConfigSourceRequest extends js.Object {
  /**
    * The source configuration for the service.
    */
  var configSource: js.UndefOr[SchemaConfigSource] = js.native
  /**
    * Optional. If set, this will result in the generation of a
    * `google.api.Service` configuration based on the `ConfigSource` provided,
    * but the generated config and the sources will NOT be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object SchemaSubmitConfigSourceRequest {
  @scala.inline
  def apply(): SchemaSubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitConfigSourceRequest]
  }
  @scala.inline
  implicit class SchemaSubmitConfigSourceRequestOps[Self <: SchemaSubmitConfigSourceRequest] (val x: Self) extends AnyVal {
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
    def setConfigSource(value: SchemaConfigSource): Self = this.set("configSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigSource: Self = this.set("configSource", js.undefined)
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
  
}

