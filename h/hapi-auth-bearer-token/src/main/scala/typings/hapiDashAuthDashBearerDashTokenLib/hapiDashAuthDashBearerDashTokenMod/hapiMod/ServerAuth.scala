package typings
package hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_beareraccesstoken(
    name: java.lang.String,
    scheme: hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenLibStrings.`bearer-access-token`,
    options: hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.SchemaOptions
  ): scala.Unit
}

object ServerAuth {
  @scala.inline
  def apply(
    strategy_beareraccesstoken: (java.lang.String, hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenLibStrings.`bearer-access-token`, hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.SchemaOptions) => scala.Unit
  ): ServerAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(js.Any.fromFunction3(strategy_beareraccesstoken))
    __obj.asInstanceOf[ServerAuth]
  }
}

