package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintObjects extends js.Object {
  var `document-number`: js.UndefOr[Double] = js.undefined
  var `object-offset`: js.UndefOr[ObjectOffset] = js.undefined
  var `object-size`: js.UndefOr[ObjectSize] = js.undefined
  var `object-uuid`: js.UndefOr[String] = js.undefined
}

object PrintObjects {
  @scala.inline
  def apply(
    `document-number`: js.UndefOr[Double] = js.undefined,
    `object-offset`: ObjectOffset = null,
    `object-size`: ObjectSize = null,
    `object-uuid`: String = null
  ): PrintObjects = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`document-number`)) __obj.updateDynamic("document-number")(`document-number`.get.asInstanceOf[js.Any])
    if (`object-offset` != null) __obj.updateDynamic("object-offset")(`object-offset`.asInstanceOf[js.Any])
    if (`object-size` != null) __obj.updateDynamic("object-size")(`object-size`.asInstanceOf[js.Any])
    if (`object-uuid` != null) __obj.updateDynamic("object-uuid")(`object-uuid`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintObjects]
  }
}

