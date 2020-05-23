package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeight extends js.Object {
  var height: Double
  var width: Double
  def getHeight(): Double
  def getWidth(): Double
}

object GetHeight {
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double, height: Double, width: Double): GetHeight = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeight]
  }
}

