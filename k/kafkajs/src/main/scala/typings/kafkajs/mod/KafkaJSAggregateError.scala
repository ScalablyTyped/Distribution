package typings.kafkajs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafkajs", "KafkaJSAggregateError")
@js.native
open class KafkaJSAggregateError protected ()
  extends StObject
     with Error {
  def this(message: String, errors: js.Array[js.Error | String]) = this()
  def this(message: js.Error, errors: js.Array[js.Error | String]) = this()
  
  val errors: js.Array[js.Error | String] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
