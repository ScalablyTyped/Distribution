package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSProtocolError")
@js.native
open class KafkaJSProtocolError protected () extends KafkaJSError {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  
  val code: Double = js.native
  
  val `type`: String = js.native
}
