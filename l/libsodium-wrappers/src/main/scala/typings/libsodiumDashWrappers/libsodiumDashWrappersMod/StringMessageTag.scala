package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

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
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[StringMessageTag]
  }
}

