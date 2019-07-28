package typings.ixDotJs.ixMod

import typings.ixDotJs.IxNs.Enumerable
import typings.ixDotJs.IxNs.Enumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Enumerable")
@js.native
class EnumerableCls[T] protected () extends Enumerable[T] {
  def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
}

