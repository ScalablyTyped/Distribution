package typings.karmaViewport

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
trait PartialViewportConfigurat extends js.Object {
  var breakpoints: js.UndefOr[js.Array[ViewportBreakpoint]] = js.undefined
  var context: js.UndefOr[String] = js.undefined
}

object PartialViewportConfigurat {
  @scala.inline
  def apply(breakpoints: js.Array[ViewportBreakpoint] = null, context: String = null): PartialViewportConfigurat = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialViewportConfigurat]
  }
}

