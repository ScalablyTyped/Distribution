package typings.atJupyterlabOutputarea.libWidgetMod

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStdin extends Widget {
  /**
    * The stdin value.
    */
  val value: js.Promise[String] = js.native
}

