package typings.atJimpCore.typesEtcMod

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
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[Bitmap]
  }
}

