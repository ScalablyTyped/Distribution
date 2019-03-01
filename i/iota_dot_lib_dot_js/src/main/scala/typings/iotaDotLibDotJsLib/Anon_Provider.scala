package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: java.lang.String
  var sandbox: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Provider {
  @scala.inline
  def apply(
    provider: java.lang.String,
    sandbox: js.UndefOr[scala.Boolean] = js.undefined,
    token: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Provider]
  }
}

