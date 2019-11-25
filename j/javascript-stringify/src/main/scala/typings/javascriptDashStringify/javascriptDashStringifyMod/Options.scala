package typings.javascriptDashStringify.javascriptDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var maxDepth: js.UndefOr[Double] = js.undefined
  var maxValues: js.UndefOr[Double] = js.undefined
  var references: js.UndefOr[Boolean] = js.undefined
  var skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maxDepth: Int | Double = null,
    maxValues: Int | Double = null,
    references: js.UndefOr[Boolean] = js.undefined,
    skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxValues != null) __obj.updateDynamic("maxValues")(maxValues.asInstanceOf[js.Any])
    if (!js.isUndefined(references)) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUndefinedProperties)) __obj.updateDynamic("skipUndefinedProperties")(skipUndefinedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

