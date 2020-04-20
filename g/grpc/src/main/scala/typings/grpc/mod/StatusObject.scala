package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusObject extends js.Object {
  /**
    * The error code, a key of `grpc.status`
    */
  var code: status
  /**
    * Human-readable description of the status
    */
  var details: String
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: Metadata
}

object StatusObject {
  @scala.inline
  def apply(code: status, details: String, metadata: Metadata): StatusObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusObject]
  }
}

