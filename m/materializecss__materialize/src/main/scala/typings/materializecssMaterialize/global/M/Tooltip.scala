package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.TooltipOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialTooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tooltip")
@js.native
open class Tooltip ()
  extends StObject
     with typings.materializecssMaterialize.M.Tooltip {
  
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
    * If tooltip is hovered.
    */
  /* CompleteClass */
  var isHovered: Boolean = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with.
    */
  /* CompleteClass */
  var options: TooltipOptions = js.native
}
object Tooltip {
  
  @JSGlobal("M.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance.
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
  
  /**
    * Init Tooltips.
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Tooltip] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tooltip]]
  inline def init(els: MElements, options: PartialTooltipOptions): js.Array[typings.materializecssMaterialize.M.Tooltip] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tooltip]]
  /**
    * Init Tooltip.
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
  inline def init(els: Element, options: PartialTooltipOptions): typings.materializecssMaterialize.M.Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
}
