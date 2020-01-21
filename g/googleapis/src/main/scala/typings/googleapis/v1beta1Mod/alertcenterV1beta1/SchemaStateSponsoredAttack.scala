package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A state-sponsored attack alert. Derived from audit logs.
  */
@js.native
trait SchemaStateSponsoredAttack extends js.Object {
  /**
    * The email of the user this incident was created for.
    */
  var email: js.UndefOr[String] = js.native
}

object SchemaStateSponsoredAttack {
  @scala.inline
  def apply(email: String = null): SchemaStateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStateSponsoredAttack]
  }
}

