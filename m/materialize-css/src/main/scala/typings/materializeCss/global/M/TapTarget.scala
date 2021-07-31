package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.TapTarget")
@js.native
class TapTarget ()
  extends StObject
     with typings.materializeCss.M.TapTarget {
  
  /**
    * Close Tap Target
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * If the tap target is open
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open Tap Target
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}
object TapTarget {
  
  @JSGlobal("M.TapTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  @scala.inline
  def getInstance(elem: Element): typings.materializeCss.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.TapTarget]
  
  /**
    * Init TapTargets
    */
  /* static member */
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.TapTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTapTargetOptions
  ): js.Array[typings.materializeCss.M.TapTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  /**
    * Init TapTarget
    */
  /* static member */
  @scala.inline
  def init(els: Element): typings.materializeCss.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.TapTarget]
  @scala.inline
  def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.TapTarget]
}
