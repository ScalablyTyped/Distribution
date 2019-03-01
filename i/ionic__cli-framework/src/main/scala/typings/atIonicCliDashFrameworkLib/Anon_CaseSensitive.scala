package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[scala.Boolean] = js.undefined): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

