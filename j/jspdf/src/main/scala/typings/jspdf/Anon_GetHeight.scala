package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHeight extends js.Object {
  var height: Double
  var width: Double
  def getHeight(): Double
  def getWidth(): Double
}

object Anon_GetHeight {
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double, height: Double, width: Double): Anon_GetHeight = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetHeight]
  }
}

