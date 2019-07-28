package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Oval object is a shape that is drawn using the Oval Primitive tool. To determine if an item is an Oval object, use shape.isOvalObject. */
trait FlashOval extends js.Object {
  /** Read-only property; a Boolean value that specifies whether the Close Path check box in the Property inspector is selected. If the start angle and end angle values for the object are the same, setting this property has no effect until the values change. To set this value, use document.setOvalObjectProperty(). */
  var closePath: Boolean
  /** Read-only property; a float value that specifies the end angle of the Oval object. Acceptable values are from 0 to 360. */
  var endAngle: Double
  /** Read-only property; a float value that specifies the inner radius of the Oval object as a percentage. Acceptable values are from 0 to 99. */
  var innerRadius: Double
  /** Read-only property; a float value that specifies the start angle of the Oval object. Acceptable values are from 0 to 360. To set this value, use document.setOvalObjectProperty(). */
  var startAngle: Double
}

object FlashOval {
  @scala.inline
  def apply(closePath: Boolean, endAngle: Double, innerRadius: Double, startAngle: Double): FlashOval = {
    val __obj = js.Dynamic.literal(closePath = closePath, endAngle = endAngle, innerRadius = innerRadius, startAngle = startAngle)
  
    __obj.asInstanceOf[FlashOval]
  }
}

