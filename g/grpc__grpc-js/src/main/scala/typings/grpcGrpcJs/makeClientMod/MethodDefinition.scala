package typings.grpcGrpcJs.makeClientMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.grpcGrpcJs.makeClientMod.ServerMethodDefinition because var conflicts: originalName, path, requestStream, responseStream. Inlined responseSerialize, responseSerialize_Original, requestDeserialize, requestDeserialize_Original */ @js.native
trait MethodDefinition[RequestType, ResponseType] extends ClientMethodDefinition[RequestType, ResponseType] {
  @JSName("requestDeserialize")
  var requestDeserialize_Original: Deserialize[RequestType] = js.native
  @JSName("responseSerialize")
  var responseSerialize_Original: Serialize[ResponseType] = js.native
  def requestDeserialize(bytes: Buffer): RequestType = js.native
  def responseSerialize(value: ResponseType): Buffer = js.native
}

