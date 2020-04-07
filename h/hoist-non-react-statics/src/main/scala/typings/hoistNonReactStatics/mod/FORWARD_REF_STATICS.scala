package typings.hoistNonReactStatics.mod

import typings.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FORWARD_REF_STATICS extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: `true`
  var defaultProps: `true`
  var displayName: `true`
  var propTypes: `true`
  var render: `true`
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
}

