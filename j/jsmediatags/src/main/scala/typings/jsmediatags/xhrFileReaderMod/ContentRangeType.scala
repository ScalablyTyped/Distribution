package typings.jsmediatags.xhrFileReaderMod

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
    firstBytePosition: js.UndefOr[Double] = js.undefined,
    instanceLength: js.UndefOr[Double] = js.undefined,
    lastBytePosition: js.UndefOr[Double] = js.undefined
  ): ContentRangeType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(firstBytePosition)) __obj.updateDynamic("firstBytePosition")(firstBytePosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceLength)) __obj.updateDynamic("instanceLength")(instanceLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastBytePosition)) __obj.updateDynamic("lastBytePosition")(lastBytePosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeType]
  }
}

