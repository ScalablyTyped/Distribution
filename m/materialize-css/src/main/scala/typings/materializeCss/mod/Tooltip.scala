package typings.materializeCss.mod

import typings.materializeCss.M.TooltipOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialTooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Tooltip")
@js.native
open class Tooltip ()
  extends StObject
     with typings.materializeCss.M.Tooltip {
  
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
    * If tooltip is hovered.
    */
  /* CompleteClass */
  var isHovered: Boolean = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TooltipOptions = js.native
}
object Tooltip {
  
  @JSImport("materialize-css", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Tooltip]
  
  /**
    * Init Tooltips
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Tooltip] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Tooltip]]
  inline def init(els: MElements, options: PartialTooltipOptions): js.Array[typings.materializeCss.M.Tooltip] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Tooltip]]
  /**
    * Init Tooltip
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Tooltip]
  inline def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Tooltip]
}
