package typings.mapboxDashGl

import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Uint8Array | Uint8ClampedArray
  var height: Double
  var width: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: Uint8Array | Uint8ClampedArray, height: Double, width: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

