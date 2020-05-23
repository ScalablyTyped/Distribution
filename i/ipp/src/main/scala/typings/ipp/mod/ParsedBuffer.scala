package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedBuffer extends js.Object {
  var data: String
  var id: Double
  var operation: PrinterOpertaion
  var statusCode: StatusCode
  var version: String
}

object ParsedBuffer {
  @scala.inline
  def apply(data: String, id: Double, operation: PrinterOpertaion, statusCode: StatusCode, version: String): ParsedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedBuffer]
  }
}

