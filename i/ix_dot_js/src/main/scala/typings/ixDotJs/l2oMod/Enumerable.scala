package typings.ixDotJs.l2oMod

import typings.ixDotJs.IxNs.Enumerable
import typings.ixDotJs.IxNs.Enumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("l2o", "Enumerable")
@js.native
class EnumerableCls[T] protected () extends Enumerable[T] {
  def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
}

