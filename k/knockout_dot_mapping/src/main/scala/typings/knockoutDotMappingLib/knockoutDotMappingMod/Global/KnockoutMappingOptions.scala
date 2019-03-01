package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingOptions extends js.Object {
  var copy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, scala.Unit]] = js.undefined
  var deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var mappedProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, scala.Unit]] = js.undefined
}

object KnockoutMappingOptions {
  @scala.inline
  def apply(
    copy: js.Array[java.lang.String] = null,
    create: js.Function1[/* options */ KnockoutMappingCreateOptions, scala.Unit] = null,
    deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    key: js.Function1[/* data */ js.Any, _] = null,
    mappedProperties: js.Array[java.lang.String] = null,
    update: js.Function1[/* options */ KnockoutMappingUpdateOptions, scala.Unit] = null
  ): KnockoutMappingOptions = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (include != null) __obj.updateDynamic("include")(include)
    if (key != null) __obj.updateDynamic("key")(key)
    if (mappedProperties != null) __obj.updateDynamic("mappedProperties")(mappedProperties)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[KnockoutMappingOptions]
  }
}

