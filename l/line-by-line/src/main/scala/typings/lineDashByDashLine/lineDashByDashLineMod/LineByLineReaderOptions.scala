package typings.lineDashByDashLine.lineDashByDashLineMod

import typings.lineDashByDashLine.lineDashByDashLineStrings.ascii
import typings.lineDashByDashLine.lineDashByDashLineStrings.base64
import typings.lineDashByDashLine.lineDashByDashLineStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLineReaderOptions extends js.Object {
  /** The encoding to use. */
  var encoding: js.UndefOr[ascii | base64 | utf8] = js.undefined
  /** If set to true, empty lines do not emit the "line" event. */
  var skipEmptyLines: js.UndefOr[Boolean] = js.undefined
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(encoding: ascii | base64 | utf8 = null, skipEmptyLines: js.UndefOr[Boolean] = js.undefined): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines)
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
}

