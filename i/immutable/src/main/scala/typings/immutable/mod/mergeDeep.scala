package typings.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "mergeDeep")
@js.native
object mergeDeep extends js.Object {
  def apply[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
}

