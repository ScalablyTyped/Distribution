package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailAfter extends js.Object {
  var failAfter: js.UndefOr[Double] = js.undefined
  var initialDelay: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
}

object Anon_FailAfter {
  @scala.inline
  def apply(failAfter: Int | Double = null, initialDelay: Int | Double = null, maxDelay: Int | Double = null): Anon_FailAfter = {
    val __obj = js.Dynamic.literal()
    if (failAfter != null) __obj.updateDynamic("failAfter")(failAfter.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailAfter]
  }
}

