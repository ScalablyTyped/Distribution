package typings.grpc.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodDefinition[RequestType, ResponseType] extends StObject {
  
  /**
    * The method's URL path
    */
  var path: String
  
  /**
    * Deserialization function for request data
    */
  def requestDeserialize(data: Buffer): RequestType
  /**
    * Deserialization function for request data
    */
  @JSName("requestDeserialize")
  var requestDeserialize_Original: deserialize[RequestType]
  
  /**
    * Serialization function for request values
    */
  def requestSerialize(value: RequestType): Buffer
  /**
    * Serialization function for request values
    */
  @JSName("requestSerialize")
  var requestSerialize_Original: serialize[RequestType]
  
  /**
    * Indicates whether the method accepts a stream of requests
    */
  var requestStream: Boolean
  
  /**
    * Deserialization function for repsonse data
    */
  def responseDeserialize(data: Buffer): ResponseType
  /**
    * Deserialization function for repsonse data
    */
  @JSName("responseDeserialize")
  var responseDeserialize_Original: deserialize[ResponseType]
  
  /**
    * Serialization function for response values
    */
  def responseSerialize(value: ResponseType): Buffer
  /**
    * Serialization function for response values
    */
  @JSName("responseSerialize")
  var responseSerialize_Original: serialize[ResponseType]
  
  /**
    *  Indicates whether the method returns a stream of responses
    */
  var responseStream: Boolean
}
object MethodDefinition {
  
  inline def apply[RequestType, ResponseType](
    path: String,
    requestDeserialize: /* data */ Buffer => RequestType,
    requestSerialize: RequestType => Buffer,
    requestStream: Boolean,
    responseDeserialize: /* data */ Buffer => ResponseType,
    responseSerialize: ResponseType => Buffer,
    responseStream: Boolean
  ): MethodDefinition[RequestType, ResponseType] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition[RequestType, ResponseType]]
  }
  
  extension [Self <: MethodDefinition[?, ?], RequestType, ResponseType](x: Self & (MethodDefinition[RequestType, ResponseType])) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRequestDeserialize(value: /* data */ Buffer => RequestType): Self = StObject.set(x, "requestDeserialize", js.Any.fromFunction1(value))
    
    inline def setRequestSerialize(value: RequestType => Buffer): Self = StObject.set(x, "requestSerialize", js.Any.fromFunction1(value))
    
    inline def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
    
    inline def setResponseDeserialize(value: /* data */ Buffer => ResponseType): Self = StObject.set(x, "responseDeserialize", js.Any.fromFunction1(value))
    
    inline def setResponseSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "responseSerialize", js.Any.fromFunction1(value))
    
    inline def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
  }
}
