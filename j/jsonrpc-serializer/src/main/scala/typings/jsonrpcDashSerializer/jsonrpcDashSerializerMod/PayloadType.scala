package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.request
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.notification
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.success
  - typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.error
*/
trait PayloadType extends js.Object

object PayloadType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.error = this.cast("error")
  @scala.inline
  def notification: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.notification = this.cast("notification")
  @scala.inline
  def request: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.request = this.cast("request")
  @scala.inline
  def success: typings.jsonrpcDashSerializer.jsonrpcDashSerializerStrings.success = this.cast("success")
}

