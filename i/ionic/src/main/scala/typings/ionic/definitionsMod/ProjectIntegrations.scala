package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectIntegrations extends js.Object {
  var capacitor: js.UndefOr[ProjectIntegration] = js.native
  var cordova: js.UndefOr[ProjectIntegration] = js.native
  var enterprise: js.UndefOr[EnterpriseProjectIntegration] = js.native
}

object ProjectIntegrations {
  @scala.inline
  def apply(): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegrations]
  }
  @scala.inline
  implicit class ProjectIntegrationsOps[Self <: ProjectIntegrations] (val x: Self) extends AnyVal {
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
    def setCapacitor(value: ProjectIntegration): Self = this.set("capacitor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacitor: Self = this.set("capacitor", js.undefined)
    @scala.inline
    def setCordova(value: ProjectIntegration): Self = this.set("cordova", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCordova: Self = this.set("cordova", js.undefined)
    @scala.inline
    def setEnterprise(value: EnterpriseProjectIntegration): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterprise: Self = this.set("enterprise", js.undefined)
  }
  
}

