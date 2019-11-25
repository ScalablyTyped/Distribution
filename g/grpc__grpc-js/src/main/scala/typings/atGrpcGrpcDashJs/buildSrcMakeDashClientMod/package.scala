package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcMakeDashClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer

  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  type PackageDefinition = StringDictionary[ServiceDefinition | ProtobufTypeDefinition]
  type Serialize[T] = js.Function1[/* value */ T, Buffer]
  type ServiceDefinition = StringDictionary[MethodDefinition[js.Any, js.Any]]
}
