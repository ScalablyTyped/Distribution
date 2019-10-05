package typings.ixDotJs.ixMod

import typings.ixDotJs.Ix.Enumerable
import typings.ixDotJs.Ix.Enumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Enumerable")
@js.native
class EnumerableCls[T] protected () extends Enumerable[T] {
  def this(getEnumerator: js.Function0[Enumerator[T]]) = this()
}

