package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItemNotesDataItemLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SparklineValueAxisItemNotesDataItemLine {
  @scala.inline
  def apply(color: String = null, length: Int | Double = null, width: Int | Double = null): SparklineValueAxisItemNotesDataItemLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineValueAxisItemNotesDataItemLine]
  }
}

