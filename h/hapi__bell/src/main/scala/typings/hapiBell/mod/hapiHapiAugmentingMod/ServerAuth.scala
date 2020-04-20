package typings.hapiBell.mod.hapiHapiAugmentingMod

import typings.hapiBell.hapiBellStrings.bell
import typings.hapiBell.mod.BellOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, bell, BellOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
    __obj.asInstanceOf[ServerAuth]
  }
}

