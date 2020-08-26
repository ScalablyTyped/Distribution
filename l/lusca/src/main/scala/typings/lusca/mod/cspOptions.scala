package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cspOptions extends js.Object {
  var policy: js.UndefOr[String | js.Object | (js.Array[js.Object | String])] = js.native
  var reportOnly: js.UndefOr[Boolean] = js.native
  var reportUri: js.UndefOr[String] = js.native
  var scriptNonce: js.UndefOr[Boolean] = js.native
  var styleNonce: js.UndefOr[Boolean] = js.native
}

object cspOptions {
  @scala.inline
  def apply(): cspOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cspOptions]
  }
  @scala.inline
  implicit class cspOptionsOps[Self <: cspOptions] (val x: Self) extends AnyVal {
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
    def setPolicyVarargs(value: (js.Object | String)*): Self = this.set("policy", js.Array(value :_*))
    @scala.inline
    def setPolicy(value: String | js.Object | (js.Array[js.Object | String])): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setReportOnly(value: Boolean): Self = this.set("reportOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportOnly: Self = this.set("reportOnly", js.undefined)
    @scala.inline
    def setReportUri(value: String): Self = this.set("reportUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUri: Self = this.set("reportUri", js.undefined)
    @scala.inline
    def setScriptNonce(value: Boolean): Self = this.set("scriptNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptNonce: Self = this.set("scriptNonce", js.undefined)
    @scala.inline
    def setStyleNonce(value: Boolean): Self = this.set("styleNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleNonce: Self = this.set("styleNonce", js.undefined)
  }
  
}

