package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var duplicates_timeout: js.UndefOr[Double] = js.native
  var enableTransactions: js.UndefOr[Boolean] = js.native
  var failAfter: js.UndefOr[Double] = js.native
  var request_timeout: js.UndefOr[Double] = js.native
  var response_timeout: js.UndefOr[Double] = js.native
  var socket: js.UndefOr[js.Any] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var useImplicitTransactions: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setDuplicates_timeout(value: Double): Self = this.set("duplicates_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicates_timeout: Self = this.set("duplicates_timeout", js.undefined)
    @scala.inline
    def setEnableTransactions(value: Boolean): Self = this.set("enableTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTransactions: Self = this.set("enableTransactions", js.undefined)
    @scala.inline
    def setFailAfter(value: Double): Self = this.set("failAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailAfter: Self = this.set("failAfter", js.undefined)
    @scala.inline
    def setRequest_timeout(value: Double): Self = this.set("request_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_timeout: Self = this.set("request_timeout", js.undefined)
    @scala.inline
    def setResponse_timeout(value: Double): Self = this.set("response_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_timeout: Self = this.set("response_timeout", js.undefined)
    @scala.inline
    def setSocket(value: js.Any): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setUseImplicitTransactions(value: Boolean): Self = this.set("useImplicitTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseImplicitTransactions: Self = this.set("useImplicitTransactions", js.undefined)
  }
  
}

