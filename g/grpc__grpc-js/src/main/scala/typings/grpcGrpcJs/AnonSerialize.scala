package typings.grpcGrpcJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSerialize[RequestType] extends js.Object {
  def serialize(value: RequestType): Buffer
}

object AnonSerialize {
  @scala.inline
  def apply[RequestType](serialize: RequestType => Buffer): AnonSerialize[RequestType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonSerialize[RequestType]]
  }
}

