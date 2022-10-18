package typings.materializeCss.global.M

import typings.materializeCss.M.PushpinOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialPushpinOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Pushpin")
@js.native
open class Pushpin ()
  extends StObject
     with typings.materializeCss.M.Pushpin {
  
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
  var options: PushpinOptions = js.native
  
  /**
    * Original offsetTop of element
    */
  /* CompleteClass */
  var originalOffset: Double = js.native
}
object Pushpin {
  
  @JSGlobal("M.Pushpin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  
  /**
    * Init Pushpins
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  inline def init(els: MElements, options: PartialPushpinOptions): js.Array[typings.materializeCss.M.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  /**
    * Init Pushpin
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  inline def init(els: Element, options: PartialPushpinOptions): typings.materializeCss.M.Pushpin = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Pushpin]
}
