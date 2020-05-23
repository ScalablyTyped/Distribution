package typings.heremaps.H.map.render.p2d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class implements a map render engine. It presents a geographic location (camera data from a view model) and renders all map layers in
  * the order in which they are provided in a single 2D canvas element.
  */
@js.native
trait RenderEngine_
  extends typings.heremaps.H.map.render.RenderEngine {
  /**
    * This method retrieves the current setting indicating the length of animations (duration) run by the the render engine in milliseconds.
    * @return {number}
    */
  def getAnimationDuration(): Double = js.native
  /**
    * This method retrieves the current setting representing the easing to be applied to animations.
    * @return {Function(number) => number} - A numeric value in the range 0 to 1
    */
  def getAnimationEase(): js.Function1[/* progress */ Double, Double] = js.native
  /**
    * This method resets animation settings on the render engine to defaults.
    * Duration is set to 300ms and easing to H.util.animation.ease.EASE_OUT_QUAD.
    */
  def resetAnimationDefaults(): Unit = js.native
  /**
    * This method sets the length (duration) for all animations run by the render engine in milliseconds.
    * @param duration {number} - A value indicating the duration of animations in milliseconds
    */
  def setAnimationDuration(duration: Double): Unit = js.native
  /**
    * This method sets a value indicating the easing to apply to animations run by the render engine.
    * @param easeFunction {Function(number)} - A function that alters the progress ratio of an animation. It receives an argument indicating
    * animation progress as a numeric value in the range between 0 and 1 and must return a numeric value in the same range.
    */
  def setAnimationEase(easeFunction: js.Function1[/* progress */ Double, Double]): Unit = js.native
}

