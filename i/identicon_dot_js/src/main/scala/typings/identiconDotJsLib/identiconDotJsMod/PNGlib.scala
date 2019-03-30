package typings
package identiconDotJsLib.identiconDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGlib extends js.Object {
  var depth: scala.Double
  var height: scala.Double
  var width: scala.Double
  /**
    * Returns the image as a base64 encoded string.
    */
  def getBase64(): java.lang.String
  /**
    * Returns the png as a string.
    */
  def getDump(): java.lang.String
  /**
    * Returns the index of a given pixel in the image data array.
    * @param x The given x coordinate of the pixel.
    * @param y The given y coordinate of the pixel.
    */
  def index(x: scala.Double, y: scala.Double): scala.Double
}

object PNGlib {
  @scala.inline
  def apply(
    depth: scala.Double,
    getBase64: () => java.lang.String,
    getDump: () => java.lang.String,
    height: scala.Double,
    index: (scala.Double, scala.Double) => scala.Double,
    width: scala.Double
  ): PNGlib = {
    val __obj = js.Dynamic.literal(depth = depth, getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height, index = js.Any.fromFunction2(index), width = width)
  
    __obj.asInstanceOf[PNGlib]
  }
}

