package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var checkLineBreaks: Boolean
  var filename: String | Null
  var implicitTypes: js.Array[Type]
  var input: String
  var json: Boolean
  var kind: String
  var length: Double
  var line: Double
  var lineIndent: Double
  var lineStart: Double
  var position: Double
  var result: js.Any
  var schema: SchemaDefinition
  var version: Null | Double
  def onWarning(e: YAMLException): Unit
}

object State {
  @scala.inline
  def apply(
    checkLineBreaks: Boolean,
    implicitTypes: js.Array[Type],
    input: String,
    json: Boolean,
    kind: String,
    length: Double,
    line: Double,
    lineIndent: Double,
    lineStart: Double,
    onWarning: YAMLException => Unit,
    position: Double,
    result: js.Any,
    schema: SchemaDefinition,
    filename: String = null,
    version: Double = null.asInstanceOf[Double]
  ): State = {
    val __obj = js.Dynamic.literal(checkLineBreaks = checkLineBreaks.asInstanceOf[js.Any], implicitTypes = implicitTypes.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIndent = lineIndent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), position = position.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

