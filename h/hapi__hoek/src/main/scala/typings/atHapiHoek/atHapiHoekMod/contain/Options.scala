package typings.atHapiHoek.atHapiHoekMod.contain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Perform a deep comparison.
    *
    * @default false
    */
  val deep: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow only one occurrence of each value.
    *
    * @default false
    */
  val once: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow only values explicitly listed.
    *
    * @default false
    */
  val only: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow partial match.
    *
    * @default false
    */
  val part: js.UndefOr[Boolean] = js.undefined
  /**
    * Include symbol properties.
    *
    * @default true
    */
  val symbols: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    only: js.UndefOr[Boolean] = js.undefined,
    part: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(part)) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

