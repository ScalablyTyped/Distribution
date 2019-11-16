package typings.atJestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: String
  var mapCoverage: Boolean
  var sourceMapPath: String | Null
}

object Anon_Code {
  @scala.inline
  def apply(code: String, mapCoverage: Boolean, sourceMapPath: String = null): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, mapCoverage = mapCoverage)
    if (sourceMapPath != null) __obj.updateDynamic("sourceMapPath")(sourceMapPath)
    __obj.asInstanceOf[Anon_Code]
  }
}

