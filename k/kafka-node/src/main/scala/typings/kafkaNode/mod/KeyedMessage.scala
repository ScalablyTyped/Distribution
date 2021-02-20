package typings.kafkaNode.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "KeyedMessage")
@js.native
class KeyedMessage protected () extends StObject {
  def this(key: String, value: String) = this()
  def this(key: String, value: Buffer) = this()
  def this(key: Buffer, value: String) = this()
  def this(key: Buffer, value: Buffer) = this()
  
  var key: String | Buffer = js.native
  
  var value: String | Buffer = js.native
}
