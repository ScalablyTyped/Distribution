package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for batch delete held accounts.
  */
@js.native
trait SchemaRemoveHeldAccountsResponse extends js.Object {
  /**
    * A list of statuses for deleted accounts. Results have the same order as
    * the request.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaRemoveHeldAccountsResponse {
  @scala.inline
  def apply(): SchemaRemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsResponse]
  }
  @scala.inline
  implicit class SchemaRemoveHeldAccountsResponseOps[Self <: SchemaRemoveHeldAccountsResponse] (val x: Self) extends AnyVal {
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
    def setStatusesVarargs(value: SchemaStatus*): Self = this.set("statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: js.Array[SchemaStatus]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
  }
  
}

