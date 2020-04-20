package typings.luminoDatagrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor1 extends js.Object {
  /**
    * The first color stop for the shadow.
    */
  val color1: String
  /**
    * The second color stop for the shadow.
    */
  val color2: String
  /**
    * The third color stop for the shadow.
    */
  val color3: String
  /**
    * The size of the shadow, in pixels.
    */
  val size: Double
}

object AnonColor1 {
  @scala.inline
  def apply(color1: String, color2: String, color3: String, size: Double): AnonColor1 = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], color3 = color3.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor1]
  }
}

