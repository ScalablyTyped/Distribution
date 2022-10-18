package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.ScrollSpyOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialScrollSpyOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "ScrollSpy")
@js.native
open class ScrollSpy ()
  extends StObject
     with typings.materializecssMaterialize.M.Component[ScrollSpyOptions] {
  
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
  var options: ScrollSpyOptions = js.native
}
object ScrollSpy {
  
  @JSImport("@materializecss/materialize", "ScrollSpy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.ScrollSpy]
  
  /**
    * Init ScrollSpies
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.ScrollSpy] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.ScrollSpy]]
  inline def init(els: MElements, options: PartialScrollSpyOptions): js.Array[typings.materializecssMaterialize.M.ScrollSpy] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.ScrollSpy]]
  /**
    * Init ScrollSpy
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.ScrollSpy]
  inline def init(els: Element, options: PartialScrollSpyOptions): typings.materializecssMaterialize.M.ScrollSpy = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.ScrollSpy]
}
