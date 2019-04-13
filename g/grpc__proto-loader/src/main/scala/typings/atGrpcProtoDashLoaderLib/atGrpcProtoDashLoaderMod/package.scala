package typings
package atGrpcProtoDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGrpcProtoDashLoaderMod {
  /* Rewritten from type alias, can be one of: 
    - ServiceDefinition
    - MessageTypeDefinition
    - EnumTypeDefinition
  */
  type AnyDefinition = _AnyDefinition | ServiceDefinition
  type Deserialize[T] = js.Function1[/* bytes */ nodeLib.Buffer, T]
  type Options = protobufjsLib.protobufjsMod.IParseOptions with protobufjsLib.protobufjsMod.IConversionOptions with atGrpcProtoDashLoaderLib.Anon_IncludeDirs
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[AnyDefinition]
  type Serialize[T] = js.Function1[/* value */ T, nodeLib.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[MethodDefinition[js.Object, js.Object]]
}
