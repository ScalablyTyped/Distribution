package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.SliderOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialSliderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Slider")
@js.native
open class Slider ()
  extends StObject
     with typings.materializecssMaterialize.M.Slider {
  
  /**
    * Index of current slide
    */
  /* CompleteClass */
  var activeIndex: Double = js.native
  
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
    * Move to next slider
    */
  /* CompleteClass */
  override def next(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: SliderOptions = js.native
  
  /**
    * Pause slider autoslide
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  
  /**
    * Move to prev slider
    */
  /* CompleteClass */
  override def prev(): Unit = js.native
  
  /**
    * Start slider autoslide
    */
  /* CompleteClass */
  override def start(): Unit = js.native
}
object Slider {
  
  @JSImport("@materializecss/materialize", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Slider]
  
  /**
    * Init Sliders
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Slider] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Slider]]
  inline def init(els: MElements, options: PartialSliderOptions): js.Array[typings.materializecssMaterialize.M.Slider] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Slider]]
  /**
    * Init Slider
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Slider]
  inline def init(els: Element, options: PartialSliderOptions): typings.materializecssMaterialize.M.Slider = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Slider]
}
