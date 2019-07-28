package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTupleModel extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var children: js.Array[PivotTupleModel]
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  var hierarchy: js.UndefOr[String] = js.undefined
  var levelName: js.UndefOr[String] = js.undefined
  var levelNum: Double
  var name: String
}

object PivotTupleModel {
  @scala.inline
  def apply(
    children: js.Array[PivotTupleModel],
    levelNum: Double,
    name: String,
    caption: String = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    hierarchy: String = null,
    levelName: String = null
  ): PivotTupleModel = {
    val __obj = js.Dynamic.literal(children = children, levelNum = levelNum, name = name)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren)
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    if (levelName != null) __obj.updateDynamic("levelName")(levelName)
    __obj.asInstanceOf[PivotTupleModel]
  }
}

