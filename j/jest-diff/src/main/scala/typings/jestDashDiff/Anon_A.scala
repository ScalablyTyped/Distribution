package typings.jestDashDiff

import typings.jestDashDiff.buildPrintDiffsMod._StringDiffResult
import typings.jestDashDiff.jestDashDiffNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends _StringDiffResult {
  var a: String
  var b: String
  var isMultiline: `false`
}

object Anon_A {
  @scala.inline
  def apply(a: String, b: String, isMultiline: `false`): Anon_A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_A]
  }
}

