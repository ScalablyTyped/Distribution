package typings.atHapiBell.atHapiBellMod.atHapiHapiMod

import typings.atHapiBell.atHapiBellMod.BellOptions
import typings.atHapiBell.atHapiBellStrings.`try`
import typings.atHapiBell.atHapiBellStrings.bell
import typings.atHapiBell.atHapiBellStrings.optional
import typings.atHapiBell.atHapiBellStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  def strategy(name: String, scheme: bell, mode: `try`, options: BellOptions): Unit = js.native
  def strategy(name: String, scheme: bell, mode: optional, options: BellOptions): Unit = js.native
  def strategy(name: String, scheme: bell, mode: required, options: BellOptions): Unit = js.native
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, mode: Boolean, options: BellOptions): Unit = js.native
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit = js.native
}

