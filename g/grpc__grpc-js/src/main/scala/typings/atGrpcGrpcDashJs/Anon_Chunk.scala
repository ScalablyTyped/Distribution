package typings.atGrpcGrpcDashJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chunk[ResponseType] extends js.Object {
  def deserialize(chunk: Buffer): ResponseType
}

object Anon_Chunk {
  @scala.inline
  def apply[ResponseType](deserialize: Buffer => ResponseType): Anon_Chunk[ResponseType] = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize))
  
    __obj.asInstanceOf[Anon_Chunk[ResponseType]]
  }
}

