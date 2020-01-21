package typings.materialUiCore.shapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var borderRadius: Double = js.native
}

object Shape {
  @scala.inline
  def apply(borderRadius: Double): Shape = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shape]
  }
}

