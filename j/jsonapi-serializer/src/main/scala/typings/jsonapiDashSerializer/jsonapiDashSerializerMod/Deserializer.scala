package typings.jsonapiDashSerializer.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deserializer extends js.Object {
  def deserialize(data: js.Any): js.Promise[_] = js.native
  def deserialize(data: js.Any, callback: Callback): Unit = js.native
}

@JSImport("jsonapi-serializer", "Deserializer")
@js.native
class DeserializerCls protected () extends Deserializer {
  def this(opts: DeserializerOptions) = this()
}

