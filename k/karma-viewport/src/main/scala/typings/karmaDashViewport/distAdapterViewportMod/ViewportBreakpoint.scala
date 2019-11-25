package typings.karmaDashViewport.distAdapterViewportMod

import typings.karmaDashViewport.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportBreakpoint extends js.Object {
  var name: String
  var size: Anon_Height
}

object ViewportBreakpoint {
  @scala.inline
  def apply(name: String, size: Anon_Height): ViewportBreakpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportBreakpoint]
  }
}

