package typings.libxmljs.libxmljsMod

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
    code: Int | Double = null,
    domain: Int | Double = null,
    file: String = null,
    int1: Int | Double = null,
    level: Int | Double = null,
    line: Int | Double = null,
    message: String = null,
    str1: Int | Double = null,
    str2: Int | Double = null,
    str3: Int | Double = null
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (int1 != null) __obj.updateDynamic("int1")(int1.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (str1 != null) __obj.updateDynamic("str1")(str1.asInstanceOf[js.Any])
    if (str2 != null) __obj.updateDynamic("str2")(str2.asInstanceOf[js.Any])
    if (str3 != null) __obj.updateDynamic("str3")(str3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError]
  }
}

