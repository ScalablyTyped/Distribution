package typings.hapiCode.mod.thrownAt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var column: String
  var filename: String
  var line: String
}

object Location {
  @scala.inline
  def apply(column: String, filename: String, line: String): Location = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

