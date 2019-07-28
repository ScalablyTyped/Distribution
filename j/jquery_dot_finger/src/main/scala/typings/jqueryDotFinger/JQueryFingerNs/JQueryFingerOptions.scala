package typings.jqueryDotFinger.JQueryFingerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFingerOptions extends js.Object {
  /**
    * The maximum time between two tap events to fire a doubletap event.
    * If this time is reached, two distinct tap events will be fired instead.
    *     Default: 300(ms).
    */
  var doubleTapInterval: Double
  /**
    * The maximum time the user will have to swipe in order to fire a flick
    * event. If this time is reached, only drag events will continue to be
    * fired.
    *     Default: 150(ms).
    */
  var flickDuration: Double
  /**
    * The number of pixels the user will have to move in order to fire motion
    * events (drag or flick). If this time is not reached, no motion will
    * be handled and tap, doubletap or press event will be fired.
    *     Default: 5(px).
    */
  var motionThreshhold: Double
  /**
    * The time the user must hold in order to fire a press event. If this
    * time is not reached, a tap event will be fired instead.
    *     Default: 300(ms).
    */
  var pressDuration: Double
  /**
    * Globally prevents every native default behavior.
    *     Default: undefined.
    */
  var preventDefault: Boolean
}

object JQueryFingerOptions {
  @scala.inline
  def apply(
    doubleTapInterval: Double,
    flickDuration: Double,
    motionThreshhold: Double,
    pressDuration: Double,
    preventDefault: Boolean
  ): JQueryFingerOptions = {
    val __obj = js.Dynamic.literal(doubleTapInterval = doubleTapInterval, flickDuration = flickDuration, motionThreshhold = motionThreshhold, pressDuration = pressDuration, preventDefault = preventDefault)
  
    __obj.asInstanceOf[JQueryFingerOptions]
  }
}

