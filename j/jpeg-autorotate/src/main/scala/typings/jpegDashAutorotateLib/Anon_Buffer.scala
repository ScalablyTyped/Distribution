package typings
package jpegDashAutorotateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: nodeLib.Buffer
  var dimensions: jpegDashAutorotateLib.jpegDashAutorotateMod.RotateDimensions
  var orientation: scala.Double
  var quality: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply(
    buffer: nodeLib.Buffer,
    dimensions: jpegDashAutorotateLib.jpegDashAutorotateMod.RotateDimensions,
    orientation: scala.Double,
    quality: scala.Double
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, dimensions = dimensions, orientation = orientation, quality = quality)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

