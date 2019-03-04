package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstPixelsOptions extends js.Object {
  var columns: scala.Double
  var rows: scala.Double
  var srcData: nodeLib.Buffer
  var x: scala.Double
  var y: scala.Double
}

object IConstPixelsOptions {
  @scala.inline
  def apply(
    columns: scala.Double,
    rows: scala.Double,
    srcData: nodeLib.Buffer,
    x: scala.Double,
    y: scala.Double
  ): IConstPixelsOptions = {
    val __obj = js.Dynamic.literal(columns = columns, rows = rows, srcData = srcData, x = x, y = y)
  
    __obj.asInstanceOf[IConstPixelsOptions]
  }
}

