package typings
package atGrpcProtoDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protoDashLoaderMod {
  type Deserialize[T] = js.Function1[/* bytes */ nodeLib.Buffer, T]
  type Options = protobufjsLib.protobufjsMod.IParseOptions with protobufjsLib.protobufjsMod.IConversionOptions with atGrpcProtoDashLoaderLib.Anon_IncludeDirs
  type Serialize[T] = js.Function1[/* value */ T, nodeLib.Buffer]
}
