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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[RenderError]
  }
}

