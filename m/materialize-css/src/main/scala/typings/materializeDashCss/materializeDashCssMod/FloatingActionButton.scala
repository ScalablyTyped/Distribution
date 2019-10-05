package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.FloatingActionButtonOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typings.materializeDashCss.M.FloatingActionButton

/* static members */
@JSImport("materialize-css", "FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.FloatingActionButton] = js.native
  def init(els: MElements, options: Partial[FloatingActionButtonOptions]): js.Array[typings.materializeDashCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: Element): typings.materializeDashCss.M.FloatingActionButton = js.native
  def init(els: Element, options: Partial[FloatingActionButtonOptions]): typings.materializeDashCss.M.FloatingActionButton = js.native
}

