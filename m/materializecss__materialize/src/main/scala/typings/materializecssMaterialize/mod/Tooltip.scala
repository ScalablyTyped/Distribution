package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.anon.PartialTooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Tooltip")
@js.native
open class Tooltip ()
  extends StObject
     with typings.materializecssMaterialize.M.Tooltip {
  
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
  
  @JSImport("@materializecss/materialize", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
  
  /**
    * Init Tooltips
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializecssMaterialize.M.Tooltip] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tooltip]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialTooltipOptions
  ): js.Array[typings.materializecssMaterialize.M.Tooltip] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Tooltip]]
  /**
    * Init Tooltip
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
  inline def init(els: Element, options: PartialTooltipOptions): typings.materializecssMaterialize.M.Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Tooltip]
}
