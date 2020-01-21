package typings.grpcGrpcJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunk[ResponseType] extends js.Object {
  def deserialize(chunk: Buffer): ResponseType
}

object AnonChunk {
  @scala.inline
  def apply[ResponseType](deserialize: Buffer => ResponseType): AnonChunk[ResponseType] = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize))
  
    __obj.asInstanceOf[AnonChunk[ResponseType]]
  }
}

