package typings.hapiHoek.mod.deepEqual

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Compare functions with difference references by comparing their internal code and properties.
    *
    * @default false
    */
  val deepFunction: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow partial match.
    *
    * @default false
    */
  val part: js.UndefOr[Boolean] = js.undefined
  /**
    * List of object keys to ignore different values of.
    *
    * @default null
    */
  val skip: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
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
    deepFunction: js.UndefOr[Boolean] = js.undefined,
    part: js.UndefOr[Boolean] = js.undefined,
    skip: js.Array[String | js.Symbol] = null,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deepFunction)) __obj.updateDynamic("deepFunction")(deepFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(part)) __obj.updateDynamic("part")(part.get.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

