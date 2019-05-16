package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingStandardOptions extends js.Object {
  var copy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Undocumented
  var deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mappedProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var observe: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object KnockoutMappingStandardOptions {
  @scala.inline
  def apply(
    copy: js.Array[java.lang.String] = null,
    deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    mappedProperties: js.Array[java.lang.String] = null,
    observe: js.Array[java.lang.String] = null
  ): KnockoutMappingStandardOptions = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (include != null) __obj.updateDynamic("include")(include)
    if (mappedProperties != null) __obj.updateDynamic("mappedProperties")(mappedProperties)
    if (observe != null) __obj.updateDynamic("observe")(observe)
    __obj.asInstanceOf[KnockoutMappingStandardOptions]
  }
}

