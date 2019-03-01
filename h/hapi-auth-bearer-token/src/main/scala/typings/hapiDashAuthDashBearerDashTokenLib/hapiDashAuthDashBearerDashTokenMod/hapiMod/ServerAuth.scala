package typings
package hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def `strategy_bearer-access-token`(
    name: java.lang.String,
    scheme: hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenLibStrings.`bearer-access-token`,
    options: hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.BearerTokenNs.SchemaOptions
  ): scala.Unit
}

object ServerAuth {
  @scala.inline
  def apply(
    `strategy_bearer-access-token`: js.Function3[
      java.lang.String, 
      hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenLibStrings.`bearer-access-token`, 
      hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod.BearerTokenNs.SchemaOptions, 
      scala.Unit
    ]
  ): ServerAuth = {
    val __obj = js.Dynamic.literal(`strategy_bearer-access-token` = `strategy_bearer-access-token`)
  
    __obj.asInstanceOf[ServerAuth]
  }
}

