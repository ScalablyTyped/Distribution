package typings.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderError extends js.Object {
  var column: Double
  var extract: js.Array[String]
  var filename: String
  var index: Double
  var line: Double
  var message: String
  var `type`: String
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
    val __obj = js.Dynamic.literal(column = column, extract = extract, filename = filename, index = index, line = line, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RenderError]
  }
}

