package typings
package atHapiBoomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(
    message: java.lang.String = null,
    `override`: js.UndefOr[scala.Boolean] = js.undefined,
    statusCode: scala.Int | scala.Double = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Message]
  }
}

