package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxError extends js.Object {
  var code: scala.Double | scala.Null
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: scala.Double
  var domain: scala.Double | scala.Null
  var file: java.lang.String | scala.Null
  var int1: scala.Double | scala.Null
  var level: scala.Double | scala.Null
  var line: scala.Double | scala.Null
  var message: java.lang.String | scala.Null
  var str1: scala.Double | scala.Null
  var str2: scala.Double | scala.Null
  var str3: scala.Double | scala.Null
}

object SyntaxError {
  @scala.inline
  def apply(
    column: scala.Double,
    code: scala.Int | scala.Double = null,
    domain: scala.Int | scala.Double = null,
    file: java.lang.String = null,
    int1: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    str1: scala.Int | scala.Double = null,
    str2: scala.Int | scala.Double = null,
    str3: scala.Int | scala.Double = null
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (int1 != null) __obj.updateDynamic("int1")(int1.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (str1 != null) __obj.updateDynamic("str1")(str1.asInstanceOf[js.Any])
    if (str2 != null) __obj.updateDynamic("str2")(str2.asInstanceOf[js.Any])
    if (str3 != null) __obj.updateDynamic("str3")(str3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError]
  }
}

