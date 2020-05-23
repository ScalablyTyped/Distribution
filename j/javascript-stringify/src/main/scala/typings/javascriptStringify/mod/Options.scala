package typings.javascriptStringify.mod

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
    maxDepth: js.UndefOr[Double] = js.undefined,
    maxValues: js.UndefOr[Double] = js.undefined,
    references: js.UndefOr[Boolean] = js.undefined,
    skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValues)) __obj.updateDynamic("maxValues")(maxValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(references)) __obj.updateDynamic("references")(references.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUndefinedProperties)) __obj.updateDynamic("skipUndefinedProperties")(skipUndefinedProperties.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

