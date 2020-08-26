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
  def apply(): SchemaDeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromised]
  }
  @scala.inline
  implicit class SchemaDeviceCompromisedOps[Self <: SchemaDeviceCompromised] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEventsVarargs(value: SchemaDeviceCompromisedSecurityDetail*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[SchemaDeviceCompromisedSecurityDetail]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
  
}

