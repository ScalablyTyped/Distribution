package typings.grpcGrpcJs.serverCallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grpcGrpcJs.grpcGrpcJsStrings.bidi
  - typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream
  - typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream
  - typings.grpcGrpcJs.grpcGrpcJsStrings.unary
*/
trait HandlerType extends js.Object

object HandlerType {
  @scala.inline
  def bidi: typings.grpcGrpcJs.grpcGrpcJsStrings.bidi = this.cast("bidi")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clientStream: typings.grpcGrpcJs.grpcGrpcJsStrings.clientStream = this.cast("clientStream")
  @scala.inline
  def serverStream: typings.grpcGrpcJs.grpcGrpcJsStrings.serverStream = this.cast("serverStream")
  @scala.inline
  def unary: typings.grpcGrpcJs.grpcGrpcJsStrings.unary = this.cast("unary")
}

