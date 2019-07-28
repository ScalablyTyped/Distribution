package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateComponent extends js.Object {
  var count: Double
  var depth: Double
  var mode: String
  var tag: String
}

object HydrateComponent {
  @scala.inline
  def apply(count: Double, depth: Double, mode: String, tag: String): HydrateComponent = {
    val __obj = js.Dynamic.literal(count = count, depth = depth, mode = mode, tag = tag)
  
    __obj.asInstanceOf[HydrateComponent]
  }
}

