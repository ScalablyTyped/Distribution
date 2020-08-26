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

@js.native
trait LineByLineReaderOptions extends js.Object {
  /** The encoding to use. */
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex] = js.native
  /** If set to true, empty lines do not emit the "line" event. */
  var skipEmptyLines: js.UndefOr[Boolean] = js.native
}

object LineByLineReaderOptions {
  @scala.inline
  def apply(): LineByLineReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineByLineReaderOptions]
  }
  @scala.inline
  implicit class LineByLineReaderOptionsOps[Self <: LineByLineReaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setSkipEmptyLines(value: Boolean): Self = this.set("skipEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipEmptyLines: Self = this.set("skipEmptyLines", js.undefined)
  }
  
}

