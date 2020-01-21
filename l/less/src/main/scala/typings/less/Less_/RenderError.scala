package typings.less.Less_

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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderError]
  }
}

