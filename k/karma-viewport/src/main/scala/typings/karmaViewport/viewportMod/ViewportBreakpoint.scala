package typings.karmaViewport.viewportMod

import typings.karmaViewport.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportBreakpoint extends js.Object {
  var name: String
  var size: Height
}

object ViewportBreakpoint {
  @scala.inline
  def apply(name: String, size: Height): ViewportBreakpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportBreakpoint]
  }
}

