package typings.hoistNonReactStatics.mod

import typings.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MEMO_STATICS extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: `true`
  var compare: `true`
  var defaultProps: `true`
  var displayName: `true`
  var propTypes: `true`
  var `type`: `true`
}

object MEMO_STATICS {
  @scala.inline
  def apply(
    DollarDollartypeof: `true`,
    compare: `true`,
    defaultProps: `true`,
    displayName: `true`,
    propTypes: `true`,
    `type`: `true`
  ): MEMO_STATICS = {
    val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MEMO_STATICS]
  }
}

