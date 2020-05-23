package typings.libxmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxError extends js.Object {
  var code: Double | Null
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: Double
  var domain: Double | Null
  var file: String | Null
  var int1: Double | Null
  var level: Double | Null
  var line: Double | Null
  var message: String | Null
  var str1: Double | Null
  var str2: Double | Null
  var str3: Double | Null
}

object SyntaxError {
  @scala.inline
  def apply(
    column: Double,
    code: Double = null.asInstanceOf[Double],
    domain: Double = null.asInstanceOf[Double],
    file: String = null,
    int1: Double = null.asInstanceOf[Double],
    level: Double = null.asInstanceOf[Double],
    line: Double = null.asInstanceOf[Double],
    message: String = null,
    str1: Double = null.asInstanceOf[Double],
    str2: Double = null.asInstanceOf[Double],
    str3: Double = null.asInstanceOf[Double]
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], int1 = int1.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], str1 = str1.asInstanceOf[js.Any], str2 = str2.asInstanceOf[js.Any], str3 = str3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError]
  }
}

