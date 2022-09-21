package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tooltip")
@js.native
open class Tooltip ()
  extends StObject
     with typings.materializeCss.M.Tooltip {
  
  /**
    * Hide tooltip.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * If tooltip is hovered.
    */
  /* CompleteClass */
  var isHovered: Boolean = js.native
  
  /**
    * If tooltip is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Show tooltip.
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}
object Tooltip {
  
  @JSGlobal("M.Tooltip")
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
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.Tooltip] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Tooltip]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialTooltipOptions
  ): js.Array[typings.materializeCss.M.Tooltip] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Tooltip]]
  /**
    * Init Tooltip
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Tooltip]
  inline def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Tooltip]
}
