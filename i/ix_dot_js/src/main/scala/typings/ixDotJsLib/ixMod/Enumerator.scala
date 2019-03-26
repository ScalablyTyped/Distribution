package typings
package ixDotJsLib.ixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Enumerator")
@js.native
class EnumeratorCls[T] protected ()
  extends ixDotJsLib.IxNs.Enumerator[T] {
  def this(moveNext: js.Function0[scala.Boolean], getCurrent: js.Function0[T], dispose: js.Function0[scala.Unit]) = this()
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def getCurrent(): T = js.native
  /* CompleteClass */
  override def moveNext(): scala.Boolean = js.native
}

