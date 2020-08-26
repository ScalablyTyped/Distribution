package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A status detailing the status of each account creation, and the
  * HeldAccount, if successful.
  */
@js.native
trait SchemaAddHeldAccountResult extends js.Object {
  /**
    * If present, this account was successfully created.
    */
  var account: js.UndefOr[SchemaHeldAccount] = js.native
  /**
    * This represents the success status. If failed, check message.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaAddHeldAccountResult {
  @scala.inline
  def apply(): SchemaAddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountResult]
  }
  @scala.inline
  implicit class SchemaAddHeldAccountResultOps[Self <: SchemaAddHeldAccountResult] (val x: Self) extends AnyVal {
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
    def setAccount(value: SchemaHeldAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

