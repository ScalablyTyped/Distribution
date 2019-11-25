package typings.jpegDashAutorotate

import typings.jpegDashAutorotate.jpegDashAutorotateMod.RotateDimensions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: Buffer
  var dimensions: RotateDimensions
  var orientation: Double
  var quality: Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: Buffer, dimensions: RotateDimensions, orientation: Double, quality: Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

