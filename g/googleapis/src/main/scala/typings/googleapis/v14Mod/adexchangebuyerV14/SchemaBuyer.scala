package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBuyer extends js.Object {
  /**
    * Adx account id of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
}

object SchemaBuyer {
  @scala.inline
  def apply(): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuyer]
  }
  @scala.inline
  implicit class SchemaBuyerOps[Self <: SchemaBuyer] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
  }
  
}

