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
  def apply(
    code: String = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    filePath: String = null,
    line: String = null,
    lineNumber: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined
  ): SchemaObjParseError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjParseError]
  }
}

