package typings.heremaps.H.map

import typings.heremaps.H.map.ViewPort.Options
import typings.heremaps.H.map.ViewPort.Padding
import typings.heremaps.H.math.Point
import typings.heremaps.H.util.EventTarget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ViewPort object holds information about the HTML element where the map is rendered. It contains information regarding the element (view port) size and triggers events when the element size
  * is changed.
  * @property element {Element} - This property holds the HTML element, which defines the viewport.
  * @property width {number} - This property holds this viewport&#x27;s current width
  * @property height {number} - This property holds this viewport&#x27;s current height
  * @property margin {number} - This property holds this viewport&#x27;s current margin value
  * @property padding {H.map.ViewPort.Padding} - This property holds this viewport&#x27;s current padding
  * @property center {H.math.Point} - This property holds this viewport&#x27;s current center point
  */
@JSGlobal("H.map.ViewPort")
@js.native
class ViewPort_ protected ()
  extends EventTarget
     with IInteraction {
  /**
    * Constructor
    * @param element {Element} - html element were map will be rendered
    * @param opt_options {H.map.ViewPort.Options=} - optional configuration parameters
    */
  def this(element: Element) = this()
  def this(element: Element, opt_options: Options) = this()
  var center: Point = js.native
  var element: Element = js.native
  var height: Double = js.native
  var margin: Double = js.native
  var padding: Padding = js.native
  var width: Double = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * This method updates size of the viewport according to container size. It must be called whenever the HTML element changed size in order to update the map&#x27;s viewport values.
    */
  def resize(): Unit = js.native
  /**
    * This method sets the margin on the viewPort
    * @param margin {number} - margin which is used to fetch map data
    */
  def setMargin(margin: Double): Unit = js.native
  /**
    * This method sets the padding on the viewport. Padding will result in shifted map center which will be the visual center of the padded area.
    * @param top {number} - padding from the top
    * @param right {number} - padding from the right
    * @param bottom {number} - padding from the bottom
    * @param left {number} - padding from the left
    */
  def setPadding(top: Double, right: Double, bottom: Double, left: Double): Unit = js.native
}

