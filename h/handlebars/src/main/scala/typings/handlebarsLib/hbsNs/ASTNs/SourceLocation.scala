package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Position
  var source: java.lang.String
  var start: Position
}

object SourceLocation {
  @scala.inline
  def apply(end: Position, source: java.lang.String, start: Position): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, source = source, start = start)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

