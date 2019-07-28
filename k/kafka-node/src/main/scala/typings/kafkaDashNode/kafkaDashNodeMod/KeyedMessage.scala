package typings.kafkaDashNode.kafkaDashNodeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "KeyedMessage")
@js.native
class KeyedMessage protected () extends js.Object {
  def this(key: String, value: String) = this()
  def this(key: String, value: Buffer) = this()
}

