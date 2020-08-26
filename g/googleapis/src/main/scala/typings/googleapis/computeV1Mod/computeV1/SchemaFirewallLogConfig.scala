package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available logging options for a firewall rule.
  */
@js.native
trait SchemaFirewallLogConfig extends js.Object {
  /**
    * This field denotes whether to enable logging for a particular firewall
    * rule.
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object SchemaFirewallLogConfig {
  @scala.inline
  def apply(): SchemaFirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallLogConfig]
  }
  @scala.inline
  implicit class SchemaFirewallLogConfigOps[Self <: SchemaFirewallLogConfig] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
  }
  
}

