package typings
package jpegDashJsLib.jpegDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawImageData[D /* <: stdLib.Uint8Array */] extends js.Object {
  var data: D
  var height: scala.Double
  var width: scala.Double
}

object RawImageData {
  @scala.inline
  def apply[D /* <: stdLib.Uint8Array */](data: D, height: scala.Double, width: scala.Double): RawImageData[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height, width = width)
  
    __obj.asInstanceOf[RawImageData[D]]
  }
}

