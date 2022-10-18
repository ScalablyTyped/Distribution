package typings.kafkajs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSError")
@js.native
open class KafkaJSError protected ()
  extends StObject
     with Error {
  def this(e: String) = this()
  def this(e: js.Error) = this()
  def this(e: String, metadata: KafkaJSErrorMetadata) = this()
  def this(e: js.Error, metadata: KafkaJSErrorMetadata) = this()
  
  @JSName("cause")
  val cause_KafkaJSError: js.UndefOr[js.Error] = js.native
  
  val helpUrl: js.UndefOr[String] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  val retriable: Boolean = js.native
}
