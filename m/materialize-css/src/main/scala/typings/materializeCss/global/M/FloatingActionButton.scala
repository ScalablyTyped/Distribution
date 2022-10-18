package typings.materializeCss.global.M

import typings.materializeCss.M.FloatingActionButtonOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialFloatingActionButt
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.FloatingActionButton")
@js.native
open class FloatingActionButton ()
  extends StObject
     with typings.materializeCss.M.FloatingActionButton {
  
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
  inline def init(els: MElements): js.Array[typings.materializeCss.M.FloatingActionButton] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.FloatingActionButton]]
  inline def init(els: MElements, options: PartialFloatingActionButt): js.Array[typings.materializeCss.M.FloatingActionButton] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.FloatingActionButton]]
  /**
    * Init FloatingActionButton
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.FloatingActionButton]
  inline def init(els: Element, options: PartialFloatingActionButt): typings.materializeCss.M.FloatingActionButton = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.FloatingActionButton]
}
