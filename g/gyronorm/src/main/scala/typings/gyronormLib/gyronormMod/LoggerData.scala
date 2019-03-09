package typings
package gyronormLib.gyronormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerData extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object LoggerData {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): LoggerData = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[LoggerData]
  }
}

