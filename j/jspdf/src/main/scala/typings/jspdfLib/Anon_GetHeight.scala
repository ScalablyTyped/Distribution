package typings
package jspdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHeight extends js.Object {
  var height: scala.Double
  var width: scala.Double
  def getHeight(): scala.Double
  def getWidth(): scala.Double
}

object Anon_GetHeight {
  @scala.inline
  def apply(
    getHeight: js.Function0[scala.Double],
    getWidth: js.Function0[scala.Double],
    height: scala.Double,
    width: scala.Double
  ): Anon_GetHeight = {
    val __obj = js.Dynamic.literal(getHeight = getHeight, getWidth = getWidth, height = height, width = width)
  
    __obj.asInstanceOf[Anon_GetHeight]
  }
}

