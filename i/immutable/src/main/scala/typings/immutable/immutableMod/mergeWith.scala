package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "mergeWith")
@js.native
object mergeWith extends js.Object {
  def apply[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
}

