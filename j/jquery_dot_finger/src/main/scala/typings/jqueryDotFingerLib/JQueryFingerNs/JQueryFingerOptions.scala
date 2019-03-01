package typings
package jqueryDotFingerLib.JQueryFingerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFingerOptions extends js.Object {
  /**
    * The maximum time between two tap events to fire a doubletap event.
    * If this time is reached, two distinct tap events will be fired instead.
    *     Default: 300(ms).
    */
  var doubleTapInterval: scala.Double
  /**
    * The maximum time the user will have to swipe in order to fire a flick
    * event. If this time is reached, only drag events will continue to be
    * fired.
    *     Default: 150(ms).
    */
  var flickDuration: scala.Double
  /**
    * The number of pixels the user will have to move in order to fire motion
    * events (drag or flick). If this time is not reached, no motion will
    * be handled and tap, doubletap or press event will be fired.
    *     Default: 5(px).
    */
  var motionThreshhold: scala.Double
  /**
    * The time the user must hold in order to fire a press event. If this
    * time is not reached, a tap event will be fired instead.
    *     Default: 300(ms).
    */
  var pressDuration: scala.Double
  /**
    * Globally prevents every native default behavior.
    *     Default: undefined.
    */
  var preventDefault: scala.Boolean
}

object JQueryFingerOptions {
  @scala.inline
  def apply(
    doubleTapInterval: scala.Double,
    flickDuration: scala.Double,
    motionThreshhold: scala.Double,
    pressDuration: scala.Double,
    preventDefault: scala.Boolean
  ): JQueryFingerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doubleTapInterval")(doubleTapInterval)
    __obj.updateDynamic("flickDuration")(flickDuration)
    __obj.updateDynamic("motionThreshhold")(motionThreshhold)
    __obj.updateDynamic("pressDuration")(pressDuration)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.asInstanceOf[JQueryFingerOptions]
  }
}

