package typings.jestDashSnapshot

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Record[String, String]
  var dirty: Boolean
}

object Anon_Data {
  @scala.inline
  def apply(data: Record[String, String], dirty: Boolean): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, dirty = dirty)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

