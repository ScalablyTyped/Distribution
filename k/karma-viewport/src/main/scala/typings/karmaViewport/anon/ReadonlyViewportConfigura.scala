package typings.karmaViewport.anon

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
trait ReadonlyViewportConfigura extends js.Object {
  val breakpoints: js.Array[ViewportBreakpoint]
  val context: String
}

object ReadonlyViewportConfigura {
  @scala.inline
  def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ReadonlyViewportConfigura = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyViewportConfigura]
  }
}

