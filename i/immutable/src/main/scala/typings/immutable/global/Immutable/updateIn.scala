package typings.immutable.global.Immutable

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.updateIn")
@js.native
object updateIn extends js.Object {
  def apply[C](
    collection: C,
    keyPath: Iterable[_],
    notSetValue: js.Any,
    updater: js.Function1[/* value */ js.Any, _]
  ): C = js.native
  def apply[C](collection: C, keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
}

