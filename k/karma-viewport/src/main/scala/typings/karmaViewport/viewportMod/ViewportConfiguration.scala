package typings.karmaViewport.viewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportConfiguration extends js.Object {
  var breakpoints: js.Array[ViewportBreakpoint]
  var context: String
}

object ViewportConfiguration {
  @scala.inline
  def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ViewportConfiguration = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportConfiguration]
  }
}

