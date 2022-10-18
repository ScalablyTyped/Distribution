package typings.materializeCss.global.M

import typings.materializeCss.M.ChipsOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialChipsOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Chips")
@js.native
open class Chips ()
  extends StObject
     with typings.materializeCss.M.Chips {
  
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
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: ChipsOptions = js.native
}
object Chips {
  
  @JSGlobal("M.Chips")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Chips = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Chips]
  
  /**
    * Init Chipses
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Chips] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Chips]]
  inline def init(els: MElements, options: PartialChipsOptions): js.Array[typings.materializeCss.M.Chips] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Chips]]
  /**
    * Init Chips
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Chips = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Chips]
  inline def init(els: Element, options: PartialChipsOptions): typings.materializeCss.M.Chips = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Chips]
}
