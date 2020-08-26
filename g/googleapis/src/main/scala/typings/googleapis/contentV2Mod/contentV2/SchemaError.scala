package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error returned by the API.
  */
@js.native
trait SchemaError extends js.Object {
  /**
    * The domain of the error.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A description of the error.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The error code.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaError {
  @scala.inline
  def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  @scala.inline
  implicit class SchemaErrorOps[Self <: SchemaError] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

