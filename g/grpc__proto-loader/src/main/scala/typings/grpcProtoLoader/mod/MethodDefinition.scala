package typings.grpcProtoLoader.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDefinition[RequestType, ResponseType] extends js.Object {
  
  var originalName: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  def requestDeserialize(bytes: Buffer): RequestType = js.native
  @JSName("requestDeserialize")
  var requestDeserialize_Original: Deserialize[RequestType] = js.native
  
  def requestSerialize(value: RequestType): Buffer = js.native
  @JSName("requestSerialize")
  var requestSerialize_Original: Serialize[RequestType] = js.native
  
  var requestStream: Boolean = js.native
  
  var requestType: MessageTypeDefinition = js.native
  
  def responseDeserialize(bytes: Buffer): ResponseType = js.native
  @JSName("responseDeserialize")
  var responseDeserialize_Original: Deserialize[ResponseType] = js.native
  
  def responseSerialize(value: ResponseType): Buffer = js.native
  @JSName("responseSerialize")
  var responseSerialize_Original: Serialize[ResponseType] = js.native
  
  var responseStream: Boolean = js.native
  
  var responseType: MessageTypeDefinition = js.native
}
