package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.TapTargetOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialTapTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "TapTarget")
@js.native
open class TapTarget ()
  extends StObject
     with typings.materializecssMaterialize.M.TapTarget {
  
  /**
    * Close Tap Target.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Destroy plugin instance and teardown.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with.
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * If the tap target is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open Tap Target.
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with.
    */
  /* CompleteClass */
  var options: TapTargetOptions = js.native
}
object TapTarget {
  
  @JSImport("@materializecss/materialize", "TapTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance.
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.TapTarget]
  
  /**
    * Init TapTargets.
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.TapTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.TapTarget]]
  inline def init(els: MElements, options: PartialTapTargetOptions): js.Array[typings.materializecssMaterialize.M.TapTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.TapTarget]]
  /**
    * Init TapTarget.
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.TapTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.TapTarget]
  inline def init(els: Element, options: PartialTapTargetOptions): typings.materializecssMaterialize.M.TapTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.TapTarget]
}
