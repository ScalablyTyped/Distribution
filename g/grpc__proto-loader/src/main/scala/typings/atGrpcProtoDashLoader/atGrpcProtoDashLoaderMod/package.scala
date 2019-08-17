package typings.atGrpcProtoDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGrpcProtoDashLoaderMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atGrpcProtoDashLoader.Anon_IncludeDirs
  import typings.node.Buffer
  import typings.protobufjs.protobufjsMod.IConversionOptions
  import typings.protobufjs.protobufjsMod.IParseOptions

  /* Rewritten from type alias, can be one of: 
    - typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.ServiceDefinition
    - typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.MessageTypeDefinition
    - typings.atGrpcProtoDashLoader.atGrpcProtoDashLoaderMod.EnumTypeDefinition
  */
  type AnyDefinition = _AnyDefinition | ServiceDefinition
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  type Options = IParseOptions with IConversionOptions with Anon_IncludeDirs
  type PackageDefinition = StringDictionary[AnyDefinition]
  type Serialize[T] = js.Function1[/* value */ T, Buffer]
  type ServiceDefinition = StringDictionary[MethodDefinition[js.Object, js.Object]]
}
