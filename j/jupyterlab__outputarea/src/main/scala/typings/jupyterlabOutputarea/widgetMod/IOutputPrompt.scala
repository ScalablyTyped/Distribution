package typings.jupyterlabOutputarea.widgetMod

import typings.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typings.phosphorWidgets.mod.Widget
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

