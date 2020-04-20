package typings.karmaViewport.viewportMod

import typings.karmaViewport.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportBreakpoint extends js.Object {
  var name: String
  var size: AnonHeight
}

object ViewportBreakpoint {
  @scala.inline
  def apply(name: String, size: AnonHeight): ViewportBreakpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportBreakpoint]
  }
}

