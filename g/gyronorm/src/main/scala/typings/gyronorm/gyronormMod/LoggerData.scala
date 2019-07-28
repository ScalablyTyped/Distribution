package typings.gyronorm.gyronormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerData extends js.Object {
  var code: Double
  var message: String
}

object LoggerData {
  @scala.inline
  def apply(code: Double, message: String): LoggerData = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[LoggerData]
  }
}

