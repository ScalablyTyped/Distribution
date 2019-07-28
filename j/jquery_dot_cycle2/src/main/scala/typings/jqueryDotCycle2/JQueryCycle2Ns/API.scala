package typings.jqueryDotCycle2.JQueryCycle2Ns

import typings.jqueryDotCycle2.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def add(slides: js.Any): Unit = js.native
  def add(slides: js.Any, prepend: Boolean): Unit = js.native
   // string or array or JQuery
  def addInitialSlides(): Unit = js.native
  def advanceSlide(numberOfOpositions: Double): Boolean = js.native
   // always false
  def buildPagerLink(slideOptionHash: Options, slide: js.Any): Unit = js.native
  def buildSlideOpts(slide: js.Any): Options = js.native
  def calcFirstSlide(): Unit = js.native
  def calcNextSlide(): Unit = js.native
  def calcTx(slideOptions: Options, manual: Boolean): Transition = js.native
  def destroy(): Unit = js.native
  def doTransition(slideOptions: Options, currEl: Element, nextEl: Element, fwdFlag: Boolean, callback: js.Function): Unit = js.native
  def getComponent(nameOfComponent: String): JQuery = js.native
  def getSlideIndex(slideElement: Element): Double = js.native
  def getSlideOpts(slideIndex: Double): Options = js.native
  def goto(index: Double): Unit = js.native
  def initSlide(slideOptions: Options, slide: js.Any, suggestedZindex: Double): Unit = js.native
  def initSlideshow(): Unit = js.native
  def log(args: js.Any*): Unit = js.native
  def next(): Unit = js.native
  def page(pagerEl: Element, targetEl: Element): Unit = js.native
  def pause(): Unit = js.native
  def postInitSlideshow(): Unit = js.native
  def preInitSlideshow(): Unit = js.native
  def prepareTx(manualFlag: Boolean, fwdFlag: Boolean): Unit = js.native
  def prev(): Unit = js.native
  def queueTransition(slideOptions: Options): Unit = js.native
  def reinit(): Unit = js.native
  def remove(slideIndexToRemove: Double): Unit = js.native
  def resume(): Unit = js.native
  def stackSlides(currEl: Element, nextEl: Element, fwdFlag: Boolean): Unit = js.native
  def stop(): Unit = js.native
  def stopTransition(): Unit = js.native
  def tmpl(templateString: String, optionHash: Options, slideEl: Element): Unit = js.native
  def trigger(eventName: String, args: js.Any*): Unit = js.native
  def updateView(): Unit = js.native
}

