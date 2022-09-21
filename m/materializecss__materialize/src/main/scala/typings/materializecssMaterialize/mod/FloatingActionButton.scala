package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.anon.PartialFloatingActionButt
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "FloatingActionButton")
@js.native
open class FloatingActionButton ()
  extends StObject
     with typings.materializecssMaterialize.M.FloatingActionButton {
  
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
  
  @JSImport("@materializecss/materialize", "FloatingActionButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.FloatingActionButton]
  
  /**
    * Init FloatingActionButtons
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializecssMaterialize.M.FloatingActionButton] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FloatingActionButton]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialFloatingActionButt
  ): js.Array[typings.materializecssMaterialize.M.FloatingActionButton] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FloatingActionButton]]
  /**
    * Init FloatingActionButton
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.FloatingActionButton]
  inline def init(els: Element, options: PartialFloatingActionButt): typings.materializecssMaterialize.M.FloatingActionButton = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.FloatingActionButton]
}
