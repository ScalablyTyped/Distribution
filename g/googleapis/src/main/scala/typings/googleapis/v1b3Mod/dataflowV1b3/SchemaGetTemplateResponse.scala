package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a GetTemplate request.
  */
@js.native
trait SchemaGetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available parameters,
    * etc.
    */
  var metadata: js.UndefOr[SchemaTemplateMetadata] = js.native
  /**
    * The status of the get template request. Any problems with the request
    * will be indicated in the error_details.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaGetTemplateResponse {
  @scala.inline
  def apply(): SchemaGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetTemplateResponse]
  }
  @scala.inline
  implicit class SchemaGetTemplateResponseOps[Self <: SchemaGetTemplateResponse] (val x: Self) extends AnyVal {
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
    def setMetadata(value: SchemaTemplateMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

