package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.request
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.notification
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.success
  - typings.jsonrpcSerializer.jsonrpcSerializerStrings.error
*/
trait PayloadType extends js.Object

object PayloadType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jsonrpcSerializer.jsonrpcSerializerStrings.error = this.cast("error")
  @scala.inline
  def notification: typings.jsonrpcSerializer.jsonrpcSerializerStrings.notification = this.cast("notification")
  @scala.inline
  def request: typings.jsonrpcSerializer.jsonrpcSerializerStrings.request = this.cast("request")
  @scala.inline
  def success: typings.jsonrpcSerializer.jsonrpcSerializerStrings.success = this.cast("success")
}

