package typings.atHapiBell.atHapiBellMod.atHapiHapiMod

import typings.atHapiBell.atHapiBellMod.BellOptions
import typings.atHapiBell.atHapiBellStrings.bell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy_bell: (String, bell, BellOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(js.Any.fromFunction3(strategy_bell))
    __obj.asInstanceOf[ServerAuth]
  }
}

