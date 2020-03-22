package typings.luminoDomutils.elementMod.ElementExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the min and max size data for an element.
  */
trait ISizeLimits extends js.Object {
  /**
    * The maximum height, in pixels.
    */
  var maxHeight: Double
  /**
    * The maximum width, in pixels.
    */
  var maxWidth: Double
  /**
    * The minimum height, in pixels.
    */
  var minHeight: Double
  /**
    * The minimum width, in pixels.
    */
  var minWidth: Double
}

object ISizeLimits {
  @scala.inline
  def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): ISizeLimits = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISizeLimits]
  }
}

