package typings.jsonapiDashSerializer.jsonapiDashSerializerMod

import org.scalablytyped.runtime.TopLevel
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
object Deserializer extends TopLevel[DeserializerConstructor]

