package typings.atJimpCore.typesJimpMod

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
    val __obj = js.Dynamic.literal(idx = idx, image = image.asInstanceOf[js.Any], x = x, y = y)
  
    __obj.asInstanceOf[ScanIteratorReturn[This]]
  }
}

