package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account create request.
  */
@js.native
trait SchemaCreateServiceAccountRequest extends js.Object {
  /**
    * Required. The account id that is used to generate the service account
    * email address and a stable unique id. It is unique within a project, must
    * be 6-30 characters long, and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ServiceAccount resource to create. Currently, only the following
    * values are user assignable: `display_name` .
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
}

object SchemaCreateServiceAccountRequest {
  @scala.inline
  def apply(): SchemaCreateServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateServiceAccountRequest]
  }
  @scala.inline
  implicit class SchemaCreateServiceAccountRequestOps[Self <: SchemaCreateServiceAccountRequest] (val x: Self) extends AnyVal {
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
    def setServiceAccount(value: SchemaServiceAccount): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
  }
  
}

