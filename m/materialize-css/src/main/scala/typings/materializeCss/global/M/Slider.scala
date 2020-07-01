package typings.materializeCss.global.M

import typings.materializeCss.M.SliderOptions
import typings.materializeCss.anon.PartialSliderOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Slider")
@js.native
class Slider ()
  extends typings.materializeCss.M.Slider {
  /**
    * Index of current slide
    */
  /* CompleteClass */
  override var activeIndex: Double = js.native
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  override var options: SliderOptions = js.native
  /**
    * Move to next slider
    */
  /* CompleteClass */
  override def next(): Unit = js.native
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

/* static members */
@JSGlobal("M.Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Slider = js.native
  /**
    * Init Sliders
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialSliderOptions
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: Element): typings.materializeCss.M.Slider = js.native
  def init(els: Element, options: PartialSliderOptions): typings.materializeCss.M.Slider = js.native
}

