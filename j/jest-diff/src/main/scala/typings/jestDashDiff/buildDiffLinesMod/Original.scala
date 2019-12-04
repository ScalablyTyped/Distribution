package typings.jestDashDiff.buildDiffLinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Original extends js.Object {
  var a: String
  var b: String
}

object Original {
  @scala.inline
  def apply(a: String, b: String): Original = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Original]
  }
}

