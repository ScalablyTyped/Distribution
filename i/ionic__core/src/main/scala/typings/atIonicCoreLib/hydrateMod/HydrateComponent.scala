package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateComponent extends js.Object {
  var count: scala.Double
  var depth: scala.Double
  var mode: java.lang.String
  var tag: java.lang.String
}

object HydrateComponent {
  @scala.inline
  def apply(count: scala.Double, depth: scala.Double, mode: java.lang.String, tag: java.lang.String): HydrateComponent = {
    val __obj = js.Dynamic.literal(count = count, depth = depth, mode = mode, tag = tag)
  
    __obj.asInstanceOf[HydrateComponent]
  }
}

