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
  def apply(): SchemaStateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateSponsoredAttack]
  }
  @scala.inline
  implicit class SchemaStateSponsoredAttackOps[Self <: SchemaStateSponsoredAttack] (val x: Self) extends AnyVal {
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
  }
  
}

