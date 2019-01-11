package typings
package matcherLib.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matcher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(inputs: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def apply(
    inputs: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: matcherLib.matcherMod.matcherNs.Options
  ): js.Array[java.lang.String] = js.native
  def isMatch(input: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def isMatch(
    input: java.lang.String,
    pattern: java.lang.String,
    options: matcherLib.matcherMod.matcherNs.Options
  ): scala.Boolean = js.native
}

