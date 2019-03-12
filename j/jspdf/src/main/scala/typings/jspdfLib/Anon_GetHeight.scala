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
    getHeight: () => scala.Double,
    getWidth: () => scala.Double,
    height: scala.Double,
    width: scala.Double
  ): Anon_GetHeight = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height, width = width)
  
    __obj.asInstanceOf[Anon_GetHeight]
  }
}

