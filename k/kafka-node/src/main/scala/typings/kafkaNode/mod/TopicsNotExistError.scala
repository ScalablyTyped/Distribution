package typings.kafkaNode.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "TopicsNotExistError")
@js.native
class TopicsNotExistError ()
  extends StObject
     with Error {
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var topics: String | js.Array[String] = js.native
}
