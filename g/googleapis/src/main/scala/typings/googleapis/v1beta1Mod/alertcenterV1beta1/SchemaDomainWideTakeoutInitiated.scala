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
  def apply(): SchemaDomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainWideTakeoutInitiated]
  }
  @scala.inline
  implicit class SchemaDomainWideTakeoutInitiatedOps[Self <: SchemaDomainWideTakeoutInitiated] (val x: Self) extends AnyVal {
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
    def setTakeoutRequestId(value: String): Self = this.set("takeoutRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTakeoutRequestId: Self = this.set("takeoutRequestId", js.undefined)
  }
  
}

