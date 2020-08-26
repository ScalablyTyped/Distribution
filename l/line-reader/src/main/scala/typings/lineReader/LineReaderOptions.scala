package typings.lineReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineReaderOptions extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[String] = js.native
  var separator: js.UndefOr[js.Any] = js.native
}

object LineReaderOptions {
  @scala.inline
  def apply(): LineReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineReaderOptions]
  }
  @scala.inline
  implicit class LineReaderOptionsOps[Self <: LineReaderOptions] (val x: Self) extends AnyVal {
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
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setSeparator(value: js.Any): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

