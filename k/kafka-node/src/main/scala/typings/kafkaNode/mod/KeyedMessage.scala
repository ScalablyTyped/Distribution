package typings.kafkaNode.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "KeyedMessage")
@js.native
class KeyedMessage protected () extends js.Object {
  def this(key: String, value: String) = this()
  def this(key: String, value: Buffer) = this()
  def this(key: Buffer, value: String) = this()
  def this(key: Buffer, value: Buffer) = this()
  var key: String | Buffer = js.native
  var value: String | Buffer = js.native
}

