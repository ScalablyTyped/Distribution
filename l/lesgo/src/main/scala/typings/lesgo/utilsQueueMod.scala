package typings.lesgo

import typings.awsSdk.clientsSqsMod.SendMessageResult
import typings.lesgo.servicesSqsserviceMod.QueueConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsQueueMod {
  
  @JSImport("lesgo/utils/queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lesgo/utils/queue", JSImport.Default)
  @js.native
  val default: typings.lesgo.servicesSqsserviceMod.default[Record[String, QueueConfig]] = js.native
  
  inline def dispatch(payload: Any, queueName: String): js.Promise[SendMessageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(payload.asInstanceOf[js.Any], queueName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageResult]]
}
