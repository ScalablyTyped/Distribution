package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.PushpinOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialPushpinOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Pushpin")
@js.native
open class Pushpin ()
  extends StObject
     with typings.materializecssMaterialize.M.Pushpin {
  
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
    * The options the instance was initialized with.
    */
  /* CompleteClass */
  var options: PushpinOptions = js.native
  
  /**
    * Original offsetTop of element.
    */
  /* CompleteClass */
  var originalOffset: Double = js.native
}
object Pushpin {
  
  @JSImport("@materializecss/materialize", "Pushpin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance.
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Pushpin]
  
  /**
    * Init Pushpins.
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Pushpin]]
  inline def init(els: MElements, options: PartialPushpinOptions): js.Array[typings.materializecssMaterialize.M.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Pushpin]]
  /**
    * Init Pushpin.
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Pushpin]
  inline def init(els: Element, options: PartialPushpinOptions): typings.materializecssMaterialize.M.Pushpin = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Pushpin]
}
