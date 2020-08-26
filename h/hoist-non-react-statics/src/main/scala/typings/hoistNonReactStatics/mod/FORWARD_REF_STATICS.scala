package typings.hoistNonReactStatics.mod

import typings.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FORWARD_REF_STATICS extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: `true` = js.native
  var defaultProps: `true` = js.native
  var displayName: `true` = js.native
  var propTypes: `true` = js.native
  var render: `true` = js.native
}

object FORWARD_REF_STATICS {
  @scala.inline
  def apply(
    DollarDollartypeof: `true`,
    defaultProps: `true`,
    displayName: `true`,
    propTypes: `true`,
    render: `true`
  ): FORWARD_REF_STATICS = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[FORWARD_REF_STATICS]
  }
  @scala.inline
  implicit class FORWARD_REF_STATICSOps[Self <: FORWARD_REF_STATICS] (val x: Self) extends AnyVal {
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
    def setDollarDollartypeof(value: `true`): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultProps(value: `true`): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: `true`): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropTypes(value: `true`): Self = this.set("propTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: `true`): Self = this.set("render", value.asInstanceOf[js.Any])
  }
  
}

