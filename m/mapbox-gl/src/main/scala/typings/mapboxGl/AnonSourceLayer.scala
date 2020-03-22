package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceLayer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var sourceLayer: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object AnonSourceLayer {
  @scala.inline
  def apply(
    filter: js.Array[_] = null,
    sourceLayer: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): AnonSourceLayer = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceLayer]
  }
}

