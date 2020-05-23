package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryFieldName extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.undefined
  var geometryFieldName: String
  var valueFieldNames: js.Array[String]
}

object GeometryFieldName {
  @scala.inline
  def apply(
    geometryFieldName: String,
    valueFieldNames: js.Array[String],
    bleedRatio: js.UndefOr[Double] = js.undefined
  ): GeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    if (!js.isUndefined(bleedRatio)) __obj.updateDynamic("bleedRatio")(bleedRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryFieldName]
  }
}

