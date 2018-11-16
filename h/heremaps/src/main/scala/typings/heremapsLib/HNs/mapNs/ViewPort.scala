package typings
package heremapsLib.HNs.mapNs

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
class ViewPort protected ()
  extends heremapsLib.HNs.utilNs.EventTarget
     with IInteraction {
  /**
               * Constructor
               * @param element {Element} - html element were map will be rendered
               * @param opt_options {H.map.ViewPort.Options=} - optional configuration parameters
               */
  def this(element: stdLib.Element) = this()
  /**
               * Constructor
               * @param element {Element} - html element were map will be rendered
               * @param opt_options {H.map.ViewPort.Options=} - optional configuration parameters
               */
  def this(element: stdLib.Element, opt_options: heremapsLib.HNs.mapNs.ViewPortNs.Options) = this()
  var center: heremapsLib.HNs.mathNs.Point = js.native
  var element: stdLib.Element = js.native
  var height: scala.Double = js.native
  var margin: scala.Double = js.native
  var padding: heremapsLib.HNs.mapNs.ViewPortNs.Padding = js.native
  var width: scala.Double = js.native
  /**
               * This method adds callback which is triggered when the object is being disposed
               * @param callback {Function} - The callback function.
               * @param opt_scope {Object=} - An optional scope to call the callback in.
               */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
               * This method updates size of the viewport according to container size. It must be called whenever the HTML element changed size in order to update the map&#x27;s viewport values.
               */
  def resize(): scala.Unit = js.native
  /**
               * This method sets the margin on the viewPort
               * @param margin {number} - margin which is used to fetch map data
               */
  def setMargin(margin: scala.Double): scala.Unit = js.native
  /**
               * This method sets the padding on the viewport. Padding will result in shifted map center which will be the visual center of the padded area.
               * @param top {number} - padding from the top
               * @param right {number} - padding from the right
               * @param bottom {number} - padding from the bottom
               * @param left {number} - padding from the left
               */
  def setPadding(top: scala.Double, right: scala.Double, bottom: scala.Double, left: scala.Double): scala.Unit = js.native
}

