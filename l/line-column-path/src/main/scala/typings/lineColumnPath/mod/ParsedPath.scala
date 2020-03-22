package typings.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined type-fest.type-fest.Mutable<std.Required<line-column-path.line-column-path.PathDescriptor>> */
trait ParsedPath extends js.Object {
  var column: Double
  var file: String
  var line: Double
}

object ParsedPath {
  @scala.inline
  def apply(column: Double, file: String, line: Double): ParsedPath = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedPath]
  }
}

