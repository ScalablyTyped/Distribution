package typings.iferr

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iferr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  def apply[T](fail: js.Function1[/* err */ Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = js.native
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  def iferr[T](fail: js.Function1[/* err */ Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = js.native
  // Prints errors when one is passed, or does nothing otherwise
  // ex: Thing.load(123, printerr)
  def printerr(): nodeCallback[_] = js.native
  // Delegate to the success function on success, throws the error otherwise
  // ex: Thing.load(123, throwerr(thing => ...))
  def throwerr[T](succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = js.native
  // Like iferr, but also catches errors thrown from `succ` and passes to `fail`
  def tiferr[T](fail: js.Function1[/* err */ Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = js.native
  type nodeCallback[T] = js.Function2[/* err */ Error | Null, /* repeated */ T, js.Any]
}

