package typings.grpcGrpcJs.makeClientMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerMethodDefinition[RequestType, ResponseType] extends js.Object {
  
  var originalName: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  def requestDeserialize(bytes: Buffer): RequestType = js.native
  @JSName("requestDeserialize")
  var requestDeserialize_Original: Deserialize[RequestType] = js.native
  
  var requestStream: Boolean = js.native
  
  def responseSerialize(value: ResponseType): Buffer = js.native
  @JSName("responseSerialize")
  var responseSerialize_Original: Serialize[ResponseType] = js.native
  
  var responseStream: Boolean = js.native
}
