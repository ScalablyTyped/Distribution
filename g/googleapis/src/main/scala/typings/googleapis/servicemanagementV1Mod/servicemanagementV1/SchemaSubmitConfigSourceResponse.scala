package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for SubmitConfigSource method.
  */
@js.native
trait SchemaSubmitConfigSourceResponse extends js.Object {
  /**
    * The generated service configuration.
    */
  var serviceConfig: js.UndefOr[SchemaService] = js.native
}

object SchemaSubmitConfigSourceResponse {
  @scala.inline
  def apply(): SchemaSubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitConfigSourceResponse]
  }
  @scala.inline
  implicit class SchemaSubmitConfigSourceResponseOps[Self <: SchemaSubmitConfigSourceResponse] (val x: Self) extends AnyVal {
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
    def setServiceConfig(value: SchemaService): Self = this.set("serviceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfig: Self = this.set("serviceConfig", js.undefined)
  }
  
}

