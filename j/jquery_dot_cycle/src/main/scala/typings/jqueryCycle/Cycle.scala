package typings.jqueryCycle

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cycle extends StObject {
  
  def apply(): JQuery = js.native
  def apply(fx: String): JQuery = js.native
  def apply(options: CycleOptions): JQuery = js.native
  
  // the actual fn for effecting a transition
  def commonReset(currSlideElement: Element, nextSlideElement: Element, options: CycleOptions): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: js.UndefOr[scala.Nothing],
    h: js.UndefOr[scala.Nothing],
    rev: Boolean
  ): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: js.UndefOr[scala.Nothing],
    h: Boolean
  ): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: js.UndefOr[scala.Nothing],
    h: Boolean,
    rev: Boolean
  ): Unit = js.native
  def commonReset(currSlideElement: Element, nextSlideElement: Element, options: CycleOptions, w: Boolean): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: Boolean,
    h: js.UndefOr[scala.Nothing],
    rev: Boolean
  ): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: Boolean,
    h: Boolean
  ): Unit = js.native
  def commonReset(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    w: Boolean,
    h: Boolean,
    rev: Boolean
  ): Unit = js.native
  
  // helper fn to calculate the number of slides between the current and the next
  def createPagerAnchor(index: Double, DOMElement: Element, $pager: JQuery, els: js.Any, options: CycleOptions): String = js.native
  
  // transition definitions - only fade is defined here, transition pack defines the rest
  def custom(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    afterCalback: js.Function,
    forwardFlag: Boolean
  ): Unit = js.native
  def custom(
    currSlideElement: Element,
    nextSlideElement: Element,
    options: CycleOptions,
    afterCalback: js.Function,
    forwardFlag: Boolean,
    speedOverride: Double
  ): Unit = js.native
  
  var debug: Boolean = js.native
  
  var defaults: CycleOptions = js.native
  
  // reset common props before the next transition
  def hopsFromLast(options: CycleOptions): Double = js.native
  def hopsFromLast(options: CycleOptions, forwardFlag: Boolean): Double = js.native
  
  // expose next/prev function, caller must pass in state
  def next(): Unit = js.native
  def next(options: CycleOptions): Unit = js.native
  
  def prev(): Unit = js.native
  def prev(options: CycleOptions): Unit = js.native
  
  // invoked after transition
  def resetState(options: CycleOptions): Unit = js.native
  def resetState(options: CycleOptions, fx: String): Unit = js.native
  
  var transitions: StringDictionary[
    js.Function3[/* $cont */ JQuery, /* $slides */ JQuery, /* options */ CycleOptions, Unit]
  ] = js.native
  
  def updateActivePagerLink(pager: js.Any, currSlide: Double, clsName: String): Unit = js.native
  
  def ver(): String = js.native
}
