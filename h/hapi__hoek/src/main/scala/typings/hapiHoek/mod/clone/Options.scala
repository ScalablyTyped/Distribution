package typings.hapiHoek.mod.clone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Shallow clone the specified keys.
    *
    * @default undefined
    */
  val shallow: js.UndefOr[(js.Array[js.Array[String] | String]) | Boolean] = js.undefined
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
    shallow: (js.Array[js.Array[String] | String]) | Boolean = null,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (shallow != null) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

