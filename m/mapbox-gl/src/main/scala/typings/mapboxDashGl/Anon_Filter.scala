package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: js.Array[_] = null,
    layers: js.Array[String] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Anon_Filter]
  }
}

