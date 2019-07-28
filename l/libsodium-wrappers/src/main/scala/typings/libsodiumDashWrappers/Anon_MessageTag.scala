package typings.libsodiumDashWrappers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageTag extends js.Object {
  var message: String
  var tag: Double
}

object Anon_MessageTag {
  @scala.inline
  def apply(message: String, tag: Double): Anon_MessageTag = {
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[Anon_MessageTag]
  }
}

