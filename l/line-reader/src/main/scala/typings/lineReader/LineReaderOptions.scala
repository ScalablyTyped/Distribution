package typings.lineReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineReaderOptions extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[js.Any] = js.undefined
}

object LineReaderOptions {
  @scala.inline
  def apply(bufferSize: js.UndefOr[Double] = js.undefined, encoding: String = null, separator: js.Any = null): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferSize)) __obj.updateDynamic("bufferSize")(bufferSize.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineReaderOptions]
  }
}

