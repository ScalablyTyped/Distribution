package typings.jestSnapshot

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Record[String, String]
  var dirty: Boolean
}

object AnonData {
  @scala.inline
  def apply(data: Record[String, String], dirty: Boolean): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

