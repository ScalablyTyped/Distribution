package typings.jimpCore.etcMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bitmap extends js.Object {
  var data: Buffer
  var height: Double
  var width: Double
}

object Bitmap {
  @scala.inline
  def apply(data: Buffer, height: Double, width: Double): Bitmap = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bitmap]
  }
}

