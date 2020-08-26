package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsGetAccessibleGmbAccountsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaLiasettingsGetAccessibleGmbAccountsResponse {
  @scala.inline
  def apply(): SchemaLiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  }
  @scala.inline
  implicit class SchemaLiasettingsGetAccessibleGmbAccountsResponseOps[Self <: SchemaLiasettingsGetAccessibleGmbAccountsResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setGmbAccountsVarargs(value: SchemaGmbAccountsGmbAccount*): Self = this.set("gmbAccounts", js.Array(value :_*))
    @scala.inline
    def setGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = this.set("gmbAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmbAccounts: Self = this.set("gmbAccounts", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

