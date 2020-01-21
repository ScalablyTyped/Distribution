package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

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
  def apply(authorization: SchemaAuthorizationConfig = null): SchemaExperimental = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExperimental]
  }
}

