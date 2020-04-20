package typings.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMessageTag extends js.Object {
  var message: String
  var tag: Double
}

object StringMessageTag {
  @scala.inline
  def apply(message: String, tag: Double): StringMessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringMessageTag]
  }
}

