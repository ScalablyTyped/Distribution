package typings.grpc.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDefinition[RequestType, ResponseType] extends StObject {
  
  /**
    * The method's URL path
    */
  var path: String = js.native
  
  /**
    * Deserialization function for request data
    */
  def requestDeserialize(data: Buffer): RequestType = js.native
  /**
    * Deserialization function for request data
    */
  @JSName("requestDeserialize")
  var requestDeserialize_Original: deserialize[RequestType] = js.native
  
  /**
    * Serialization function for request values
    */
  def requestSerialize(value: RequestType): Buffer = js.native
  /**
    * Serialization function for request values
    */
  @JSName("requestSerialize")
  var requestSerialize_Original: serialize[RequestType] = js.native
  
  /**
    * Indicates whether the method accepts a stream of requests
    */
  var requestStream: Boolean = js.native
  
  /**
    * Deserialization function for repsonse data
    */
  def responseDeserialize(data: Buffer): ResponseType = js.native
  /**
    * Deserialization function for repsonse data
    */
  @JSName("responseDeserialize")
  var responseDeserialize_Original: deserialize[ResponseType] = js.native
  
  /**
    * Serialization function for response values
    */
  def responseSerialize(value: ResponseType): Buffer = js.native
  /**
    * Serialization function for response values
    */
  @JSName("responseSerialize")
  var responseSerialize_Original: serialize[ResponseType] = js.native
  
  /**
    *  Indicates whether the method returns a stream of responses
    */
  var responseStream: Boolean = js.native
}
