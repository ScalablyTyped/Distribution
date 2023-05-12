package typings.heremaps.global.H.map

import typings.heremaps.H.map.ViewPort.Options
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ViewPort object holds information about the HTML element where the map is rendered. It contains information regarding the element (view port) size and triggers events when the element size
  * is changed.
  * element {Element} - This property holds the HTML element, which defines the viewport.
  * width {number} - This property holds this viewport&#x27;s current width
  * height {number} - This property holds this viewport&#x27;s current height
  * margin {number} - This property holds this viewport&#x27;s current margin value
  * padding {H.map.ViewPort.Padding} - This property holds this viewport&#x27;s current padding
  * center {H.math.Point} - This property holds this viewport&#x27;s current center point
  */
@JSGlobal("H.map.ViewPort")
@js.native
open class ViewPort protected ()
  extends StObject
     with typings.heremaps.H.map.ViewPort {
  /**
    * Constructor
    * @param element {Element} - html element were map will be rendered
    * @param opt_options {H.map.ViewPort.Options=} - optional configuration parameters
    */
  def this(element: Element) = this()
  def this(element: Element, opt_options: Options) = this()
}
