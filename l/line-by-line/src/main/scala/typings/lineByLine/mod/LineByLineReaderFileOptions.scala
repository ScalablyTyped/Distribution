package typings.lineByLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLineReaderFileOptions extends LineByLineReaderOptions {
  /** The `end` position in bytes to read from the file. */
  var end: js.UndefOr[Double] = js.native
  /** The `start` position in bytes to read from the file. */
  var start: js.UndefOr[Double] = js.native
}

object LineByLineReaderFileOptions {
  @scala.inline
  def apply(): LineByLineReaderFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineByLineReaderFileOptions]
  }
  @scala.inline
  implicit class LineByLineReaderFileOptionsOps[Self <: LineByLineReaderFileOptions] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

