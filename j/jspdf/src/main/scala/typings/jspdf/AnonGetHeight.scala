package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetHeight extends js.Object {
  var height: Double
  var width: Double
  def getHeight(): Double
  def getWidth(): Double
}

object AnonGetHeight {
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double, height: Double, width: Double): AnonGetHeight = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetHeight]
  }
}

