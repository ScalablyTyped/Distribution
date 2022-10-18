package typings.lesgo

import typings.awsSdk.clientsSqsMod.SendMessageResult
import typings.awsSdk.clientsSqsMod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesSqsserviceMod {
  
  @JSImport("lesgo/services/SQSService", JSImport.Default)
  @js.native
  open class default[TQueues /* <: Record[String, QueueConfig] */] ()
    extends StObject
       with SQSService[TQueues] {
    def this(opts: SQSServiceParams) = this()
    def this(opts: Unit, queues: TQueues) = this()
    def this(opts: SQSServiceParams, queues: TQueues) = this()
    
    /* CompleteClass */
    override def dispatch(payload: Any, queueName: /* keyof TQueues */ String): js.Promise[SendMessageResult] = js.native
    
    /* CompleteClass */
    var queues: TQueues = js.native
    
    /* CompleteClass */
    var sqsClient: ^ = js.native
  }
  
  trait QueueConfig extends StObject {
    
    var url: String
  }
  object QueueConfig {
    
    inline def apply(url: String): QueueConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueConfig]
    }
    
    extension [Self <: QueueConfig](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQSService[TQueues /* <: Record[String, QueueConfig] */] extends StObject {
    
    def dispatch(payload: Any, queueName: /* keyof TQueues */ String): js.Promise[SendMessageResult]
    
    var queues: TQueues
    
    var sqsClient: ^
  }
  object SQSService {
    
    inline def apply[TQueues /* <: Record[String, QueueConfig] */](
      dispatch: (Any, /* keyof TQueues */ String) => js.Promise[SendMessageResult],
      queues: TQueues,
      sqsClient: ^
    ): SQSService[TQueues] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction2(dispatch), queues = queues.asInstanceOf[js.Any], sqsClient = sqsClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSService[TQueues]]
    }
    
    extension [Self <: SQSService[?], TQueues /* <: Record[String, QueueConfig] */](x: Self & SQSService[TQueues]) {
      
      inline def setDispatch(value: (Any, /* keyof TQueues */ String) => js.Promise[SendMessageResult]): Self = StObject.set(x, "dispatch", js.Any.fromFunction2(value))
      
      inline def setQueues(value: TQueues): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setSqsClient(value: ^): Self = StObject.set(x, "sqsClient", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQSServiceParams extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
  }
  object SQSServiceParams {
    
    inline def apply(): SQSServiceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SQSServiceParams]
    }
    
    extension [Self <: SQSServiceParams](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    }
  }
}
