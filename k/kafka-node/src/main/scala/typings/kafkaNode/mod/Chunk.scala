package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunk: ProduceRequest
}

object Chunk {
  @scala.inline
  def apply(chunk: ProduceRequest): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

