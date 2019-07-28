package typings.hapiDashAuthDashBearerDashToken.hapiDashAuthDashBearerDashTokenMod.hapiMod

import typings.hapiDashAuthDashBearerDashToken.hapiDashAuthDashBearerDashTokenMod.SchemaOptions
import typings.hapiDashAuthDashBearerDashToken.hapiDashAuthDashBearerDashTokenStrings.`bearer-access-token`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy_beareraccesstoken: (String, `bearer-access-token`, SchemaOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(js.Any.fromFunction3(strategy_beareraccesstoken))
    __obj.asInstanceOf[ServerAuth]
  }
}

