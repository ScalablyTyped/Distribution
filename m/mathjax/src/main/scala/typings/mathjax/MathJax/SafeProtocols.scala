package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeProtocols extends js.Object {
  var file: js.UndefOr[Boolean] = js.undefined
  var http: js.UndefOr[Boolean] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  var javascript: js.UndefOr[Boolean] = js.undefined
}

object SafeProtocols {
  @scala.inline
  def apply(
    file: js.UndefOr[Boolean] = js.undefined,
    http: js.UndefOr[Boolean] = js.undefined,
    https: js.UndefOr[Boolean] = js.undefined,
    javascript: js.UndefOr[Boolean] = js.undefined
  ): SafeProtocols = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (!js.isUndefined(javascript)) __obj.updateDynamic("javascript")(javascript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeProtocols]
  }
}

