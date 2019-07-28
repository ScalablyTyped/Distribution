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
    val __obj = js.Dynamic.literal(columns = columns, rows = rows, srcData = srcData, x = x, y = y)
  
    __obj.asInstanceOf[IConstPixelsOptions]
  }
}

