package typings.kendoDashUi.kendo.data

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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], levelNum = levelNum.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    if (levelName != null) __obj.updateDynamic("levelName")(levelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTupleModel]
  }
}

