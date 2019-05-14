package typings
package lineDashByDashLineLib.lineDashByDashLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLineReaderOptions extends js.Object {
  /** The encoding to use. */
  var encoding: js.UndefOr[
    lineDashByDashLineLib.lineDashByDashLineLibStrings.ascii | lineDashByDashLineLib.lineDashByDashLineLibStrings.base64 | lineDashByDashLineLib.lineDashByDashLineLibStrings.utf8
  ] = js.undefined
  /** If set to true, empty lines do not emit the "line" event. */
  var skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(
    encoding: lineDashByDashLineLib.lineDashByDashLineLibStrings.ascii | lineDashByDashLineLib.lineDashByDashLineLibStrings.base64 | lineDashByDashLineLib.lineDashByDashLineLibStrings.utf8 = null,
    skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
  ): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines)
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
}

