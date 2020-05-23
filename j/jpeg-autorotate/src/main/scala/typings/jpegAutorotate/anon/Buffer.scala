package typings.jpegAutorotate.anon

import typings.jpegAutorotate.mod.RotateDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: typings.node.Buffer
  var dimensions: RotateDimensions
  var orientation: Double
  var quality: Double
}

object Buffer {
  @scala.inline
  def apply(buffer: typings.node.Buffer, dimensions: RotateDimensions, orientation: Double, quality: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

