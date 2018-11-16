package typings
package iferrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iferr", JSImport.Namespace)
@js.native
object iferrMod extends js.Object {
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  def apply[T](
    fail: js.Function1[/* err */ stdLib.Error, scala.Unit],
    succ: js.Function1[/* repeated */T, scala.Unit]
  ): iferrLib.nodeCallback[T] = js.native
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  def iferr[T](
    fail: js.Function1[/* err */ stdLib.Error, scala.Unit],
    succ: js.Function1[/* repeated */T, scala.Unit]
  ): iferrLib.nodeCallback[T] = js.native
  // Prints errors when one is passed, or does nothing otherwise
  // ex: Thing.load(123, printerr)
  def printerr(): iferrLib.nodeCallback[_] = js.native
  // Delegate to the success function on success, throws the error otherwise
  // ex: Thing.load(123, throwerr(thing => ...))
  def throwerr[T](succ: js.Function1[/* repeated */T, scala.Unit]): iferrLib.nodeCallback[T] = js.native
  // Like iferr, but also catches errors thrown from `succ` and passes to `fail`
  def tiferr[T](
    fail: js.Function1[/* err */ stdLib.Error, scala.Unit],
    succ: js.Function1[/* repeated */T, scala.Unit]
  ): iferrLib.nodeCallback[T] = js.native
}

