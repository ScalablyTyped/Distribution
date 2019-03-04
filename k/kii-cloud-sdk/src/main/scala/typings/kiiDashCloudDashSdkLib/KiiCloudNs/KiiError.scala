package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiError extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
  var status: scala.Double
}

object KiiError {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String, status: scala.Double): KiiError = {
    val __obj = js.Dynamic.literal(code = code, message = message, status = status)
  
    __obj.asInstanceOf[KiiError]
  }
}

