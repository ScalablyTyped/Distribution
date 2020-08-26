package typings.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/catbox", "Client")
@js.native
class Client[T] protected () extends ClientApi[T] {
  def this(engine: EnginePrototypeOrObject) = this()
  def this(engine: EnginePrototypeOrObject, options: ClientOptions) = this()
}

