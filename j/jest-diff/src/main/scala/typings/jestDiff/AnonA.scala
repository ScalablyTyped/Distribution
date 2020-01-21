package typings.jestDiff

import typings.jestDiff.jestDiffBooleans.`false`
import typings.jestDiff.printDiffsMod._StringDiffResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends _StringDiffResult {
  var a: String
  var b: String
  var isMultiline: `false`
}

object AnonA {
  @scala.inline
  def apply(a: String, b: String, isMultiline: `false`): AnonA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonA]
  }
}

