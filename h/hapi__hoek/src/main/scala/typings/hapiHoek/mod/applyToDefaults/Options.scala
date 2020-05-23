package typings.hapiHoek.mod.applyToDefaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When true, null value from `source` overrides existing value in `target`.
    *
    * @default true
    */
  val nullOverride: js.UndefOr[Boolean] = js.undefined
  /**
    * Shallow clone the specified keys.
    *
    * @default undefined
    */
  val shallow: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    nullOverride: js.UndefOr[Boolean] = js.undefined,
    shallow: js.Array[js.Array[String] | String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nullOverride)) __obj.updateDynamic("nullOverride")(nullOverride.get.asInstanceOf[js.Any])
    if (shallow != null) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

