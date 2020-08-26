package typings.lusca.mod

import typings.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Documentation declares that:
  *~ Setting any value to false will disable it.
  */
@js.native
trait LuscaOptions extends js.Object {
  var csp: js.UndefOr[cspOptions | `false`] = js.native
  var csrf: js.UndefOr[csrfOptions | Boolean] = js.native
  var hsts: js.UndefOr[hstsOptions | `false`] = js.native
  var nosniff: js.UndefOr[Boolean] = js.native
  var p3p: js.UndefOr[String | `false`] = js.native
  var referrerPolicy: js.UndefOr[String | `false`] = js.native
  var xframe: js.UndefOr[String | `false`] = js.native
  var xssProtection: js.UndefOr[xssProtectionOptions | Boolean] = js.native
}

object LuscaOptions {
  @scala.inline
  def apply(): LuscaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LuscaOptions]
  }
  @scala.inline
  implicit class LuscaOptionsOps[Self <: LuscaOptions] (val x: Self) extends AnyVal {
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
    def setCsp(value: cspOptions | `false`): Self = this.set("csp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    @scala.inline
    def setCsrf(value: csrfOptions | Boolean): Self = this.set("csrf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsrf: Self = this.set("csrf", js.undefined)
    @scala.inline
    def setHsts(value: hstsOptions | `false`): Self = this.set("hsts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsts: Self = this.set("hsts", js.undefined)
    @scala.inline
    def setNosniff(value: Boolean): Self = this.set("nosniff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNosniff: Self = this.set("nosniff", js.undefined)
    @scala.inline
    def setP3p(value: String | `false`): Self = this.set("p3p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP3p: Self = this.set("p3p", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: String | `false`): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setXframe(value: String | `false`): Self = this.set("xframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXframe: Self = this.set("xframe", js.undefined)
    @scala.inline
    def setXssProtection(value: xssProtectionOptions | Boolean): Self = this.set("xssProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXssProtection: Self = this.set("xssProtection", js.undefined)
  }
  
}

