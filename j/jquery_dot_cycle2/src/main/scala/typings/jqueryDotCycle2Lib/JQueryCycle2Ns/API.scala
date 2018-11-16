package typings
package jqueryDotCycle2Lib.JQueryCycle2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def add(slides: js.Any): scala.Unit = js.native
  def add(slides: js.Any, prepend: scala.Boolean): scala.Unit = js.native
   // string or array or JQuery
  def addInitialSlides(): scala.Unit = js.native
  def advanceSlide(numberOfOpositions: scala.Double): scala.Boolean = js.native
   // always false
  def buildPagerLink(slideOptionHash: Options, slide: js.Any): scala.Unit = js.native
  def buildSlideOpts(slide: js.Any): Options = js.native
  def calcFirstSlide(): scala.Unit = js.native
  def calcNextSlide(): scala.Unit = js.native
  def calcTx(slideOptions: Options, manual: scala.Boolean): Transition = js.native
  def destroy(): scala.Unit = js.native
  def doTransition(
    slideOptions: Options,
    currEl: stdLib.Element,
    nextEl: stdLib.Element,
    fwdFlag: scala.Boolean,
    callback: js.Function
  ): scala.Unit = js.native
  def getComponent(nameOfComponent: java.lang.String): jqueryDotCycle2Lib.JQuery = js.native
  def getSlideIndex(slideElement: stdLib.Element): scala.Double = js.native
  def getSlideOpts(slideIndex: scala.Double): Options = js.native
  def goto(index: scala.Double): scala.Unit = js.native
  def initSlide(slideOptions: Options, slide: js.Any, suggestedZindex: scala.Double): scala.Unit = js.native
  def initSlideshow(): scala.Unit = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def page(pagerEl: stdLib.Element, targetEl: stdLib.Element): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def postInitSlideshow(): scala.Unit = js.native
  def preInitSlideshow(): scala.Unit = js.native
  def prepareTx(manualFlag: scala.Boolean, fwdFlag: scala.Boolean): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def queueTransition(slideOptions: Options): scala.Unit = js.native
  def reinit(): scala.Unit = js.native
  def remove(slideIndexToRemove: scala.Double): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def stackSlides(currEl: stdLib.Element, nextEl: stdLib.Element, fwdFlag: scala.Boolean): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stopTransition(): scala.Unit = js.native
  def tmpl(templateString: java.lang.String, optionHash: Options, slideEl: stdLib.Element): scala.Unit = js.native
  def trigger(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def updateView(): scala.Unit = js.native
}

