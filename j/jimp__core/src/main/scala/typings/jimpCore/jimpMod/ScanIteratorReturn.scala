package typings.jimpCore.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanIteratorReturn[This] extends js.Object {
  var idx: Double
  var image: This
  var x: Double
  var y: Double
}

object ScanIteratorReturn {
  @scala.inline
  def apply[This](idx: Double, image: This, x: Double, y: Double): ScanIteratorReturn[This] = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanIteratorReturn[This]]
  }
}

