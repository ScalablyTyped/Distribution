package typings.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderError extends js.Object {
  var column: Double = js.native
  var extract: js.Array[String] = js.native
  var filename: String = js.native
  var index: Double = js.native
  var line: Double = js.native
  var message: String = js.native
  var `type`: String = js.native
}

object RenderError {
  @scala.inline
  def apply(
    column: Double,
    extract: js.Array[String],
    filename: String,
    index: Double,
    line: Double,
    message: String,
    `type`: String
  ): RenderError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderError]
  }
  @scala.inline
  implicit class RenderErrorOps[Self <: RenderError] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractVarargs(value: String*): Self = this.set("extract", js.Array(value :_*))
    @scala.inline
    def setExtract(value: js.Array[String]): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

