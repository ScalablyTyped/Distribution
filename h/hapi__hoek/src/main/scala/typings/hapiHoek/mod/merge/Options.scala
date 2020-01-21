package typings.hapiHoek.mod.merge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When true, array value from `source` is merged with the existing value in `target`.
    *
    * @default false
    */
  val mergeArrays: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, null value from `source` overrides existing value in `target`.
    *
    * @default true
    */
  val nullOverride: js.UndefOr[Boolean] = js.undefined
  /**
    * Compare symbol properties.
    *
    * @default true
    */
  val symbols: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    mergeArrays: js.UndefOr[Boolean] = js.undefined,
    nullOverride: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergeArrays)) __obj.updateDynamic("mergeArrays")(mergeArrays.asInstanceOf[js.Any])
    if (!js.isUndefined(nullOverride)) __obj.updateDynamic("nullOverride")(nullOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

