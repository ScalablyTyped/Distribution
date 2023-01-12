package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallStreamMod.Call
import typings.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typings.grpcGrpcJs.buildSrcCallStreamMod.WriteObject
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFilterMod {
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/filter", "BaseFilter")
  @js.native
  open class BaseFilter ()
    extends StObject
       with Filter {
    
    /* CompleteClass */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def receiveMetadata(metadata: Metadata): Metadata = js.native
    
    /* CompleteClass */
    override def receiveTrailers(status: StatusObject): StatusObject = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /* CompleteClass */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    
    /* CompleteClass */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  trait Filter extends StObject {
    
    def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer]
    
    def receiveMetadata(metadata: Metadata): Metadata
    
    def receiveTrailers(status: StatusObject): StatusObject
    
    def refresh(): Unit
    
    def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject]
    
    def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata]
  }
  object Filter {
    
    inline def apply(
      receiveMessage: js.Promise[Buffer] => js.Promise[Buffer],
      receiveMetadata: Metadata => Metadata,
      receiveTrailers: StatusObject => StatusObject,
      refresh: () => Unit,
      sendMessage: js.Promise[WriteObject] => js.Promise[WriteObject],
      sendMetadata: js.Promise[Metadata] => js.Promise[Metadata]
    ): Filter = {
      val __obj = js.Dynamic.literal(receiveMessage = js.Any.fromFunction1(receiveMessage), receiveMetadata = js.Any.fromFunction1(receiveMetadata), receiveTrailers = js.Any.fromFunction1(receiveTrailers), refresh = js.Any.fromFunction0(refresh), sendMessage = js.Any.fromFunction1(sendMessage), sendMetadata = js.Any.fromFunction1(sendMetadata))
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setReceiveMessage(value: js.Promise[Buffer] => js.Promise[Buffer]): Self = StObject.set(x, "receiveMessage", js.Any.fromFunction1(value))
      
      inline def setReceiveMetadata(value: Metadata => Metadata): Self = StObject.set(x, "receiveMetadata", js.Any.fromFunction1(value))
      
      inline def setReceiveTrailers(value: StatusObject => StatusObject): Self = StObject.set(x, "receiveTrailers", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setSendMessage(value: js.Promise[WriteObject] => js.Promise[WriteObject]): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
      
      inline def setSendMetadata(value: js.Promise[Metadata] => js.Promise[Metadata]): Self = StObject.set(x, "sendMetadata", js.Any.fromFunction1(value))
    }
  }
  
  trait FilterFactory[T /* <: Filter */] extends StObject {
    
    def createFilter(callStream: Call): T
  }
  object FilterFactory {
    
    inline def apply[T /* <: Filter */](createFilter: Call => T): FilterFactory[T] = {
      val __obj = js.Dynamic.literal(createFilter = js.Any.fromFunction1(createFilter))
      __obj.asInstanceOf[FilterFactory[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterFactory[?], T /* <: Filter */] (val x: Self & FilterFactory[T]) extends AnyVal {
      
      inline def setCreateFilter(value: Call => T): Self = StObject.set(x, "createFilter", js.Any.fromFunction1(value))
    }
  }
}
