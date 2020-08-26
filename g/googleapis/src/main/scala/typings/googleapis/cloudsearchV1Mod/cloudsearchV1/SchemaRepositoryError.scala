package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Errors when the connector is communicating to the source repository.
  */
@js.native
trait SchemaRepositoryError extends js.Object {
  /**
    * Message that describes the error. The maximum allowable length of the
    * message is 8192 characters.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Error codes.  Matches the definition of HTTP status codes.
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  /**
    * Type of error.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRepositoryError {
  @scala.inline
  def apply(): SchemaRepositoryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepositoryError]
  }
  @scala.inline
  implicit class SchemaRepositoryErrorOps[Self <: SchemaRepositoryError] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

