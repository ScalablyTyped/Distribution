package typings.materializeCss.mod

import typings.materializeCss.M.SliderOptions
import typings.materializeCss.anon.PartialSliderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends StObject
     with typings.materializeCss.M.Slider {
  
  /**
    * Index of current slide
    */
  /* CompleteClass */
  var activeIndex: Double = js.native
  
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * Move to next slider
    */
  /* CompleteClass */
  override def next(): Unit = js.native
  
  /**
    * ID of the dropdown element
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
  
  @JSImport("materialize-css", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Slider]
  
  /**
    * Init Sliders
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Slider] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Slider]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialSliderOptions
  ): js.Array[typings.materializeCss.M.Slider] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Slider]]
  /**
    * Init Slider
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Slider]
  inline def init(els: Element, options: PartialSliderOptions): typings.materializeCss.M.Slider = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Slider]
}
