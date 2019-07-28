package typings.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod

import typings.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MEMO_STATICS extends js.Object {
  @JSName("$$typeof")
  var $$typeof: `true`
  var compare: `true`
  var defaultProps: `true`
  var displayName: `true`
  var propTypes: `true`
  var `type`: `true`
}

object MEMO_STATICS {
  @scala.inline
  def apply(
    $$typeof: `true`,
    compare: `true`,
    defaultProps: `true`,
    displayName: `true`,
    propTypes: `true`,
    `type`: `true`
  ): MEMO_STATICS = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof, compare = compare, defaultProps = defaultProps, displayName = displayName, propTypes = propTypes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MEMO_STATICS]
  }
}

