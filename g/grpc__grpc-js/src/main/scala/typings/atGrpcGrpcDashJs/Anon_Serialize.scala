package typings.atGrpcGrpcDashJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Serialize[RequestType] extends js.Object {
  def serialize(value: RequestType): Buffer
}

object Anon_Serialize {
  @scala.inline
  def apply[RequestType](serialize: RequestType => Buffer): Anon_Serialize[RequestType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Anon_Serialize[RequestType]]
  }
}

