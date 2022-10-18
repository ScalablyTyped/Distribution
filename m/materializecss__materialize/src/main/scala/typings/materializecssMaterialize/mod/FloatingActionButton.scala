package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.FloatingActionButtonOptions
import typings.materializecssMaterialize.MElements
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
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: FloatingActionButtonOptions = js.native
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
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.FloatingActionButton] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FloatingActionButton]]
  inline def init(els: MElements, options: PartialFloatingActionButt): js.Array[typings.materializecssMaterialize.M.FloatingActionButton] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FloatingActionButton]]
  /**
    * Init FloatingActionButton
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.FloatingActionButton]
  inline def init(els: Element, options: PartialFloatingActionButt): typings.materializecssMaterialize.M.FloatingActionButton = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.FloatingActionButton]
}
