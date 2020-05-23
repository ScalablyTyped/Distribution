package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    filter: js.Array[_] = null,
    layers: js.Array[String] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

