package typings.grpcProtoLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.grpcProtoLoader.mod.ServiceDefinition
    - typings.grpcProtoLoader.mod.MessageTypeDefinition
    - typings.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = typings.grpcProtoLoader.mod._AnyDefinition | typings.grpcProtoLoader.mod.ServiceDefinition
  type Deserialize[T] = js.Function1[/* bytes */ typings.node.Buffer, T]
  type Options = typings.protobufjs.mod.IParseOptions with typings.protobufjs.mod.IConversionOptions with typings.grpcProtoLoader.AnonIncludeDirs
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[typings.grpcProtoLoader.mod.AnyDefinition]
  type Serialize[T] = js.Function1[/* value */ T, typings.node.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typings.grpcProtoLoader.mod.MethodDefinition[js.Object, js.Object]]
}
