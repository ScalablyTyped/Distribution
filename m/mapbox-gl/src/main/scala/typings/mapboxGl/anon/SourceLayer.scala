package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLayer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var sourceLayer: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object SourceLayer {
  @scala.inline
  def apply(
    filter: js.Array[_] = null,
    sourceLayer: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): SourceLayer = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLayer]
  }
}

