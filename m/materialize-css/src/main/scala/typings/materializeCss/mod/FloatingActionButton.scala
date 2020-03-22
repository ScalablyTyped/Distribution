package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialFloatingActionButt
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typings.materializeCss.M.FloatingActionButton

/* static members */
@JSImport("materialize-css", "FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  def init(els: MElements, options: PartialFloatingActionButt): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: Element): typings.materializeCss.M.FloatingActionButton = js.native
  def init(els: Element, options: PartialFloatingActionButt): typings.materializeCss.M.FloatingActionButton = js.native
}

