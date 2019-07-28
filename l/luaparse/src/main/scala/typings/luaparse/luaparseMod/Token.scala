package typings.luaparse.luaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var line: Double
  var lineStart: Double
  var range: js.Tuple2[Double, Double]
  var `type`: Double
  var value: String
}

object Token {
  @scala.inline
  def apply(line: Double, lineStart: Double, range: js.Tuple2[Double, Double], `type`: Double, value: String): Token = {
    val __obj = js.Dynamic.literal(line = line, lineStart = lineStart, range = range, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

