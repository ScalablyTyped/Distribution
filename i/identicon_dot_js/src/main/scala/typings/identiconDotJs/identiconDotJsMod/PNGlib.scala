package typings.identiconDotJs.identiconDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGlib extends js.Object {
  var depth: Double
  var height: Double
  var width: Double
  /**
    * Returns the image as a base64 encoded string.
    */
  def getBase64(): String
  /**
    * Returns the png as a string.
    */
  def getDump(): String
  /**
    * Returns the index of a given pixel in the image data array.
    * @param x The given x coordinate of the pixel.
    * @param y The given y coordinate of the pixel.
    */
  def index(x: Double, y: Double): Double
}

object PNGlib {
  @scala.inline
  def apply(
    depth: Double,
    getBase64: () => String,
    getDump: () => String,
    height: Double,
    index: (Double, Double) => Double,
    width: Double
  ): PNGlib = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height.asInstanceOf[js.Any], index = js.Any.fromFunction2(index), width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PNGlib]
  }
}

