package typings.linesDashAndDashColumns.linesDashAndDashColumnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var column: Double
  var line: Double
}

object SourceLocation {
  @scala.inline
  def apply(column: Double, line: Double): SourceLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

