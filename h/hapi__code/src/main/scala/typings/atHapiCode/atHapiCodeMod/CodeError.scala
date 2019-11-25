package typings.atHapiCode.atHapiCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeError extends js.Object {
  var column: String
  var filename: String
  var line: String
}

object CodeError {
  @scala.inline
  def apply(column: String, filename: String, line: String): CodeError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeError]
  }
}

