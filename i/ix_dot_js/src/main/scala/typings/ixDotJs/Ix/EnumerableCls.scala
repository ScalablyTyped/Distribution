package typings.ixDotJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ix.Enumerable")
@js.native
class EnumerableCls[T] protected () extends Enumerable[T] {
  def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
}

