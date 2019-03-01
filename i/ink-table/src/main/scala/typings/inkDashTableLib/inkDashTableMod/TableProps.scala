package typings
package inkDashTableLib.inkDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var cell: js.UndefOr[inkLib.inkMod.InkComponent[js.Object]] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var header: js.UndefOr[inkLib.inkMod.InkComponent[js.Object]] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var skeleton: js.UndefOr[inkLib.inkMod.InkComponent[js.Object]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    cell: inkLib.inkMod.InkComponent[js.Object] = null,
    data: js.Array[js.Object] = null,
    header: inkLib.inkMod.InkComponent[js.Object] = null,
    padding: scala.Int | scala.Double = null,
    skeleton: inkLib.inkMod.InkComponent[js.Object] = null
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

