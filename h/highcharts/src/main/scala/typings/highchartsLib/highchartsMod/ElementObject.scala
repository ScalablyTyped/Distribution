package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Element class is a JavaScript wrapper for SVG elements used in the rendering layer of Highchart. Combined with
  * the Renderer object, these elements allows freeform annotation in the charts or even in your HTML pages without
  * creating a chart at all.
  */
@js.native
trait ElementObject extends js.Object {
  /**
    * Add the element to the renderer canvas.
    * @param  parent The element can be added to a g (group) element.
    * @since 2.0
    */
  def add(): ElementObject = js.native
  def add(parent: ElementObject): ElementObject = js.native
  /**
    * Apply numeric attributes to the SVG/VML element by animation. See Element.attr() for more information on setting
    * attributes.
    * @param  attributes A set of attributes to apply.
    * @param  animation Optional animation parameters that are passed over to jQuery or other framework.
    * Valid properties depend on the library, but options like duration, easing and complete are supported by jQuery.
    * @since 2.0
    */
  def animate(attributes: js.Any): ElementObject = js.native
  def animate(attributes: js.Any, animation: js.Any): ElementObject = js.native
  /**
    * Apply attributes to the SVG/VML elements. These attributes for the most parts correspond to SVG, but some are
    * specific to Highcharts, like zIndex and rotation.
    *
    * In order to set the rotation center for rotation, set x and y to 0 and use translateX and translateY attributes
    * to position the element instead.
    *
    * Attributes frequently used in Highcharts are fill, stroke, stroke-width.
    * @param  hash A set of attributes to apply.
    * @since 2.0
    */
  def attr(hash: js.Any): ElementObject = js.native
  /**
    * Apply some CSS properties to the element
    * @param hash The object literal of CSS properties to apply. Properties should be hyphenated, not camelCased.
    * @since 2.0
    */
  def css(hash: js.Object): ElementObject = js.native
  /**
    * Destroy the element and free up memory
    * @since 2.0
    */
  def destroy(): scala.Unit = js.native
  def fadeOut(): scala.Unit = js.native
  def fadeOut(duration: scala.Double): scala.Unit = js.native
  /**
    * Get the bounding box of the element
    * @return An object containing x, y, width and height values for the element.
    * @since 2.0
    */
  def getBBox(): highchartsLib.Anon_Height = js.native
  /**
    * Apply an event handler to the element
    * @param eventType The event type to attach, for example 'click', 'mouseover', 'touch'.
    * @param handler The event handler function.
    * @since 2.0
    */
  def on(eventType: java.lang.String, handler: js.Function0[scala.Unit]): ElementObject = js.native
  /**
    * Bring the element to the front. Alternatively, a zIndex attribute can be given.
    * @return The element object
    * @since 2.0
    */
  def toFront(): ElementObject = js.native
}

