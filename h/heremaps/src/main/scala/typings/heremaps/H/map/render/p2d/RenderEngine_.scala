package typings.heremaps.H.map.render.p2d

import typings.heremaps.H.map.DataModel
import typings.heremaps.H.map.ViewModel
import typings.heremaps.H.map.ViewPort
import typings.heremaps.H.map.render.RenderEngine.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class implements a map render engine. It presents a geographic location (camera data from a view model) and renders all map layers in
  * the order in which they are provided in a single 2D canvas element.
  */
@JSGlobal("H.map.render.p2d.RenderEngine")
@js.native
class RenderEngine_ protected ()
  extends typings.heremaps.H.map.render.RenderEngine {
  /**
    * Constructor
    * @param viewPort {H.map.ViewPort} - An object representing the map viewport
    * @param viewModel {H.map.ViewModel} - An object representing a view of the map
    * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
    * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
    */
  def this(viewPort: ViewPort, viewModel: ViewModel, dataModel: DataModel, options: Options) = this()
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

