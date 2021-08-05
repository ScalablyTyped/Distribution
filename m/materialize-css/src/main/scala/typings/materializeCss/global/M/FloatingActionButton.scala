package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialFloatingActionButt
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends StObject
     with typings.materializeCss.M.FloatingActionButton {
  
  /**
    * Close FAB
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Describes open/close state of FAB.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Open FAB
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}
object FloatingActionButton {
  
  @JSGlobal("M.FloatingActionButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.FloatingActionButton]
  
  /**
    * Init FloatingActionButtons
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.FloatingActionButton] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.FloatingActionButton]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialFloatingActionButt
  ): js.Array[typings.materializeCss.M.FloatingActionButton] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.FloatingActionButton]]
  /**
    * Init FloatingActionButton
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.FloatingActionButton]
  inline def init(els: Element, options: PartialFloatingActionButt): typings.materializeCss.M.FloatingActionButton = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.FloatingActionButton]
}
