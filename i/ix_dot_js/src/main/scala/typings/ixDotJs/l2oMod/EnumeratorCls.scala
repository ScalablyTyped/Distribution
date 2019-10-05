package typings.ixDotJs.l2oMod

import typings.ixDotJs.Ix.Enumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("l2o", "Enumerator")
@js.native
class EnumeratorCls[T] protected () extends Enumerator[T] {
  def this(moveNext: js.Function0[Boolean], getCurrent: js.Function0[T], dispose: js.Function0[Unit]) = this()
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getCurrent(): T = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

