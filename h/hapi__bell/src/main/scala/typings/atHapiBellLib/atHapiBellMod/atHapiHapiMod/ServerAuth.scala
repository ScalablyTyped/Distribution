package typings
package atHapiBellLib.atHapiBellMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  def strategy(
    name: java.lang.String,
    scheme: atHapiBellLib.atHapiBellLibStrings.bell,
    mode: atHapiBellLib.atHapiBellLibStrings.`try`,
    options: atHapiBellLib.atHapiBellMod.BellOptions
  ): scala.Unit = js.native
  def strategy(
    name: java.lang.String,
    scheme: atHapiBellLib.atHapiBellLibStrings.bell,
    mode: atHapiBellLib.atHapiBellLibStrings.optional,
    options: atHapiBellLib.atHapiBellMod.BellOptions
  ): scala.Unit = js.native
  def strategy(
    name: java.lang.String,
    scheme: atHapiBellLib.atHapiBellLibStrings.bell,
    mode: atHapiBellLib.atHapiBellLibStrings.required,
    options: atHapiBellLib.atHapiBellMod.BellOptions
  ): scala.Unit = js.native
  @JSName("strategy")
  def strategy_bell(
    name: java.lang.String,
    scheme: atHapiBellLib.atHapiBellLibStrings.bell,
    mode: scala.Boolean,
    options: atHapiBellLib.atHapiBellMod.BellOptions
  ): scala.Unit = js.native
  @JSName("strategy")
  def strategy_bell(
    name: java.lang.String,
    scheme: atHapiBellLib.atHapiBellLibStrings.bell,
    options: atHapiBellLib.atHapiBellMod.BellOptions
  ): scala.Unit = js.native
}

