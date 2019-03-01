package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bitmap extends js.Object {
  var data: nodeLib.Buffer
  var height: scala.Double
  var width: scala.Double
}

object Bitmap {
  @scala.inline
  def apply(data: nodeLib.Buffer, height: scala.Double, width: scala.Double): Bitmap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Bitmap]
  }
}

