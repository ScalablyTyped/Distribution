package typings.materializeCss.global.M

import typings.materializeCss.M.TapTargetOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.TapTarget")
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
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
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
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TapTargetOptions = js.native
}
object TapTarget {
  
  @JSGlobal("M.TapTarget")
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
  inline def init(els: MElements): js.Array[typings.materializeCss.M.TapTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  inline def init(els: MElements, options: PartialTapTargetOptions): js.Array[typings.materializeCss.M.TapTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.TapTarget]]
  /**
    * Init TapTarget
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.TapTarget]
  inline def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.TapTarget]
}
