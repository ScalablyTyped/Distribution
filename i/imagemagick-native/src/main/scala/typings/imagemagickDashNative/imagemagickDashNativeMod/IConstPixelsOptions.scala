package typings.imagemagickDashNative.imagemagickDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstPixelsOptions extends js.Object {
  var columns: Double
  var rows: Double
  var srcData: Buffer
  var x: Double
  var y: Double
}

object IConstPixelsOptions {
  @scala.inline
  def apply(columns: Double, rows: Double, srcData: Buffer, x: Double, y: Double): IConstPixelsOptions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConstPixelsOptions]
  }
}

