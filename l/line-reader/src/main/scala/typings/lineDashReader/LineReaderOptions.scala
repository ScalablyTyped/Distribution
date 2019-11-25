package typings.lineDashReader

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
  def apply(bufferSize: Int | Double = null, encoding: String = null, separator: js.Any = null): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineReaderOptions]
  }
}

