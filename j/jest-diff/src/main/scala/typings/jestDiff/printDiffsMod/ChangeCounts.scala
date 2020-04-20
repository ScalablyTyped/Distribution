package typings.jestDiff.printDiffsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeCounts extends js.Object {
  var a: Double
  var b: Double
}

object ChangeCounts {
  @scala.inline
  def apply(a: Double, b: Double): ChangeCounts = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCounts]
  }
}

