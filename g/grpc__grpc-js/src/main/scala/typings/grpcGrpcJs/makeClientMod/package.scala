package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeClientMod {
  type Deserialize[T] = js.Function1[/* bytes */ typings.node.Buffer, T]
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[
    typings.grpcGrpcJs.makeClientMod.ServiceDefinition | typings.grpcGrpcJs.makeClientMod.ProtobufTypeDefinition
  ]
  type Serialize[T] = js.Function1[/* value */ T, typings.node.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typings.grpcGrpcJs.makeClientMod.MethodDefinition[js.Any, js.Any]]
}
