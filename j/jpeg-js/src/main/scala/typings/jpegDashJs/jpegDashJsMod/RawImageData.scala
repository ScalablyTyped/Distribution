package typings.jpegDashJs.jpegDashJsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawImageData[D /* <: Uint8Array */] extends js.Object {
  var data: D
  var height: Double
  var width: Double
}

object RawImageData {
  @scala.inline
  def apply[D /* <: Uint8Array */](data: D, height: Double, width: Double): RawImageData[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height, width = width)
  
    __obj.asInstanceOf[RawImageData[D]]
  }
}

