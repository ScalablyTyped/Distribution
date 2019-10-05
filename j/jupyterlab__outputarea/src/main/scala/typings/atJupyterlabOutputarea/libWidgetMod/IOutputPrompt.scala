package typings.atJupyterlabOutputarea.libWidgetMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputPrompt extends Widget {
  /**
    * The execution count for the prompt.
    */
  var executionCount: ExecutionCount = js.native
}

