package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mobile device compromised alert. Derived from audit logs.
  */
@js.native
trait SchemaDeviceCompromised extends js.Object {
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaDeviceCompromisedSecurityDetail]] = js.native
}

object SchemaDeviceCompromised {
  @scala.inline
  def apply(email: String = null, events: js.Array[SchemaDeviceCompromisedSecurityDetail] = null): SchemaDeviceCompromised = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceCompromised]
  }
}

