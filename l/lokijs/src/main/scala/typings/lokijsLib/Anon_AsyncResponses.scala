package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncResponses extends js.Object {
  var asyncResponses: js.UndefOr[scala.Boolean] = js.undefined
  var asyncTimeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AsyncResponses {
  @scala.inline
  def apply(
    asyncResponses: js.UndefOr[scala.Boolean] = js.undefined,
    asyncTimeout: scala.Int | scala.Double = null
  ): Anon_AsyncResponses = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncResponses)) __obj.updateDynamic("asyncResponses")(asyncResponses)
    if (asyncTimeout != null) __obj.updateDynamic("asyncTimeout")(asyncTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncResponses]
  }
}

