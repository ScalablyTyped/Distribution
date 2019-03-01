package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeProtocols extends js.Object {
  var file: js.UndefOr[scala.Boolean] = js.undefined
  var http: js.UndefOr[scala.Boolean] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var javascript: js.UndefOr[scala.Boolean] = js.undefined
}

object SafeProtocols {
  @scala.inline
  def apply(
    file: js.UndefOr[scala.Boolean] = js.undefined,
    http: js.UndefOr[scala.Boolean] = js.undefined,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    javascript: js.UndefOr[scala.Boolean] = js.undefined
  ): SafeProtocols = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (!js.isUndefined(javascript)) __obj.updateDynamic("javascript")(javascript)
    __obj.asInstanceOf[SafeProtocols]
  }
}

