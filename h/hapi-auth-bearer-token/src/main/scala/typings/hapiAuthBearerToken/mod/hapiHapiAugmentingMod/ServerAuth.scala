package typings.hapiAuthBearerToken.mod.hapiHapiAugmentingMod

import typings.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`
import typings.hapiAuthBearerToken.mod.SchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, `bearer-access-token`, SchemaOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
  
    __obj.asInstanceOf[ServerAuth]
  }
}

