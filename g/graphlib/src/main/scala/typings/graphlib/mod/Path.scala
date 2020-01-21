package typings.graphlib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var distance: Double
  var predecessor: String
}

object Path {
  @scala.inline
  def apply(distance: Double, predecessor: String): Path = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], predecessor = predecessor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Path]
  }
}

