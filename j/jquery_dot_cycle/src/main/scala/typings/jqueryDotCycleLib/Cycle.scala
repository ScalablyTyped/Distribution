package typings
package jqueryDotCycleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cycle extends js.Object {
  var debug: scala.Boolean = js.native
  var defaults: CycleOptions = js.native
  var transitions: org.scalablytyped.runtime.StringDictionary[
    js.Function3[/* $cont */ JQuery, /* $slides */ JQuery, /* options */ CycleOptions, scala.Unit]
  ] = js.native
  def apply(): JQuery = js.native
  def apply(fx: java.lang.String): JQuery = js.native
  def apply(options: CycleOptions): JQuery = js.native
   // the actual fn for effecting a transition
  def commonReset(currSlideElement: stdLib.Element, nextSlideElement: stdLib.Element, options: CycleOptions): scala.Unit = js.native
  def commonReset(
    currSlideElement: stdLib.Element,
    nextSlideElement: stdLib.Element,
    options: CycleOptions,
    w: scala.Boolean
  ): scala.Unit = js.native
  def commonReset(
    currSlideElement: stdLib.Element,
    nextSlideElement: stdLib.Element,
    options: CycleOptions,
    w: scala.Boolean,
    h: scala.Boolean
  ): scala.Unit = js.native
  def commonReset(
    currSlideElement: stdLib.Element,
    nextSlideElement: stdLib.Element,
    options: CycleOptions,
    w: scala.Boolean,
    h: scala.Boolean,
    rev: scala.Boolean
  ): scala.Unit = js.native
                                                                                                // helper fn to calculate the number of slides between the current and the next
  def createPagerAnchor(
    index: scala.Double,
    DOMElement: stdLib.Element,
    $pager: JQuery,
    els: js.Any,
    options: CycleOptions
  ): java.lang.String = js.native
                                                                   // transition definitions - only fade is defined here, transition pack defines the rest
  def custom(
    currSlideElement: stdLib.Element,
    nextSlideElement: stdLib.Element,
    options: CycleOptions,
    afterCalback: js.Function,
    forwardFlag: scala.Boolean
  ): scala.Unit = js.native
  def custom(
    currSlideElement: stdLib.Element,
    nextSlideElement: stdLib.Element,
    options: CycleOptions,
    afterCalback: js.Function,
    forwardFlag: scala.Boolean,
    speedOverride: scala.Double
  ): scala.Unit = js.native
                                 // reset common props before the next transition
  def hopsFromLast(options: CycleOptions): scala.Double = js.native
  def hopsFromLast(options: CycleOptions, forwardFlag: scala.Boolean): scala.Double = js.native
  // expose next/prev function, caller must pass in state
  def next(): scala.Unit = js.native
  def next(options: CycleOptions): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def prev(options: CycleOptions): scala.Unit = js.native
                                                                                    // invoked after transition
  def resetState(options: CycleOptions): scala.Unit = js.native
  def resetState(options: CycleOptions, fx: java.lang.String): scala.Unit = js.native
  def updateActivePagerLink(pager: js.Any, currSlide: scala.Double, clsName: java.lang.String): scala.Unit = js.native
  def ver(): java.lang.String = js.native
}

