package typings.materializeCss.global.M

import typings.materializeCss.M.CarouselOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialCarouselOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Carousel")
@js.native
open class Carousel ()
  extends StObject
     with typings.materializeCss.M.Carousel {
  
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
  inline def getInstance(elem: Element): typings.materializeCss.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Carousel]
  
  /**
    * Init carousels
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.Carousel] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Carousel]]
  inline def init(els: MElements, options: PartialCarouselOptions): js.Array[typings.materializeCss.M.Carousel] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Carousel]]
  /**
    * Init carousel
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Carousel]
  inline def init(els: Element, options: PartialCarouselOptions): typings.materializeCss.M.Carousel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Carousel]
}
