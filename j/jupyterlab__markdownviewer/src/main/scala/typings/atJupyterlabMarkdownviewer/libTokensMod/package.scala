package typings.atJupyterlabMarkdownviewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
  import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument

  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}
