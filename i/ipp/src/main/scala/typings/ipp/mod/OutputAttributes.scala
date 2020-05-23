package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputAttributes extends js.Object {
  var `noise-removal`: js.UndefOr[Double] = js.undefined
  var `output-compression-quality-factor`: js.UndefOr[Double] = js.undefined
}

object OutputAttributes {
  @scala.inline
  def apply(
    `noise-removal`: js.UndefOr[Double] = js.undefined,
    `output-compression-quality-factor`: js.UndefOr[Double] = js.undefined
  ): OutputAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`noise-removal`)) __obj.updateDynamic("noise-removal")(`noise-removal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`output-compression-quality-factor`)) __obj.updateDynamic("output-compression-quality-factor")(`output-compression-quality-factor`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputAttributes]
  }
}

