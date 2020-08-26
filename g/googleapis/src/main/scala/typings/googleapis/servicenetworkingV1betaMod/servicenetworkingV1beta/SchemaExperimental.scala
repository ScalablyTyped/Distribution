package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Experimental service configuration. These configuration options can only be
  * used by whitelisted users.
  */
@js.native
trait SchemaExperimental extends js.Object {
  /**
    * Authorization configuration.
    */
  var authorization: js.UndefOr[SchemaAuthorizationConfig] = js.native
}

object SchemaExperimental {
  @scala.inline
  def apply(): SchemaExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperimental]
  }
  @scala.inline
  implicit class SchemaExperimentalOps[Self <: SchemaExperimental] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: SchemaAuthorizationConfig): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
  }
  
}

