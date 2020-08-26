package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeClientMod {
  type Deserialize[T] = js.Function1[/* bytes */ typings.node.Buffer, T]
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[js.Object | typings.grpcGrpcJs.makeClientMod.ProtobufTypeDefinition]
  type Serialize[T] = js.Function1[/* value */ T, typings.node.Buffer]
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ index in keyof ImplementationType ]: @grpc/grpc-js.@grpc/grpc-js/build/src/make-client.MethodDefinition<any, any>}
    */ typings.grpcGrpcJs.grpcGrpcJsStrings.ServiceDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
}
