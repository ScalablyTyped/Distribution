package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetPermittedCrossDomainPoliciesConfiguration extends js.Object {
  var permittedPolicies: js.UndefOr[String] = js.native
}

object IHelmetPermittedCrossDomainPoliciesConfiguration {
  @scala.inline
  def apply(): IHelmetPermittedCrossDomainPoliciesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetPermittedCrossDomainPoliciesConfiguration]
  }
  @scala.inline
  implicit class IHelmetPermittedCrossDomainPoliciesConfigurationOps[Self <: IHelmetPermittedCrossDomainPoliciesConfiguration] (val x: Self) extends AnyVal {
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
    def setPermittedPolicies(value: String): Self = this.set("permittedPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermittedPolicies: Self = this.set("permittedPolicies", js.undefined)
  }
  
}

