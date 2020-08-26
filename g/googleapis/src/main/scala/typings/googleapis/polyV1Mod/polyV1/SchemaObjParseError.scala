package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an error resulting from parsing an OBJ file
  */
@js.native
trait SchemaObjParseError extends js.Object {
  /**
    * The type of problem found (required).
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The ending character index at which the problem was found.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The file path in which the problem was found.
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * The text of the line. Note that this may be truncated if the line was
    * very long. This may not include the error if it occurs after line
    * truncation.
    */
  var line: js.UndefOr[String] = js.native
  /**
    * Line number at which the problem was found.
    */
  var lineNumber: js.UndefOr[Double] = js.native
  /**
    * The starting character index at which the problem was found.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object SchemaObjParseError {
  @scala.inline
  def apply(): SchemaObjParseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjParseError]
  }
  @scala.inline
  implicit class SchemaObjParseErrorOps[Self <: SchemaObjParseError] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}

