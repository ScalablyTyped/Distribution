package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var tx: Double
  var ty: Double
}

object Translation {
  @scala.inline
  def apply(tx: Double, ty: Double): Translation = {
    val __obj = js.Dynamic.literal(tx = tx, ty = ty)
  
    __obj.asInstanceOf[Translation]
  }
}

