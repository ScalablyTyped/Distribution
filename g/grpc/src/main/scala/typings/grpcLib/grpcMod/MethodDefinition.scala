package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinition[RequestType, ResponseType] extends js.Object {
  /**
       * The method's URL path
       */
  var path: java.lang.String = js.native
  /**
       * Deserialization function for request data
       */
  @JSName("requestDeserialize")
  var requestDeserialize_Original: deserialize[RequestType] = js.native
  /**
      * Serialization function for request values
      */
  @JSName("requestSerialize")
  var requestSerialize_Original: serialize[RequestType] = js.native
  /**
       * Indicates whether the method accepts a stream of requests
       */
  var requestStream: scala.Boolean = js.native
  /**
       * Deserialization function for repsonse data
       */
  @JSName("responseDeserialize")
  var responseDeserialize_Original: deserialize[ResponseType] = js.native
  /**
       * Serialization function for response values
       */
  @JSName("responseSerialize")
  var responseSerialize_Original: serialize[ResponseType] = js.native
  /**
       *  Indicates whether the method returns a stream of responses
       */
  var responseStream: scala.Boolean = js.native
  /**
       * Deserialization function for request data
       */
  def requestDeserialize(data: nodeLib.Buffer): RequestType = js.native
  /**
      * Serialization function for request values
      */
  def requestSerialize(value: RequestType): nodeLib.Buffer = js.native
  /**
       * Deserialization function for repsonse data
       */
  def responseDeserialize(data: nodeLib.Buffer): ResponseType = js.native
  /**
       * Serialization function for response values
       */
  def responseSerialize(value: ResponseType): nodeLib.Buffer = js.native
}

