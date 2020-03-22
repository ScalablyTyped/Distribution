package typings.intlRelativeformat

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFuture extends js.Object {
  var future: Record[String, String]
  var past: Record[String, String]
}

object AnonFuture {
  @scala.inline
  def apply(future: Record[String, String], past: Record[String, String]): AnonFuture = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFuture]
  }
}

