package typings.jestSnapshot.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Record[String, String]
  var dirty: Boolean
}

object Data {
  @scala.inline
  def apply(data: Record[String, String], dirty: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

