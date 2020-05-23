package typings.justifiedLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Computed positional and sizing properties of a box in the layout.
  */
trait LayoutBox extends js.Object {
  /**
    * Aspect ratio of the box.
    */
  var aspectRatio: Double
  /**
    * Height of the box in a justified layout.
    */
  var height: Double
  /**
    * Distance between the left side of the box and the left boundary of the justified layout.
    */
  var left: Double
  /**
    * Distance between the top side of the box and the top boundary of the justified layout.
    */
  var top: Double
  /**
    * Width of the box in a justified layout.
    */
  var width: Double
}

object LayoutBox {
  @scala.inline
  def apply(aspectRatio: Double, height: Double, left: Double, top: Double, width: Double): LayoutBox = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutBox]
  }
}

