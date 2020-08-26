package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSignBlobRequest extends js.Object {
  /**
    * The sequence of service accounts in a delegation chain. Each service
    * account must be granted the `roles/iam.serviceAccountTokenCreator` role
    * on its next service account in the chain. The last service account in the
    * chain must be granted the `roles/iam.serviceAccountTokenCreator` role on
    * the service account that is specified in the `name` field of the request.
    * The delegates must have the following format:
    * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-`
    * wildcard character is required; replacing it with a project ID is
    * invalid.
    */
  var delegates: js.UndefOr[js.Array[String]] = js.native
  /**
    * The bytes to sign.
    */
  var payload: js.UndefOr[String] = js.native
}

object SchemaSignBlobRequest {
  @scala.inline
  def apply(): SchemaSignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobRequest]
  }
  @scala.inline
  implicit class SchemaSignBlobRequestOps[Self <: SchemaSignBlobRequest] (val x: Self) extends AnyVal {
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
    def setDelegatesVarargs(value: String*): Self = this.set("delegates", js.Array(value :_*))
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = this.set("delegates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegates: Self = this.set("delegates", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

