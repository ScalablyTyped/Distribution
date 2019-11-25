package typings.jpegDashJs.jpegDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawImageData[T] extends js.Object {
  var data: T
  var height: Double
  var width: Double
}

object RawImageData {
  @scala.inline
  def apply[T](data: T, height: Double, width: Double): RawImageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawImageData[T]]
  }
}

