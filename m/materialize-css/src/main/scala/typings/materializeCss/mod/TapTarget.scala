package typings.materializeCss.mod

import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typings.materializeCss.M.TapTarget {
  /**
    * If the tap target is open
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Close Tap Target
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Open Tap Target
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.TapTarget] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTapTargetOptions
  ): js.Array[typings.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typings.materializeCss.M.TapTarget = js.native
  def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = js.native
}

