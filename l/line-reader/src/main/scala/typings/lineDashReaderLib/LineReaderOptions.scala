package typings
package lineDashReaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineReaderOptions extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[js.Any] = js.undefined
}

object LineReaderOptions {
  @scala.inline
  def apply(
    bufferSize: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    separator: js.Any = null
  ): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[LineReaderOptions]
  }
}

