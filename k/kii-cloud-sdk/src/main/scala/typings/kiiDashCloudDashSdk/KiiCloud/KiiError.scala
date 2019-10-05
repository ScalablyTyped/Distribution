package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiError extends js.Object {
  var code: String
  var message: String
  var status: Double
}

object KiiError {
  @scala.inline
  def apply(code: String, message: String, status: Double): KiiError = {
    val __obj = js.Dynamic.literal(code = code, message = message, status = status)
  
    __obj.asInstanceOf[KiiError]
  }
}

