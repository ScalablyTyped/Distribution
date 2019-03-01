package typings
package lineDashByDashLineLib.lineDashByDashLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLineReaderOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
}

