package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.EnterpriseProjectIntegration>> */
@js.native
trait PartialReadonlyEnterprise extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var keyId: js.UndefOr[Double] = js.native
  var orgId: js.UndefOr[String] = js.native
  var productKey: js.UndefOr[String] = js.native
  var registries: js.UndefOr[js.Array[String]] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialReadonlyEnterprise {
  @scala.inline
  def apply(): PartialReadonlyEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyEnterprise]
  }
  @scala.inline
  implicit class PartialReadonlyEnterpriseOps[Self <: PartialReadonlyEnterprise] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKeyId(value: Double): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setOrgId(value: String): Self = this.set("orgId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgId: Self = this.set("orgId", js.undefined)
    @scala.inline
    def setProductKey(value: String): Self = this.set("productKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductKey: Self = this.set("productKey", js.undefined)
    @scala.inline
    def setRegistriesVarargs(value: String*): Self = this.set("registries", js.Array(value :_*))
    @scala.inline
    def setRegistries(value: js.Array[String]): Self = this.set("registries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistries: Self = this.set("registries", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

