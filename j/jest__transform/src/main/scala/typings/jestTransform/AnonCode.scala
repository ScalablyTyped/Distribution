package typings.jestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var mapCoverage: Boolean
  var sourceMapPath: String | Null
}

object AnonCode {
  @scala.inline
  def apply(code: String, mapCoverage: Boolean, sourceMapPath: String = null): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], mapCoverage = mapCoverage.asInstanceOf[js.Any])
    if (sourceMapPath != null) __obj.updateDynamic("sourceMapPath")(sourceMapPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

