package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine extends js.Object {
  var _DEFAULT_TIMEOUT_INTERVAL: js.UndefOr[Double] = js.undefined
  var addMatchers: js.Function
}

object Jasmine {
  @scala.inline
  def apply(addMatchers: js.Function, _DEFAULT_TIMEOUT_INTERVAL: Int | Double = null): Jasmine = {
    val __obj = js.Dynamic.literal(addMatchers = addMatchers.asInstanceOf[js.Any])
    if (_DEFAULT_TIMEOUT_INTERVAL != null) __obj.updateDynamic("_DEFAULT_TIMEOUT_INTERVAL")(_DEFAULT_TIMEOUT_INTERVAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
}

