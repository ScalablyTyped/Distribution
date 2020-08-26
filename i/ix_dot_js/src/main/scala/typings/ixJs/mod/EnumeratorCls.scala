package typings.ixJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Enumerator")
@js.native
class EnumeratorCls[T] protected ()
  extends typings.ixJs.Ix.Enumerator[T] {
  def this(moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]) = this()
}

