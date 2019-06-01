package typings
package luaparseLib.luaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var line: scala.Double
  var lineStart: scala.Double
  var range: js.Tuple2[scala.Double, scala.Double]
  var `type`: scala.Double
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(
    line: scala.Double,
    lineStart: scala.Double,
    range: js.Tuple2[scala.Double, scala.Double],
    `type`: scala.Double,
    value: java.lang.String
  ): Token = {
    val __obj = js.Dynamic.literal(line = line, lineStart = lineStart, range = range, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

