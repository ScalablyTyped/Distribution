package typings.materializeCss.mod

import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "TapTarget")
@js.native
open class TapTarget ()
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
  
  @JSImport("materialize-css", "TapTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.TapTarget]
  
  /**
    * Init TapTargets
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.TapTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialTapTargetOptions
  ): js.Array[typings.materializeCss.M.TapTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  /**
    * Init TapTarget
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.TapTarget]
  inline def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.TapTarget]
}
