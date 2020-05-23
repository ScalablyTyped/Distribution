package typings.jexcel.anon

import typings.jexcel.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colspan extends js.Object {
  var colspan: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[CellValue] = js.undefined
}

object Colspan {
  @scala.inline
  def apply(colspan: js.UndefOr[Double] = js.undefined, title: CellValue = null): Colspan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colspan)) __obj.updateDynamic("colspan")(colspan.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colspan]
  }
}

