package typings.inkDashTable.inkDashTableMod

import typings.ink.inkMod.InkComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var cell: js.UndefOr[InkComponent[js.Object]] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var header: js.UndefOr[InkComponent[js.Object]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var skeleton: js.UndefOr[InkComponent[js.Object]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    cell: InkComponent[js.Object] = null,
    data: js.Array[js.Object] = null,
    header: InkComponent[js.Object] = null,
    padding: Int | Double = null,
    skeleton: InkComponent[js.Object] = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (skeleton != null) __obj.updateDynamic("skeleton")(skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

