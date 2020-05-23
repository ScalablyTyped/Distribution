package typings.intlRelativeformat.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Future extends js.Object {
  var future: Record[String, String]
  var past: Record[String, String]
}

object Future {
  @scala.inline
  def apply(future: Record[String, String], past: Record[String, String]): Future = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Future]
  }
}

