package typings.hapiWreck.mod.Client

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/wreck", "Client.toReadableStream")
@js.native
object toReadableStream extends js.Object {
  type Item = String | Buffer
  type Payload = Item | js.Array[Item]
}

