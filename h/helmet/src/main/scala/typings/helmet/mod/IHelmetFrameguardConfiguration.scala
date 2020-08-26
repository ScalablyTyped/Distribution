package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetFrameguardConfiguration extends js.Object {
  var action: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
}

object IHelmetFrameguardConfiguration {
  @scala.inline
  def apply(): IHelmetFrameguardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetFrameguardConfiguration]
  }
  @scala.inline
  implicit class IHelmetFrameguardConfigurationOps[Self <: IHelmetFrameguardConfiguration] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
  }
  
}

