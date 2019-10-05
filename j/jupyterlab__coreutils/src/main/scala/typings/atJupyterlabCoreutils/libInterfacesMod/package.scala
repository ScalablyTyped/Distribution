package typings.atJupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfacesMod {
  import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable

  type IPoll[T, U, V /* <: String */] = IPoll_[T, U, V]
  type IRestorable[T /* <: IObservableDisposable */, U] = IRestorable_[T, U]
  type IRestorer[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] = IRestorer_[T, U, V]
}
