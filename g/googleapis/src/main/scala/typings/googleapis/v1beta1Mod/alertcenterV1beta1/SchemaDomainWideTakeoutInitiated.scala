package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A takeout operation for the entire domain was initiated by an admin.
  * Derived from audit logs.
  */
@js.native
trait SchemaDomainWideTakeoutInitiated extends js.Object {
  /**
    * The email of the admin who initiated the takeout.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The takeout request ID.
    */
  var takeoutRequestId: js.UndefOr[String] = js.native
}

object SchemaDomainWideTakeoutInitiated {
  @scala.inline
  def apply(email: String = null, takeoutRequestId: String = null): SchemaDomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (takeoutRequestId != null) __obj.updateDynamic("takeoutRequestId")(takeoutRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainWideTakeoutInitiated]
  }
}

