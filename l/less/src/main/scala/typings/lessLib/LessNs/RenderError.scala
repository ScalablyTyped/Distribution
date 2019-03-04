package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderError extends js.Object {
  var column: scala.Double
  var extract: js.Array[java.lang.String]
  var filename: java.lang.String
  var index: scala.Double
  var line: scala.Double
  var message: java.lang.String
  var `type`: java.lang.String
}

object RenderError {
  @scala.inline
  def apply(
    column: scala.Double,
    extract: js.Array[java.lang.String],
    filename: java.lang.String,
    index: scala.Double,
    line: scala.Double,
    message: java.lang.String,
    `type`: java.lang.String
  ): RenderError = {
    val __obj = js.Dynamic.literal(column = column, extract = extract, filename = filename, index = index, line = line, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RenderError]
  }
}

