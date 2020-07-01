package typings.materializeCss.mod

import typings.materializeCss.anon.PartialFloatingActionButt
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typings.materializeCss.M.FloatingActionButton {
  /**
    * Describes open/close state of FAB.
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Close FAB
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Open FAB
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

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
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialFloatingActionButt
  ): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: Element): typings.materializeCss.M.FloatingActionButton = js.native
  def init(els: Element, options: PartialFloatingActionButt): typings.materializeCss.M.FloatingActionButton = js.native
}

