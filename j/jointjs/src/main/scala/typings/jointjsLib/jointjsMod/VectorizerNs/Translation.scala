package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var tx: scala.Double
  var ty: scala.Double
}

object Translation {
  @scala.inline
  def apply(tx: scala.Double, ty: scala.Double): Translation = {
    val __obj = js.Dynamic.literal(tx = tx, ty = ty)
  
    __obj.asInstanceOf[Translation]
  }
}

