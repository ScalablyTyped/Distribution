package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains error status for each import failure.
  */
@js.native
trait SchemaImportError extends js.Object {
  /**
    * Resource name.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Error status associated with resource.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaImportError {
  @scala.inline
  def apply(): SchemaImportError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportError]
  }
  @scala.inline
  implicit class SchemaImportErrorOps[Self <: SchemaImportError] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

