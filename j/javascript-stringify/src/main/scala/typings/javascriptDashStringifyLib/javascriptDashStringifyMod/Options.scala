package typings
package javascriptDashStringifyLib.javascriptDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var maxValues: js.UndefOr[scala.Double] = js.undefined
  var references: js.UndefOr[scala.Boolean] = js.undefined
  var skipUndefinedProperties: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maxDepth: scala.Int | scala.Double = null,
    maxValues: scala.Int | scala.Double = null,
    references: js.UndefOr[scala.Boolean] = js.undefined,
    skipUndefinedProperties: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxValues != null) __obj.updateDynamic("maxValues")(maxValues.asInstanceOf[js.Any])
    if (!js.isUndefined(references)) __obj.updateDynamic("references")(references)
    if (!js.isUndefined(skipUndefinedProperties)) __obj.updateDynamic("skipUndefinedProperties")(skipUndefinedProperties)
    __obj.asInstanceOf[Options]
  }
}

