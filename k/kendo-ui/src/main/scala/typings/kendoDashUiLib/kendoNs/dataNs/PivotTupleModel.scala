package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTupleModel extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var children: js.Array[PivotTupleModel]
  var hasChildren: js.UndefOr[scala.Boolean] = js.undefined
  var hierarchy: js.UndefOr[java.lang.String] = js.undefined
  var levelName: js.UndefOr[java.lang.String] = js.undefined
  var levelNum: scala.Double
  var name: java.lang.String
}

object PivotTupleModel {
  @scala.inline
  def apply(
    children: js.Array[PivotTupleModel],
    levelNum: scala.Double,
    name: java.lang.String,
    caption: java.lang.String = null,
    hasChildren: js.UndefOr[scala.Boolean] = js.undefined,
    hierarchy: java.lang.String = null,
    levelName: java.lang.String = null
  ): PivotTupleModel = {
    val __obj = js.Dynamic.literal(children = children, levelNum = levelNum, name = name)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren)
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    if (levelName != null) __obj.updateDynamic("levelName")(levelName)
    __obj.asInstanceOf[PivotTupleModel]
  }
}

