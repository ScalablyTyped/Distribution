package typings.jsmediatags.build2XhrFileReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeType extends js.Object {
  var firstBytePosition: js.UndefOr[Double] = js.undefined
  var instanceLength: js.UndefOr[Double] = js.undefined
  var lastBytePosition: js.UndefOr[Double] = js.undefined
}

object ContentRangeType {
  @scala.inline
  def apply(
    firstBytePosition: Int | Double = null,
    instanceLength: Int | Double = null,
    lastBytePosition: Int | Double = null
  ): ContentRangeType = {
    val __obj = js.Dynamic.literal()
    if (firstBytePosition != null) __obj.updateDynamic("firstBytePosition")(firstBytePosition.asInstanceOf[js.Any])
    if (instanceLength != null) __obj.updateDynamic("instanceLength")(instanceLength.asInstanceOf[js.Any])
    if (lastBytePosition != null) __obj.updateDynamic("lastBytePosition")(lastBytePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeType]
  }
}

