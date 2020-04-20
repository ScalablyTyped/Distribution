package typings.jimpCore.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffReturn[This] extends js.Object {
  var image: This
  var percent: Double
}

object DiffReturn {
  @scala.inline
  def apply[This](image: This, percent: Double): DiffReturn[This] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffReturn[This]]
  }
}

