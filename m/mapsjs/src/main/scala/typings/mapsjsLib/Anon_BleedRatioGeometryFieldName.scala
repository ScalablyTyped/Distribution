package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BleedRatioGeometryFieldName extends js.Object {
  var bleedRatio: js.UndefOr[scala.Double] = js.undefined
  var geometryFieldName: java.lang.String
  var valueFieldNames: js.Array[java.lang.String]
}

object Anon_BleedRatioGeometryFieldName {
  @scala.inline
  def apply(
    geometryFieldName: java.lang.String,
    valueFieldNames: js.Array[java.lang.String],
    bleedRatio: scala.Int | scala.Double = null
  ): Anon_BleedRatioGeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName, valueFieldNames = valueFieldNames)
    if (bleedRatio != null) __obj.updateDynamic("bleedRatio")(bleedRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BleedRatioGeometryFieldName]
  }
}

