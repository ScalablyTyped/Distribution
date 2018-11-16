package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "KeyedMessage")
@js.native
class KeyedMessage protected () extends js.Object {
  def this(key: java.lang.String, value: java.lang.String) = this()
  def this(key: java.lang.String, value: nodeLib.Buffer) = this()
}

