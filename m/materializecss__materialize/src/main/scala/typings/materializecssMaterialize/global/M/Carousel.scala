package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.CarouselOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialCarouselOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Carousel")
@js.native
open class Carousel ()
  extends StObject
     with typings.materializecssMaterialize.M.Carousel {
  
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
  var options: CarouselOptions = js.native
}
object Carousel {
  
  @JSGlobal("M.Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Carousel]
  
  /**
    * Init carousels
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Carousel] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Carousel]]
  inline def init(els: MElements, options: PartialCarouselOptions): js.Array[typings.materializecssMaterialize.M.Carousel] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Carousel]]
  /**
    * Init carousel
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Carousel]
  inline def init(els: Element, options: PartialCarouselOptions): typings.materializecssMaterialize.M.Carousel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Carousel]
}
