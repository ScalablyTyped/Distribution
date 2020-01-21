package typings.lineByLine.mod

import typings.lineByLine.lineByLineStrings.ascii
import typings.lineByLine.lineByLineStrings.base64
import typings.lineByLine.lineByLineStrings.binary
import typings.lineByLine.lineByLineStrings.hex
import typings.lineByLine.lineByLineStrings.latin1
import typings.lineByLine.lineByLineStrings.ucs2
import typings.lineByLine.lineByLineStrings.utf16le
import typings.lineByLine.lineByLineStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLineReaderOptions extends js.Object {
  /** The encoding to use. */
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex] = js.undefined
  /** If set to true, empty lines do not emit the "line" event. */
  var skipEmptyLines: js.UndefOr[Boolean] = js.undefined
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex = null,
    skipEmptyLines: js.UndefOr[Boolean] = js.undefined
  ): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
}

