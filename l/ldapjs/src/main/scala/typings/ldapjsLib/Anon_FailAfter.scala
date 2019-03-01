package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailAfter extends js.Object {
  var failAfter: js.UndefOr[scala.Double] = js.undefined
  var initialDelay: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FailAfter {
  @scala.inline
  def apply(
    failAfter: scala.Int | scala.Double = null,
    initialDelay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null
  ): Anon_FailAfter = {
    val __obj = js.Dynamic.literal()
    if (failAfter != null) __obj.updateDynamic("failAfter")(failAfter.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailAfter]
  }
}

