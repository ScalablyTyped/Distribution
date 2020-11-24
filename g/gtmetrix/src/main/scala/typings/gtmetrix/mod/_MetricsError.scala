package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MetricsError extends js.Object
object _MetricsError {
  
  @scala.inline
  def InvalidResponseError(contentType: String, message: String, name: String, statusCode: Double): _MetricsError = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MetricsError]
  }
  
  @scala.inline
  def ApiError(contentType: String, message: String, name: String, statusCode: Double): _MetricsError = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MetricsError]
  }
}
