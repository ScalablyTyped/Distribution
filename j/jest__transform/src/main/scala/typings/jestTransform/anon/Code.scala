package typings.jestTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var mapCoverage: Boolean
  var sourceMapPath: String | Null
}

object Code {
  @scala.inline
  def apply(code: String, mapCoverage: Boolean, sourceMapPath: String = null): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], mapCoverage = mapCoverage.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

